public class ImmutabeEx1 {

    public static void main(String[] args) {
        College clg = new College("Assam", "IIT G");

        Student4 stu = new Student4(24, "Kajal", clg);

        System.out.println(stu.getAge());
        System.out.println(stu.getName());
        System.out.println(stu.getCollege().name);
        System.out.println(stu.getCollege().address);

        College clg1 = new College("Uttarakhand", "IIT Roorkee");
        System.out.println(stu.getCollege().name + " , " + stu.getCollege().address);
    }
}

// this is completely Immutable classess

// defensive copy of college (non primitive)

final class Student4 {

    private final int age;
    private final String name;
    private final College college;

    public Student4(int age, String name, College college) {
        this.age = age;
        this.name = name;
        this.college = new College(college.name, college.address);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public College getCollege() {
        return new College(college.name, college.address);
    }
}

class College {
    String address;
    String name;

    public College(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
