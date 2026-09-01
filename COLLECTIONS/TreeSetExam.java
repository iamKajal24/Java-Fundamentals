import java.util.TreeSet;

public class TreeSetExam {

    public static void main(String[] args) {
        
        TreeSet<String> set = new TreeSet<>();

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

        //first or last method-> returns the first or last element in the set
        System.out.println("first : " + set.first());
        System.out.println("last : " + set.last());

        // higher or lower method-> returns the least element in this set strictly greater than the given element, or null if there is no such element.
        System.out.println("higher : " + set.higher("kajal"));
        System.out.println("lower : " + set.lower("kajal"));

        //ceiling or floor method-> returns the least element in this set greater than or equal to the given element, or null if there is no such element.
        System.out.println("ceiling : " + set.ceiling("kajal"));
        System.out.println("floor : " + set.floor("kajal"));

        System.out.println("all elements :" + set);

        // pollFirst or pollLast method-> retrieves and removes the first or last element of this set, or returns null if this set is empty.
        System.out.println("pollFirst : " + set.pollFirst());
        System.out.println("pollLast : " + set.pollLast());

        //clear method-> removes all elements from the set
        set.clear();
        System.out.println("after clear : " + set);


        
    }
    
}
