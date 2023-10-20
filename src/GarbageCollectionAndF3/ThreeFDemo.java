package GarbageCollectionAndF3;

public class ThreeFDemo {
    public final int age = 18;

    public void m1() {
        // age = 17;     //Here we can't reassign
        try{
            System.out.println("try block");
        } finally {
            System.out.println("Finally block");   //we can write try-catch-finally and try-finally
        }
        /** we actually write finally block to clean up activity .
         * in real time JDBC connection close purpose we use there.
         */
    }

    protected void finalize(){
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        ThreeFDemo threeFDemo = new ThreeFDemo();
        threeFDemo.m1();
        threeFDemo = null;
        System.gc();
    }
}
