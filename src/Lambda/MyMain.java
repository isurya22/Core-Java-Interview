package Lambda;

import java.sql.SQLOutput;

public class MyMain {
    public static void main(String[] args) {
//        MyInter myInter = new MyInterImpl();
//        myInter.myMethod();
       // 1) Directly we can write lambda what you want to print.
        MyInter myInter = ()-> System.out.println("This is first print");
        myInter.myMethod();

        MyInter myInter1 = () -> System.out.println("This is second print");
        myInter1.myMethod();



    }
}
