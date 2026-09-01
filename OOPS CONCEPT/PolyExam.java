public class PolyExam {


    public static void main(String[] args) {
        System.out.println("This is just testing");

        Stud st = new Stud();
        st.read();

        // this is compile time polymorphism
        st.read("Geeta");
        st.write("daily routine");

        Person per1 = new Person();
        per1.showDetails();

        Person person = new Emp();
        person.showDetails();

        Ram r= new Ram();
        r.doWork(person);
    }
    
}
