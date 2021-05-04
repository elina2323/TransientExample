package javalessons;

public class OMobile {

    private String address;
    private String activity;
    private String CEO;

    public OMobile(String address, String activity, String CEO) {
        this.address = address;
        this.activity = activity;
        this.CEO = CEO;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }

    @Override
    public String toString() {
        return "OMobile{" +
                "address='" + address + '\'' +
                ", activity='" + activity + '\'' +
                ", CEO='" + CEO + '\'' +
                '}';
    }
}
