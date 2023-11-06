package Functional_Interfaces.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer h) {
        if(h%2==0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        PredicateDemo j = new PredicateDemo();
        System.out.println(j.test(6));
    }
}

//Now we are making lambda
class PredicateDemo1{
    public static void main(String[] args) {
        Predicate<Integer> l = t -> t%2==0;

        System.out.println(l.test(19));
    }
}
// Now using stream api
class PredicateDemo2 {
    public static void main(String[] args) {
        List<Integer> alist = Arrays.asList(3,1,5,8,9);
        alist.stream().filter(t -> t%2==0).forEach(t-> System.out.println("Prime Number is :"+t));

    }
}
