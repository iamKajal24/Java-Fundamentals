public class JavaVariables {

    public static void main(String[] args) {
        // Integer -> byte->short->int->long

        byte b = 5;
        short s = 10;
        int i = 3000;
        // long l = 400000;
        long l = 12_34_56_6789;

        // Real Number -> float->double

        float f = 10.56f; // single precision
        // double d = 23.08765; // double precision
        double d = 6.022e23; //6.022*10^23

        // Character -> char //'a' -> integer->binary->store

        char c = 'a';

        // boolean ->true,false

        boolean bl = false;

        System.out.println("Integer values -> " + b + " , " + s + " ," + i + " , " + l);
        System.out.println("Floating values " + f + " , " + d);
        System.out.println("character values : " + c);
        System.out.println("boolean values : " + bl);

    }

}
