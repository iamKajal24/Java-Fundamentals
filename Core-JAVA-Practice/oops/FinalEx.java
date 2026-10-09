public class FinalEx {

    public static void main(String[] args) {
        Randomm r1 = new Randomm();

        System.out.println(r1.PI);

        final int x;
        x = 9;
        System.out.println(x);

    }

}

class Randomm {
    // final double PI = 3.14;

    final double PI;

    Randomm() {
        this.PI = 3.14;
    }

}
