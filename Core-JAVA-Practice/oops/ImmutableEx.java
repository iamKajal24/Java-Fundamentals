public class ImmutableEx {

    public static void main(String[] args) {

        College clg = new College("Uttarakhand", "IIT");

        // Student4 stu = new Student4(24, "Kajal", clg);

        // System.out.println(stu.getAge());
        // System.out.println(stu.getName());
        // System.out.println(stu.getCollege().name);
        // System.out.println(stu.getCollege().address);

        College clg1 = new College("Assam", "IIT G");

        Student4 stu = new Student4(24, "Kajal", clg1);

        System.out.println(stu.getAge());
        System.out.println(stu.getName());
        System.out.println(stu.getCollege().name);
        System.out.println(stu.getCollege().address);

    }

}

// Immutable not pure
final class Student4 {

    private final int age;
    private final String name;
    private final College college;

    public Student4(int age, String name, College college) {
        this.age = age;
        this.name = name;
        this.college = college;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public College getCollege() {
        return college;
    }

}

class College {
    String address;
    String name;

    public College(String address, String name) {
        this.address = address;
        this.name = name;
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
