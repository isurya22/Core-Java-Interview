package StreamAPI;
//The sum of squares of even numbers from a list of integer.

import java.util.Arrays;
import java.util.List;

public class SumSquareOfEven {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int sum = numbers.stream().filter(n->n%2==0).mapToInt(n->n*n).sum();
        System.out.println(sum);
    }
}
