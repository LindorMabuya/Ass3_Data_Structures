package za.ac.cput.service.impl;

import za.ac.cput.domain.invoice;
import za.ac.cput.service.payable;

/**
 * Created by LILO on 2016/03/13.
 */
public class supplierImpl implements payable {
    public invoice getPaymentAmount(){
        invoice inv = new invoice("S54321","Tire",4,500.00);
        inv.getTotalPrice();
        return inv;
    }
}
