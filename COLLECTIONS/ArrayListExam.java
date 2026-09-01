import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // add methods
        names.add("kajal");
        names.add("Shubham chauhan");
        names.add("Riya Sharma");
        names.add("Harsh Sharma");
        names.add("Rohit chaudhary");

        System.out.println("old values : " + names);

        System.out.println("List all names :");
        
        // print all names
        for(String n : names){
            System.out.println(n);
        }
        
        // get methods
        System.out.println("get methods : " + names.get(2));

        // set methods
        String namess =  names.set(3, "Harsh patil");
        System.out.println("set methods : " + namess);

        System.out.println("updated value :" +  names);

        // add(index,element)
       names.add(5, "pooja chaudhary");
       System.out.println(names);

        // size
        System.out.println("size methods : " + names.size());

        // contains
        System.out.println("contains methods : "+ names.contains("Shubham chauhan"));

        // indexOf
        System.out.println("indexOf methods  : " + names.indexOf("Riya Sharma"));

        // lastIndexOf
        System.out.println("last indexOf method : " + names.lastIndexOf("pooja chaudhary"));

        // isEmpty

        System.out.println("isEmpty Methods :" + names.isEmpty());

        // remove
        System.out.println("remove method : " + names.remove(0));
        System.out.println("after revome names : "+names);
        
        System.out.println("revome object  : " + names.remove("Harsh Patil"));
        
        // remove last value
        System.out.println("remove last : " + names.removeLast());

        // remove first value
        System.out.println("remove first : " + names.removeFirst());

        // 
        System.out.println("reserved methods  : " + names.reversed());
        System.out.println("all names  : " + names);

        // get first methods
        System.out.println("get first methods : " + names.getFirst());

        //get last methods
        System.out.println("get last methods : " + names.getLast());

        //addFirst value
        names.addFirst("Shubham chauhan");
        System.out.println("Enter real name : " + names);

        // addLast value
        names.addLast("Kajal pandit");
        System.out.println("after adding values : " + names);

        //sublist
        System.out.println("sublist methods : " + names.subList(1, 3));

        //remove
        System.out.println("toString method : " + names.toString());

        // stream method
        System.out.println("Stream method" + names.stream());

        // clear method
        names.clear();
        System.out.println("final names list : " + names);
    }
    
}
