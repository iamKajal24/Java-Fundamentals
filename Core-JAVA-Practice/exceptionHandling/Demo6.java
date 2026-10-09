package exceptionHandling;

public class Demo6 {

    public static void main(String args[]) {

        try {
            // System.out.println(5 / 0);
            // String str = null;
            // System.out.println(str.length());

            Object obj = new Object();
            String str = (String) obj; // ClassCastException
            System.out.println(str);

        } catch (ArithmeticException e) {
            System.out.println("Divided by zero not allowed");
        } catch (NullPointerException e) {
            System.out.println("Nulls are not allowed");
        } catch (ClassCastException e) {
            System.out.println("Class cast exception occurred");
        } catch (Exception e) {
            System.out.println("Exception handled");
        } catch (Throwable e) {
            System.out.println("Throwable handled");
        }

    }

}
// catch(Exception e){
// System.out.println("Exception handled");
// }

// catch(ArithmeticException e){
// System.out.println("Exception handled");
// }

// Throable is the super class of all the exceptions and errors. It can catch
// any exception or error that occurs in the try block. In this case, it catches
// the ArithmeticException that occurs when trying to divide by zero.s