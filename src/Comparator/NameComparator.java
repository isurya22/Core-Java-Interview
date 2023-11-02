package Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<District> {
    @Override
    public int compare(District o1, District o2) {
        return o1.getDistrictName().compareTo(o2.getDistrictName());
    }
}
