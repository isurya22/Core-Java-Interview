package InterviewAsked;

import java.util.Arrays;
import java.util.List;

public class EvenNumberUsingStream {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9);
        values.stream().filter(a -> a%2 == 0).forEach(System.out::println);
    }
}
