public class Employee {

    int empId;
    String empName;
    String empLocation;
    double empSalary;


    public Employee(){
        this(76);
        System.out.println("Creating object");
    }

    public Employee(int id){
        System.out.println("this is parameterized constructor");
    }

    public Employee(int empId,String empName,String empLocation,double empSalary){
        this.empId = empId;
        this.empName=empName;
        this.empLocation=empLocation;
        this.empSalary=empSalary;
    }

    public void display(){
        System.out.println("id here :  = " + empId );
        System.out.println("name here : = " + empName);
        System.out.println("locations here : = " + empLocation);
        System.out.println("salary here : = " + empSalary);
    }
    
}
