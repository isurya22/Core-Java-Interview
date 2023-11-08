package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        List<Integer> noList = Arrays.asList(1,3,10,20,30,15,1,13,1,2,10,40,19,3);

        int max = noList.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        int min = noList.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);
    }
}
