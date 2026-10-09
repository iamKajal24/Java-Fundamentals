public class TypeConversion {

    public static void main(String[] args) {

        // implicit conversion

        int i = 24;
        long l;
        l = i;
        System.out.println(l);

        char c = 'a';
        int d;
        d = c;
        System.out.println(d);

        // Explicit Conversion

        int a = 34;
        byte b;
        b = (byte) a;
        System.out.println(b);

        // truncate converstion

        float f = 45.987f;
        long ll;
        ll = (long) f;
        System.out.println(ll);

        // Boolean to data type
        // these conversion are not possible

        // Automatic type promotion

        byte bb = 42;
        char cc = 'b';
        short ss = 1024;
        int ii = 50000;
        float ff = 5.67f;
        double dd = 0.1234;

        double result = (ff * bb) + (ii / cc) - (dd * ss);

        // f*b ->f
        // i/c ->integer
        // d*s->double

        System.out.println((ff * bb) + " + " + (ii / cc) + " - " + (dd * ss));
        System.out.println("result = " + result);

    }

}
