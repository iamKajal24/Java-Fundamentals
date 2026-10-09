public class EnumEx {

    public static void main(String[] args) {
        // int status = PaymentSuccess.FAILED;
        // System.out.println(status);

        // if(status == Role.ADMIN) {

        // }

        String status = PaymentStatus.SUCCESS;
        System.out.println(status);

        if (status == "success") {

        }
    }

}

// payment status --> success, failed, pending
// final

/*
 * Problems with this approach :
 * 1. Type safety
 * 2. Poor Readability
 * 3. No Grouping od related enitites
 */

class PaymentStatus {
    public static final String SUCCESS = "Success";
    public static final String FAILED = "Failed";
    public static final String PENDING = "Pending";
}

class Role {
    public static final int USER = 1;
    public static final int ADMIN = 2;
    public static final int MANAGER = 2;
}
