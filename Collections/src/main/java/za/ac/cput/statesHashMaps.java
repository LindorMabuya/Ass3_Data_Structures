package za.ac.cput;

/**
 * Created by LILO on 2016/03/12.
 */
public class statesHashMaps {
    private  String code;
    private  String name;

    public statesHashMaps(String code, String name){
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "States HashMaps{" +
                "state code '" + code + '\'' +
                ", state name '" + name + '\'' +
                '}';    }
}
