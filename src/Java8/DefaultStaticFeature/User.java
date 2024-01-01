package Java8.DefaultStaticFeature;

import Java8.DefaultStaticFeature.Payment;
import Java8.DefaultStaticFeature.Paytm;
import Java8.DefaultStaticFeature.PhonePay;

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
