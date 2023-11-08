package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,5,6,22,3,90,89,2,1,3,4,55,6);
        Optional<Integer> sumNumber = list.stream().reduce((a, b)->a+b);
        System.out.println("Sum is: "+sumNumber.get());
    }
}
