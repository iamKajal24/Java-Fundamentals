import java.util.Vector;

public class VectorExam {

    public static void main(String[] args) {
        Vector<String> name = new Vector<>();

        // add method
        name.add("kajal");
        name.add("shubham");
        name.add("khushi");
        name.add("riya");
        System.out.println("all names : " + name);

        // contains
        System.out.println("contains : " + name.contains("riya") );

        // get
        System.out.println("get : " + name.get(0));
        System.out.println("get index : " + name.get(3));

        // set
        name.set(1, "Shubham chauhan");
        System.out.println("after set : "+name);

        // size
        System.out.println("size : " + name.size());

        // remove
        System.out.println("remove : " + name.remove(0));
        
        System.out.println("after remove : " + name);

        // addAll
        Vector<String> name1 = new Vector<>();
        name1.add("Ravi");
        name1.add("Shyam");

        name.addAll(name1);
        System.out.println("after addAll : " + name);

        //subList
        System.out.println("subList : " + name.subList(1, 3));

        //remove first or last
        System.out.println("remove first : " + name.remove(0));
        System.out.println("remove last : " + name.remove(name.size()-1));
        System.out.println("after remove first or last : " + name);

        // clear
        name.clear();
        System.out.println("after clear : " + name);
    }
    
}
