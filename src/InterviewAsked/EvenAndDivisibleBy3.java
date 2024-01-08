package InterviewAsked;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Find even number and those even numbers are divisible by 3

public class EvenAndDivisibleBy3 {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1,100).boxed().filter(a->a%2==0 && a%3==0).collect(Collectors.toList());
        System.out.println(numbers);
    }
}
