package Collection.FailFastFailSafe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeDemo2 {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> list = new ConcurrentHashMap<String,Integer>();
        list.put("kake",1);
        list.put("kolly",3);
        list.put("home",7);
        Iterator iterator = list.keySet().iterator();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            System.out.println(key+":"+list.get(key));
            // This will reflect in iterator.
            // This means it has not created separate copy of objects
            list.put("urmi",8);
        }
    }
}
