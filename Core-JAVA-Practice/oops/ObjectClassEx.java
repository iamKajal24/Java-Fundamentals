import java.util.Objects;

public class ObjectClassEx {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student6 stu = new Student6();
        stu.name = "kajal";
        stu.age = 26;

        Student6 s1 = new Student6();
        s1.name = "kajal";
        s1.age = 26;

        System.out.println(stu.toString());
        System.out.println(stu.equals(s1));
        System.out.println(stu.hashCode() == s1.hashCode());

        System.out.println(stu.getClass().getName());

        System.out.println(stu instanceof Object);

        Student6 s2 = (Student6) stu.clone();
        System.out.println(s2.name + " , " + s2.age);

    }

}

// instanceOf operator -> Check if an object is instance of a class or any of
// its subclass

class Student6 extends Object implements Cloneable {

    String name;
    int age;

    @Override
    public String toString() {
        return (name + " , " + age);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Student6 s = (Student6) obj;
        return (this.name == s.name && this.age == s.age);
    }

    @Override
    public int hashCode() {
        // int result = 17;
        // result = result * 31 + age;
        // result = result * 31 + (name != null ? name.hashCode() : 0);
        // return result;

        return Objects.hash(name, age);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
