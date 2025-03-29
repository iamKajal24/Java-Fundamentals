package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public int compareTo(Employee that) {

		if (this.id > that.id)
			return 1;
		else {
			return -1;
		}
	}

}

public class ComparatorVsComparable {

	public static void main(String[] args) {

//		Comparator<Employee> com = new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee i, Employee j) {
//				if (i.id > j.id)
//					return 1;
//				else {
//					return -1;
//				}
//			}
//		};
		
		// using lambda expressions
		
		Comparator<Employee> com = (Employee i, Employee j)-> {
			return i.id>j.id?1:-1;	
		};

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(100, "Karan"));
		emp.add(new Employee(30, "Kamlesh"));
		emp.add(new Employee(50, "Rani"));
		emp.add(new Employee(45, "Roopam"));

		Collections.sort(emp, com);

		System.out.println(emp);
	}

}

//Comparator<Integer> com = new Comparator<Integer>() {
//
//	@Override
//	public int compare(Integer i, Integer j) {
//		if (i % 10 > j % 10)
//			return 1;
//		else {
//			return -1;
//		}
//	}
//};
//
//List<Integer> nums = new ArrayList<>();
//nums.add(100);
//nums.add(30);
//nums.add(50);
//nums.add(45);
//
//Collections.sort(nums, com);
//
//System.out.println(nums);
