package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TraverseScenario {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jamuna");
        names.add("Saraswati");
        names.add("Ganga");
        names.add("Mahanandi");
        System.out.println("Before sortig: "+names);

        for (String s :names) {
            System.out.println("For Each: "+s);
        }

        for(int i = 0; i<names.size(); i++){
           String s = names.get(i);
            System.out.println("For loop: "+s);
        }

        // It is forward tarversing.
        Iterator<String> stringIterator = names.iterator();
        while (stringIterator.hasNext()){
            String name = stringIterator.next();
            System.out.println("Whileloop/ iterator : "+name);
        }

        // Now we will do backward traversing.
//        ListIterator<String> listIterator = names.listIterator(names.size());
//        while(listIterator.hasPrevious()) {
//           String s =  listIterator.next();
//            System.out.println("ListIterator/backward tarversing :"+s);
//        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        //forEach method
        names.forEach((nameList) -> System.out.println(nameList));
    }
}
