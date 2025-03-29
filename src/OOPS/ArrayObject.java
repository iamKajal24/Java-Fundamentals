package OOPS;

class Student {
	int rollno;
	String name;
	int marks;
}

public class ArrayObject {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.rollno = 1;
		s1.name = "kajal";
		s1.marks = 78;

		Student s2 = new Student();
		s2.rollno = 5;
		s2.name = "Riya";
		s2.marks = 88;

		Student s3 = new Student();
		s3.rollno = 10;
		s3.name = "Priyanka Kumari";
		s3.marks = 98;

		Student student[] = new Student[3];
		student[0] = s1;
		student[1] = s2;
		student[2] = s3;

//		for (int i = 0; i < student.length; i++) {
//			System.out.println(student[i].rollno + " - " + student[i].name + " : " + student[i].marks + " ");
//		}
		
		for(Student stud : student) {
			System.out.println(stud.rollno + " - "+ stud.name+" : "+ stud.marks);
		}

		int nums[] = new int[4];
	    nums[0] = 4;
	    nums[1] = 5;
	    nums[2] = 7;
	    nums[3] = 9;
	    
	   for(int n : nums) {
		   System.out.print(n + " ");
	   }
	}
}
