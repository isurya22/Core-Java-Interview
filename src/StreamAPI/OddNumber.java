package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumber {
    public static void main(String[] args) {
        List<Integer> noList = Arrays.asList(7,4,2,1,9,6,12);
        List<Integer> oddNumbers = noList.stream().filter(e->e%2!=0).collect(Collectors.toList());
        System.out.println(oddNumbers);
    }
}
