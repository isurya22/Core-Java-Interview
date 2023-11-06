package Functional_Interfaces.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println("It's => "+integer);
    }

    public static void main(String[] args) {
        ConsumerDemo consumerDemo = new ConsumerDemo();
        consumerDemo.accept(10);
    }
}
// Above was our traditional way to write program.
// But I am using Lambda expression then it will be like below program.

class ConsumerDemoCopy{
    public static void main(String[] args) {
       Consumer<Integer> integerConsumer = t-> System.out.println("Print===>>>"+t);
        integerConsumer.accept(100);
    }
}

// Let's suppose I have list of elements then
class ConsumerList{
    public static void main(String[] args) {
        List<Integer> alist = Arrays.asList(1,4,6,2,9,4);
        alist.stream().forEach(k-> System.out.println("Printing: >>>>"+k));
    }



    }


