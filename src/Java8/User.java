package Java8;

public class User {
    public static void main(String[] args) {
        PhonePay phonePay = new PhonePay();
        phonePay.addCoupon();
        Paytm paytm = new Paytm();
        paytm.doTransaction();
        //We can call static method by interface.
        Payment.generateTransactionReport();
    }
}
