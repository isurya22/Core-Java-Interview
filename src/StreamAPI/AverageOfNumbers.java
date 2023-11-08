package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Double avg = list.stream().mapToInt(n->n).average().getAsDouble();
        System.out.println("Average is: "+avg);
    }
}
