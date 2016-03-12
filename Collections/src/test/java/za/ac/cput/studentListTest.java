package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LILO on 2016/03/12.
 */
public class studentListTest {
    studentList student1;
    studentList student2;
    studentList student3;

    @Before
    public void setUp() throws Exception {
        student1 = new studentList("Cindy Smith", "Design");
        student2 = new studentList("Ben Thompson", "Electrical Engineering");
        student3 = new studentList("Mandy Brown", "Film");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testStudentList() throws Exception {
        List studList = new ArrayList();

        studList.add(student1.getName());
        studList.add(student2.getName());
        studList.add(student3.getName() + "\n");

        System.out.print("Student register: " + studList + "\n");
        System.out.print("The number of registered students is: " + studList.size() + "\n");

        studList.remove(0);
        System.out.print("Student register after one student drops out: " +studList);
        System.out.print("The number of registered students now is: " + studList.size());

        Assert.assertEquals("Cindy Smith", student1.getName());
    }
}
