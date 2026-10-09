class Student {
    String name; // information/data/characterstics -> instance variable
    int age;
    int rollNumber;
    String college;

    void markAttendence() { // behaviour -> function -> instance method
        System.out.println("Attendence marked by : " + name);
    }

    void print() {
        System.out.println(name + " " + age + " " + rollNumber + " " + college);
    }

   
}