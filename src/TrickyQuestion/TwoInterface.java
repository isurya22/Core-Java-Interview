package TrickyQuestion;
/*
   we have two interfaces I1 and I2, both of which declare a method named m1.
   The Test class implements both I1 and I2, providing its own implementation of m1.
   Can you explain how Java handles the situation when a class implements multiple interfaces with identical method signatures
   and what will be the output of calling the m1 method in the Test class?

 */

interface I1{
    void m1();
}
interface I2{
    void m1();
}

public class TwoInterface implements I1,I2 {

    @Override
    public void m1() {
        System.out.println("m1 method called");
    }
}

class Main{
    public static void main(String[] args) {
        I1 i1 = new TwoInterface();
        i1.m1();
        I2 i2 = new TwoInterface();
        i2.m1();
    }
}

