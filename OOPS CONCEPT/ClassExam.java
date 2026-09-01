class ClassExam{

    // data : data members : instance variable
    int StudentId;
    String StudentName;
    String StudentCity;

    // Behaviour : member methods : method :(function)
    public void study(){
        System.out.println(StudentName + " is studying");
    }

    public void showFullDetails(){
        System.out.println("My name is " + StudentName);
        System.out.println("My id is " + StudentId);
        System.out.println("My city is " + StudentCity);
    }
}