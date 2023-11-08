package StreamAPI;
//Print Numbers Starts With Prefix 2 using Streams

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith {
    public static void main(String[] args) {
        List<Integer> noList = Arrays.asList(2,222,234,567,890,432,235,211,22);
        List<Integer> num = noList.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).map(e->Integer.valueOf(e)).collect(Collectors.toList());
        System.out.println(num);

        //Let's suppose there -4 then
        List<Integer> noList2 = Arrays.asList(2,-422,234,567,890,432,235,211,22);
        List<Integer> num2 = noList2.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("-4")|| e.startsWith("4")).map(e->Integer.valueOf(e)).collect(Collectors.toList());
        System.out.println(num2);
    }
}
