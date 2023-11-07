package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class DupliacteValue {
    public static void main(String[] args) {
        Set<Integer> setNumbers = new HashSet<>();
        setNumbers.add(12);
        setNumbers.add(45);
        setNumbers.add(12);
        setNumbers.add(45);
        setNumbers.add(22);
        setNumbers.add(89);

        System.out.println(setNumbers);
    }
}
