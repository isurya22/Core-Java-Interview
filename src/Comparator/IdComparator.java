package Comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<District> {
    @Override
    public int compare(District o1, District o2) {
        return o1.getDistrictCode()-o2.getDistrictCode();
    }
}
