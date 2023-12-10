package InterviewAsked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
  find only duplicate elements with its count from the String ArrayList in Java8?

   "AA", "BB", "AA", "CC"
 */
public class DulicateElements
{
    public static void main(String[] args) {
        ArrayList<String> values = new ArrayList<>(Arrays.asList("AA", "BB", "AA", "CC"));
        Map<String, Long> results = values.stream().filter(x -> Collections.frequency(values, x) > 1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(results);
    }

}
