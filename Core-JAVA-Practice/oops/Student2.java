public class Student2 {

    String name;
    int age;
    int rollNumber;
    String college;

    // default constructor
    Student2() {
        super();
    }

    // parameterised constructor
    Student2(int age, int rollNumber, String name, String college) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
        this.college = college;
    }

    void print() {
        System.out.println(name + " " + age + " " + rollNumber + " " + college);
    }

}
