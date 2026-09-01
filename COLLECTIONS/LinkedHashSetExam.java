import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExam {

    public static void main(String[] args) {
        
        Set<String> set = new LinkedHashSet<>();

        // add method-> adds an element to the set
        set.add("kajal");
        set.add("shubham");
        set.add("khushi");
        set.add("riya");
        set.add("riya"); // duplicate element, will not be added

        System.out.println("set : " + set);

        //get size method-> returns the number of elements in the set
        System.out.println("size : " + set.size());

        // contains method-> returns true if the set contains the specified element, false otherwise
        System.out.println("contains : " + set.contains("riya"));

        //hashCode method-> returns the hash code value for the set
        System.out.println("hashCode : " + set.hashCode());

        //remove method-> removes the specified element from the set
        set.remove("riya");
        System.out.println("after remove : " + set);

        //isEmpty method-> returns true if the set is empty, false otherwise
        System.out.println("is empty : " + set.isEmpty());

        //clear method-> removes all elements from the set
        set.clear();
        System.out.println("after clear : " + set);

        
    }
    
}
