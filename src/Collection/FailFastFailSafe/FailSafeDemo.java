package Collection.FailFastFailSafe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(new Integer[]{1,23,3,4,44});
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Integer integer = (Integer) iterator.next();
            System.out.println(integer);
            if(integer == 23){
                list.add(15); //This will not print.
                //It will store in separate copy of the collection.
            }
        }
    }
}
