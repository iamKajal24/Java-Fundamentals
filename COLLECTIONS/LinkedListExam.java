import java.util.LinkedList;

public class LinkedListExam {

    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();

        // add method
        name.add("kajal");
        name.add("shubham");
        name.add("khushi");
        name.add("riya");
        name.add("Rohan");
        name.add("shivansh");

        System.out.println("all names : " + name);

        // contains
        System.out.println("contains : " + name.contains("riya") );

        // get
        System.out.println("get : " + name.getFirst());
        System.out.println(name.getLast());
        System.out.println("get index : " + name.get(3));

        // set
        name.set(1, "Shubham chauhan");
        System.out.println("after set : "+name);

        // size
        System.out.println("size : " + name.size());

        // addfirst or addlast
        name.addFirst("Ravi");
        name.addLast("Shyam");

        System.out.println("after add first or last : " + name);

        // removefirst
        System.out.println("remove first : " + name.removeFirst());
        System.out.println("revome last :" + name.removeLast());

        // offerFirst or offerLast
        System.out.println("offerFirst : " + name.offer("kajal"));
        System.out.println(name.offerFirst("kajal"));
        System.out.println(name.offerLast("shyam"));


        System.out.println("real names : " + name);

        // peekFirst or peekLast means return the first or last element of the list without removing it
        System.out.println("peekFirst : " + name.peekFirst());
        System.out.println("peekLast : " + name.peekLast());

        // pollFirst or pollLast means remove and return the first or last element of the list
        System.out.println("pollFirst : " + name.pollFirst());
        System.out.println("pollLast : " + name.pollLast());

        System.out.println("after pollFirst or pollLast : " + name);


    }
    
}
