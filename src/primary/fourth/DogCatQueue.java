package primary.fourth;

import java.util.LinkedList;
import java.util.Queue;

public class DogCatQueue {

	public static class Pet{
		private String type;
		
        public Pet(String type){
            this.type = type;
        }
        
        public String getPetType(){
            return this.type;
        }
	}
	
	public class Dog extends Pet{
        public Dog(){
            super("dog");
        }
    }
    
    public class Cat extends Pet{
        public Cat(){
            super("cat");
        }
    }
    
    public class PetEntryQueue{
    	private Pet pet;
    	private long count;
    	
    	public PetEntryQueue(Pet pet, long count) {
    		this.pet = pet;
    		this.count = count;
    	}
    	
    	public long getCount() {
    		return this.count;
    	}
    	
    	public Pet getPet() {
			return this.pet;
		}
    
    }
    
    public class DogAndCatQueue{
    	private Queue<PetEntryQueue> dogQueue;
    	private Queue<PetEntryQueue> catQueue; 
    	long count;
    	
    	public DogAndCatQueue() {
    		this.dogQueue = new LinkedList<DogCatQueue.PetEntryQueue>();
    		this.catQueue = new LinkedList<DogCatQueue.PetEntryQueue>();
    		this.count = 0;
    	}
    	
    	public void add(Pet pet) {
			if (pet.getPetType().equals("dog")) {
				this.dogQueue.add(new PetEntryQueue(pet, count++));
			}else if (pet.getPetType().equals("cat")) {
				this.catQueue.add(new PetEntryQueue(pet, count++));
			}else {
				throw new RuntimeException("err, not dog or cat");
			}
		}
    	
    	public Pet pollAll() {
			while (!this.dogQueue.isEmpty() && !this.catQueue.isEmpty()) {
				if (this.dogQueue.peek().getCount() < this.catQueue.peek().getCount()) {
					return (Dog)this.dogQueue.poll().getPet();
				}else {
					return (Cat)this.catQueue.poll().getPet();
				}
			}
			while (!this.dogQueue.isEmpty()) {
				return (Dog)this.dogQueue.poll().getPet();
			}
			while (!this.catQueue.isEmpty()) {
				return (Cat)this.catQueue.poll().getPet();
			}
			throw new RuntimeException("err, queue is empty");
		}
    	
    	public Pet pollCat() {
    		if (this.catQueue.isEmpty()) {
				throw new RuntimeException("err, queue is empty");
			}
    		return (Cat)catQueue.poll().getPet();
    	}
    	
    	public Pet pollDog() {
    		if (this.dogQueue.isEmpty()) {
				throw new RuntimeException("err, queue is empty");
			}
    		return this.dogQueue.poll().getPet();
    	}
    	
    	public boolean isEmpty() {
//    		if (this.dogQueue.isEmpty() && this.catQueue.isEmpty()) {
//				return true;
//			}
//    		return false;
    		
    		return this.dogQueue.isEmpty() && this.catQueue.isEmpty();
    	}
    	
    	public boolean isDogEmpty() {
//    		if (this.dogQueue.isEmpty()) {
//				return true;
//			}
//    		return false;
    		return this.dogQueue.isEmpty();
    	}
    	
    	public boolean isCatEmpty() {
//			if (this.catQueue.isEmpty()) {
//				return true;
//			}
//			return false;
    		return this.catQueue.isEmpty();
		}
    }
}
