package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
       List<Object> kal = new ArrayList<>();
       kal.add(12);
       kal.add("jash");
       kal.add(14.45);
       kal.add(true);
       kal.add(12.222222);
        System.out.println(kal);

        kal.remove(3);
        System.out.println("After remove: "+kal);

        for (int i = 0; i<kal.size();i++){
             Object object = kal.get(i);
            System.out.println(object);
        }
    }
}
