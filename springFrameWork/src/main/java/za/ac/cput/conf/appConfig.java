package za.ac.cput.conf;

import za.ac.cput.service.impl.invoiceImpl;
import za.ac.cput.service.impl.manufactorImpl;
import za.ac.cput.service.impl.supplierImpl;
import za.ac.cput.service.payable;

/**
 * Created by LILO on 2016/03/13.
 */
public class appConfig {

    @Bean(name="i")
    public payable getInvoice(){
        return new invoiceImpl();
    }

    @Bean(name="m")
    public payable getManufactor(){
        return new manufactorImpl();
    }
    @Bean(name="s")
    public payable getSupplier(){
        return new supplierImpl();
    }
}
