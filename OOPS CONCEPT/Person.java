public class Person {

    public void showDetails(){
        System.out.println("Basic details of Person");
    }
    
}

class Emp extends Person{

    public void showDetails(){
        System.out.println("Showing the details of the employee");
    }

}

class Ram{
    public void doWork(Person person){
        person.showDetails();
    }
}
