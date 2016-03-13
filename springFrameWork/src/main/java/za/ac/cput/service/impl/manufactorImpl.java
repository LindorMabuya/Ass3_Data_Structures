package za.ac.cput.service.impl;

import za.ac.cput.domain.invoice;
import za.ac.cput.service.payable;

/**
 * Created by LILO on 2016/03/13.
 */
public class manufactorImpl implements payable {
    public invoice getPaymentAmount(){
        invoice inv = new invoice("M6789","Gear",100,890.00);
        inv.getTotalPrice();
        return inv;
    }
}
