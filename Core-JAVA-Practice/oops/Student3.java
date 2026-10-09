public class Student3 {

    // this constructor chaining

    String name;
    String college;
    int rollNo;
    int age;

    Student3() {

        // this.name = "Unknown";
        // this.age = 0;
        // this.rollNo = 0;
        // this.college = "Unknown";

        this("unknown", "unknown", 0, 0);
        System.out.println("I am in first constructor");
    }

    Student3(String name) {
        this(name, "unknown", 0, 0);
        System.out.println("I am in second constructor");

    }

    Student3(String name, String college) {
        this(name, college, 0, 0);
        System.out.println("I am in third constructor");
    }

    Student3(String name, String college, int age) {
        this(name, college, age, 0);
        System.out.println("I am in fourth constructor");

    }

    Student3(String name, String college, int age, int rollNo) {
        this.name = name;
        this.college = college;
        this.age = age;
        this.rollNo = rollNo;
        System.out.println("I am in fifth constructor");
    }

    void markAttendence() { // behaviour -> function -> instance method
        System.out.println("Attendence marked by : " + name);
    }

    void print() {
        System.out.println(name + " " + age + " " + rollNo + " " + college);
    }

}
