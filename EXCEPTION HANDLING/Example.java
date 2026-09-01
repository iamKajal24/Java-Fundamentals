public class Example{
    public static void main(String[] args) {
        System.out.println("started...");

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
             int result = (int) n1/n2;
             System.out.println("Division is " + result);
        } catch (Exception e) {
           System.out.println("Exception occured");
           System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I am in finally block");
            System.out.println("closing all the resources");
        }
        System.out.println("Terminated...");
    }
}


class AgeInvalidException extends Exception{

    AgeInvalidException(){
        super("Age is invalid !");
    }

    AgeInvalidException(String message){
        super(message);
    }
}


