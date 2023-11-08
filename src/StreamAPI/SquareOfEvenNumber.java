package StreamAPI;

import java.util.Arrays;
import java.util.List;

// Filter the even numbers and then calculate the square of even numbers

public class SquareOfEvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,2,6,1,7,8,0);
        numbers.stream().filter(t-> t%2==0).map(t->t*t).forEach(t-> System.out.println(t));
    }
}
