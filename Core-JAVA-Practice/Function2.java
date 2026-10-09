public class Function2 {

    public static void main(String[] args) {
        fun();
        System.out.println("bye");
    }

    static void fun() {
        fun1();
    }

    static void fun1() {
        fun2();
        System.out.println("hi");
    }

    static void fun2() {
        fun3();
        System.out.println("hello");
    }

    static void fun3() {
        System.out.println("How are you");

    }

}
