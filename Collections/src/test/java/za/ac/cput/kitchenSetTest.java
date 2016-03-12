package za.ac.cput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by LILO on 2016/03/12.
 */
public class kitchenSetTest {
    kitchenSet appliances;

    @Before
    public void setUp() throws Exception {
        appliances = new kitchenSet("forks");
    }

    @Test
    public void testKitchenSet() throws Exception {
        Set <String> set = new HashSet<String>();

        set.add("pots");
        set.add("knives");
        set.add("pans");
        set.add(appliances.getAppliance());

        System.out.print("Kitchen set list: " + set + "\n" );
        System.out.print("Number of appliances in the set is: " + set.size() + "\n");

        set.remove("pans");
        System.out.print("Kitchen set after removing one appliance: " + set + "\n");
        System.out.print("current number of appliances is: " + set.size());

        Assert.assertEquals("forks", appliances.getAppliance());
    }
}
