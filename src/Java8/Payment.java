package Java8;

public interface Payment {

    /** ignore if you don't want to add any addCoupon feature in any of your implementation
     *  static method is used to for transactionId purpose case
     */

    default void addCoupon() {
        System.out.println("Any platform will provide Cashback.");
    }

    static void generateTransactionReport() {
        System.out.println("generate each Transaction report");
    }
}
