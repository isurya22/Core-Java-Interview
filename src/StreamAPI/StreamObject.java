package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //1-Blank
        Stream<Object> emptyObject = Stream.empty();
        emptyObject.forEach(e -> System.out.println(e));

        //2-String,Objects,Collections
        String[] names = {"Rakesh","Anurag","Bikas","Devesh"};
        Stream<String> nameList = Stream.of(names);
        nameList.forEach(t -> System.out.println(t));

        //3-List,set
        List<String> nList = Arrays.asList("Go","Ho","Lo");
        nList.stream().forEach(t -> System.out.println(t));

    }
}
