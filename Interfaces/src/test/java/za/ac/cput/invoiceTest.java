package za.ac.cput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.invoice;
import za.ac.cput.service.impl.payableImpl;
import za.ac.cput.service.payable;

/**
 * Created by LILO on 2016/03/13.
 */
public class invoiceTest {
    private payable pay;

    @Before
    public void setUp() throws Exception {
       pay = new payableImpl();
    }

    @Test
    public void testInvoice() throws Exception {
        invoice slip = pay.getPaymentAmount();
        System.out.print("Complete Invoice slip\n" + "---------------------------\n" + pay.getPaymentAmount() + "\n");
        System.out.print("Total amount due: " + slip.getPaymentAmount());
        Assert.assertEquals(slip.getPartNumber(),"12345");
    }
}
