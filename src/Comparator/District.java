package Comparator;

public class District {
    private int districtCode;
    private String districtName;

    public District(int districtCode, String districtName) {
        this.districtCode = districtCode;
        this.districtName = districtName;
    }

    public int getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(int districtCode) {
        this.districtCode = districtCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @Override
    public String toString() {
        return "District{" +
                "districtCode=" + districtCode +
                ", districtName='" + districtName + '\'' +
                '}';
    }
}
