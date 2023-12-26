package Collection.FailFastFailSafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastDemo {
    public static void main(String[] args) {
        Map<String,String> empValue = new HashMap<String,String>();
        empValue.put("Smith","New York");
        empValue.put("Rock","San Fransico");
        empValue.put("Jack","New Maxico");

        Iterator emp = empValue.keySet().iterator();
        while(emp.hasNext()){
            System.out.println(empValue.get(emp.next()));

            empValue.put("Jaga","Puri");
        }
    }
}
