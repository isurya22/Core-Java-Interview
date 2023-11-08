package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//Sort Numbers (ASC/DESC) using Streams

public class SortedNumber {
    public static void main(String[] args) {
        List<Integer> noList = Arrays.asList(1,3,10,20,30,15,1,13,1,2,10,40,19,3);
        List<Integer> sortedNumber = noList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumber);
        List<Integer> reverseSortedNumber = noList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedNumber);
    }
}
