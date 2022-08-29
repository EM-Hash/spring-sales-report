package edu.wctc;

import edu.wctc.beans.*;
import edu.wctc.interfaces.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc")
public class AppConfig {
    @Bean
    public ISalesInput iSalesInput() {return new FileSalesInput();}

    @Bean
    public ISalesReport iSalesReport() {return new DetailedSalesReport();}

    @Bean
    public IShippingPolicy iShippingPolicy() {return new FreeShippingPolicy();}

}
