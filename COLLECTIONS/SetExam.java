import java.util.HashSet;
import java.util.Set;

public class SetExam {

    public static void main(String[] args) {
        
        Set<Integer> set = new HashSet<>();

        // add method-> adds an element to the set
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(40); // duplicate element, will not be added
        set.add(50);

        System.out.println("set : " + set);

        //get size method-> returns the number of elements in the set
        System.out.println("size : " + set.size());

        // contains method-> returns true if the set contains the specified element, false otherwise
        System.out.println("contains : " + set.contains(30));
        System.out.println("contains : " + set.containsAll(set)); // not applicable for set

        //retainAll method-> retains only the elements in the set that are contained in the specified collection
        Set<Integer> set1 = new HashSet<>();
        set1.add(30);
        set1.add(40);
        set.retainAll(set1);
        System.out.println("after retainAll : " + set);

        // remove method-> removes the specified element from the set
        set.remove(30);
        System.out.println("after remove : " + set);

        //size method-> returns the number of elements in the set
        System.out.println("size : " + set.size());

        //isEmpty method-> returns true if the set is empty, false otherwise
        System.out.println("is empty : " + set.isEmpty());

        //equals method-> returns true if the set is equal to the specified object, false otherwise
        System.out.println("equals : " + set.equals(set1));

        //hashCode method-> returns the hash code value for the set
        System.out.println("hashCode : " + set.hashCode());

        //clear method-> removes all elements from the set
        set.clear();
        System.out.println("after clear : " + set);

    }
    
}
