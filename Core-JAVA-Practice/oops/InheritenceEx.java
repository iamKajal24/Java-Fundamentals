public class InheritenceEx {

    /* parent(superClass) --> child(subclass) */

    public static void main(String[] args) {

        EngineerStudent e1 = new EngineerStudent();
        e1.markAttendence();
        e1.attendLab();

    }
}

class Stu {
    String name;
    int age;

    void markAttendence() {
        System.out.println("Attendence marked");
    }
}

class EngineerStudent extends Stu {
    void attendLab() {
        System.out.println("lab attend");
    }
}
