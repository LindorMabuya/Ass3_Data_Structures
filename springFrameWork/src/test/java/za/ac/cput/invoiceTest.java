package za.ac.cput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.conf.appConfig;
import za.ac.cput.domain.invoice;
import za.ac.cput.service.payable;

/**
 * Created by LILO on 2016/03/13.
 */
public class invoiceTest {
    private payable pay;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new  AnnotationConfigApplicationContext(appConfig.class);
        pay = (payable)ctx.getBean("i");

    }

    @Test
    public void testPayable() throws Exception {
        invoice inv = pay.getPaymentAmount();
        System.out.print("Invoice details: "+ pay.getPaymentAmount().getPartNumber());
        Assert.assertEquals(inv.getPartNumber(),"I12345");
    }
}
