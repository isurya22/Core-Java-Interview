package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Governer {
    public static void main(String[] args) {
        List<District> districts = new ArrayList<>();
        districts.add(new District(11,"Mayurbhanj"));
        districts.add(new District(01,"Balasore"));
        districts.add(new District(14,"Rorkela"));
        districts.add(new District(29,"Kendrapada"));

        System.out.println("Before Sorting: "+districts);
        Collections.sort(districts,new NameComparator());
        System.out.println("After sorting: "+districts);
    }
}
