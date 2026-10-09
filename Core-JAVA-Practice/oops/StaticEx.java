public class StaticEx {

    public static void main(String[] args) {

        Stud s1 = new Stud("kajal", 24, 101);
        Stud s2 = new Stud("Karan", 27, 102);

        // Stud.college = "IIT guhati";

        System.out.println(s1.name + " , " + s1.age + " ," + s1.rollNo + " , " + Stud.college);
        System.out.println(s2.name + " , " + s2.age + " ," + s2.rollNo + " , " + Stud.college);

    }

}

class Stud {
    String name;
    int age;
    int rollNo;
    static String college;

    // static String college = "IIT Ghuhati";

    Stud(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // static block
    static {
        college = "IIT Guhati";
    }

}
