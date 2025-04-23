package JavaConversionPrograms;

public class DoubletoString {

    public static void main(String[] args) {

        double num = 123.456;
        String str1 = String.valueOf(num);
        String str2 = Double.toString(num);

        // Output
        System.out.println("Double to String using String.valueOf(): " + str1);
        System.out.println("Double to String using Double.toString(): " + str2);
    }
}
