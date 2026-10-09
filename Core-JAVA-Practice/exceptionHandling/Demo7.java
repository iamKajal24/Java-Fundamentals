package exceptionHandling;

public class Demo7 {

    public static void main(String args[]) {

        try {
            checkEligibility(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("Age: " + e.getAge());
        }

    }

    private static void checkEligibility(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Not eligible to vote", age);

        } else {
            System.out.println("Eligible to vote");
        }

    }

}

class InvalidAgeException extends Exception {

    private int age;
    public InvalidAgeException(String message,int age) {
        super(message);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
