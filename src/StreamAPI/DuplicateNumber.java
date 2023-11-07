package StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(34,21,63,22,34,45,22,56,87,63,99);
        Set<Integer> setValues = new HashSet<>();
        /* 1) one way
        Set<Integer> duplicate = number.stream().filter(n->!setValues.add(n)).collect(Collectors.toSet());
        System.out.println(duplicate);
        *
         */
        number.stream().filter(t->!setValues.add(t)).forEach(System.out::println);
    }
}
