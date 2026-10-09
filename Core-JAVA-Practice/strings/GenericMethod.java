package strings;

public class GenericMethod {

    public static void main(String[] args) {
        Integer intValue = (Integer) getResult(10);
        System.out.println(intValue + 5);

        //type inference
        printPair("Hello", 10);
        printPair(3.14, true);
    }

    public static <T> T getResult(T obj) { // <T> type is paraameter
        return obj;
    }

    public static <T, U> void printPair(T first, U second) {
        System.out.println("First: " + first + ", Second: " + second);
    }

}
