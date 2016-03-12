package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by LILO on 2016/03/12.
 */
public class statesHashMapsTest {
    statesHashMaps state1;
    statesHashMaps state2;
    statesHashMaps state3;

    @Before
    public void setUp() throws Exception {
        state1 = new statesHashMaps("CA", "California");
        state2 = new statesHashMaps("AZ", "Arizona");
        state3 = new statesHashMaps("NJ", "New Jersey");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testStatesHashMaps() throws Exception {
        HashMap<String, String> states = new HashMap<String, String>();

        states.put(state1.getCode(), state1.getName());
        states.put(state2.getCode(), state2.getName());
        states.put(state3.getCode(), state3.getName());

        System.out.print("States names " + states + "\n");
        System.out.print("The number of states is: " + states.size() + "\n");

        states.remove("az");
        System.out.print("List of states after removing Arizona " + states + "\n");
        System.out.print("The number of states is now: " + states.size() + "\n");

        states.clear();
        System.out.print("When all states are removes: " + states + "\n");
        System.out.print("The number of states is now: " + states.size() + "\n");

        Assert.assertEquals("AZ", state2.getCode());
    }
}
