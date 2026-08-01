public class logicalIfElse {
    
    public static void main(String[] args) {
        
        System.out.println("Logical AND operator");
        boolean a =false;
        boolean b=false;

        if(a&&b){
            System.out.println("both a and b are true");
        }
        else{
            System.out.println("both a and b are not true");
        }

        System.out.println("Logical OR operator");
        boolean a1 = false;
        boolean b1=true;
        if(a1||b1){
            System.out.println("either a1 or b1 is true");
        }
        else{
            System.out.println("either a1 or b1 is not true");
        }

        System.out.println("for Not Operator");

        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);


    }
}
