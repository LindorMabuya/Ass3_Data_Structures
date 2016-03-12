package za.ac.cput;

/**
 * Created by LILO on 2016/03/12.
 */
public class kitchenSet {
    private String appliance;

    public kitchenSet(String appliance){
        this.appliance = appliance;
    }

    public void setAppliance(String appliance) {
        this.appliance = appliance;
    }

    public String getAppliance() {
        return appliance;
    }

    @Override
    public String toString() {
        return "Kitchen set{" +
                "Appliance='" + appliance + "}";

    }
}
