class Main {
    public static void main(String[] args) {

        // object classes

        /*
         * Student s1 = new Student();
         * s1.age = 21;
         * s1.college = "UU";
         * s1.name = "kajal";
         * s1.rollNumber = 101;
         * 
         * Student s2 = new Student();
         * s2.age = 26;
         * s2.college = "UUD";
         * s2.name = "Riya";
         * s2.rollNumber = 103;
         * 
         * s1.markAttendence();
         * s2.markAttendence();
         * 
         * s1.print();
         * s2.print();
         */

        // Start Constructor -> to create an object

        // Student2 stu = new Student2();
        // System.out.println(stu.age);
        // System.out.println(stu.college);
        // System.out.println(stu.name);
        // System.out.println(stu.rollNumber);

        // Student2 st = new Student2(45, 106, "Aditya", "Delhi college");
        // st.print();

        // Constructor chaining

        Student3 st = new Student3("kajal");
        Student3 st1 = new Student3("Aditya", "UU");
        Student3 st3 = new Student3("Shubham", "UU", 25);
        Student3 st4 = new Student3("Khushi", "UU", 20, 101);
        Student3 st5 = new Student3();

        st.print();
    }
}
