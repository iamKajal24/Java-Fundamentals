import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExam {

    public static void main(String[] args) {
        
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "kajal", "IT"));
        list.add(new Student(2, "shubham", "HR"));
        list.add(new Student(3, "khushi", "Finance"));
        list.add(new Student(4, "riya", "IT"));
        list.add(new Student(5, "Amrita", "Marketing"));
        list.add(new Student(6, "Lalita",  "LLB"));

        for(Student s : list){
            System.out.println(s.toString());
        }

        //comparator interface is used to sort the list of students based on their id
        Collections.sort(list, new idComparator());
        System.out.println("after sorting based on id : " + list);


        ArrayList<Student> list1 = new ArrayList<>();
        list1.addAll(list);
        Collections.sort(list1, new nameCompartor());
        System.out.println("after sorting based on name : " + list1);

        System.out.println("***************************");
        System.out.println("Maximum student based on id : " + Collections.max(list,new idComparator()));

        System.out.println("Minimum student based on name : " + Collections.min(list,new nameCompartor()));

 }
    
}
