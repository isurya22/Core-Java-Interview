package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimitiveExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(21);
        list.add(25);
        list.add(18);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
