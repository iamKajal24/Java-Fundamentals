package StreamApi_Learn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodsEx {
	
	public static void main(String[] args) {
		
		//filter(predicate)
		//boolean value function
		//use lambda - e->true
		
		//map(function)
		//each element operation
		//return value
		
		//using filter
		List<String> names = List.of("Aman","Kajal","Aarti","Kamlesh","Riya","John","Amrita");
		List<String> newNames=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		System.out.println(names);
		System.out.println("NewName : " + newNames);
		
		//map
		List<Integer> list = Arrays.asList(34, 12, 45, 56, 3, 74, 36, 100);
		List<Integer> num=list.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(num);
		
		//sorted
		num.stream().sorted().forEach(System.out::println);
		
		 Integer integer=list.stream().min((x,y)->x.compareTo(y)).get();
		 System.out.println(integer);
		 
		 Integer integer2 = list.stream().max((x,y)->x.compareTo(y)).get();
		 System.out.println(integer2);
		
	}
}
