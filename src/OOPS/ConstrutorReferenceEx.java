package OOPS;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student1 {
	private String name;
	private int age;

	public Student1(String name) {
		super();
		this.name = name;
		// this.age = age;
	}

	public Student1() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}

public class ConstrutorReferenceEx {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Kajal", "Riya", "John", "Sam");
//		List<String> uNames = names.stream().map(String::toUpperCase).toList();
//		uNames.forEach(System.out::println);

		List<Student1> students = new ArrayList<Student1>();

//		for (String name : names) {
//			students.add(new Student1(name));
//		}

		// using stream api

//		students = names.stream()
//				.map(name -> new Student1(name)) //this is method references
//				.toList();

//		or
		students = names.stream()
				.map(Student1::new) // this is construtor references
				.toList();

		System.out.println(students);
	}

}
