public class Funtions3 {

    static String name = "kajal"; // global scope

    public static void main(String[] args) {
        // scope of variable

        int x = 7; // local scope
        int y = 9;
        System.out.println(x + " " + y);

        System.out.println(name);

        if (x == 4) {
            int j = 7;
            System.out.println(j);
        }
    }

}
