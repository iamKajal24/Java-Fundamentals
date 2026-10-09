public class EnumEx1 {

    public static void main(String[] args) {
        // int status = PaymentStatus2.SUCCESS;

        // PaymentStatus status = PaymentStatus.FAILED;
        PaymentStatus1 status = PaymentStatus1.FAILED;

        System.out.println(status.name());
    }

}

enum PaymentStatus1 {
    SUCCESS,
    FAILED,
    PENDING;
}

class PaymentStatus2 {
    public static final int SUCCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3;
}