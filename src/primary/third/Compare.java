package primary.third;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Compare {

	public static class Student {
		public String name;
		public int id;
		public int age;
		
		public Student(String name, int id, int age) {
			this.name = name;
			this.id = id;
			this.age = age;
		}
		
	}
	
	public static class IdAscendingCompare implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.id - o2.id;
		}
		
	}
	public static void main(String[] args) {
		Student student1 = new Student("A", 1, 2);
		Student student2 = new Student("B", 2, 3);
		Student student3 = new Student("C", 3, 4);
		
		Student[] arr = new Student[]{student3, student2, student1};
		Arrays.sort(arr, new IdAscendingCompare());
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].name+"\t"+arr[i].id+"\t"+arr[i].age);
		}
		PriorityQueue<Student> heap = new PriorityQueue<>(new IdAscendingCompare());
		heap.add(student3);
		heap.add(student2);
		heap.add(student1);
		while (!heap.isEmpty()) {
			Student student = heap.poll();
			System.out.println(student.name + student.age + student.id);
		}
	}
	
}
