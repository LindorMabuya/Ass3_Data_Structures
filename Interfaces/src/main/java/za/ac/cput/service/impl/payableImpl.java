package za.ac.cput.service.impl;

import za.ac.cput.domain.invoice;
import za.ac.cput.service.payable;

/**
 * Created by LILO on 2016/03/13.
 */
public class payableImpl implements payable {
    public invoice getPaymentAmount()
    {
        invoice inv = new invoice("12345","Tire",5,345.00);
        inv.getPaymentAmount();
        return inv;
    }
}
