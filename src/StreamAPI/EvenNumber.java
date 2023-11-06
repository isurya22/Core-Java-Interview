package StreamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> noList = Arrays.asList(7,4,2,1,9,6,12);
        //List<Integer> evenNo = noList.stream().filter(t -> t%2==0).collect(Collectors.toList()); //-----First approach
        noList.stream().filter(t -> t%2==0).forEach(t -> System.out.println(t)); //----Second Approach
        //System.out.println(evenNo);
    }
}
