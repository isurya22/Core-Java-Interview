package Collection.FailFastFailSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentModificationExample {
    public static void main(String[] args) {
        List<String> holdValue = new CopyOnWriteArrayList<>(); //Fail Fast
        //Set<String> holdValue = new CopyOnWriteArraySet<>();
        holdValue.add("SHAH");
        holdValue.add("JASS");
        holdValue.add("KOL");


        for ( String s : holdValue) {
            holdValue.add("BALL");
        }
        System.out.println(holdValue);

//        Iterator<String> hhs = holdValue.iterator();
//        while (hhs.hasNext()){
//            String value = hhs.next();
//            System.out.println("Using iterator method: "+value);
//        }

    }
}
