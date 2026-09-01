import java.util.ArrayList;

public class ComparableExam {

    public static void main(String[] args) {
    
        //create an array of integers
       ArrayList<Employee> list = new ArrayList<>();
       list.add(new Employee(1, "kajal", "IT"));
       list.add(new Employee(2, "shubham", "HR"));
       list.add(new Employee(3, "khushi", "Finance"));
       list.add(new Employee(4, "riya", "IT"));
       list.add(new Employee(5,"Amrita","HR"));

       for(Employee e :list){
        System.out.println(e.toString());
       }

       //comparable interface is used to sort the list of employees based on their id
       System.out.println("after sorting based on id : "+list);
       
       

    }
    
}
