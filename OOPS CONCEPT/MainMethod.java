public class MainMethod {


    public static void main(String[] args) {
        //now creating object of student

        ClassExam ce;
        ce = new ClassExam();

        ce.StudentId=6;
        ce.StudentName="kajal";
        ce.StudentCity="Delhi";

        ClassExam ce2 = new ClassExam();
        ce2.StudentId=7;
        ce2.StudentName="Shubham Chauhan";
        ce2.StudentCity ="Noida";

        ce.study();
        ce.showFullDetails();

        ce2.showFullDetails();

        ConstrutorStudent cs= new ConstrutorStudent(1,"kajal","haridwar","pcm");
        
        cs.display();
    }
    
}
