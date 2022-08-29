package edu.wctc;

import edu.wctc.interfaces.ISalesInput;
import edu.wctc.interfaces.ISalesReport;
import edu.wctc.interfaces.IShippingPolicy;
import edu.wctc.objects.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesReportTool {
    private ISalesInput input;
    private IShippingPolicy shippingPolicy;
    private ISalesReport report;
    private List<Sale> sales;

    @Autowired
    public SalesReportTool(ISalesInput input, IShippingPolicy shippingPolicy, ISalesReport report){
        this.input = input;
        this.shippingPolicy = shippingPolicy;
        this.report = report;
    }

    public void readSales(){
        this.sales = input.getSales();
    }

    public void applyShipping(){
        for (Sale sale: sales) {
            shippingPolicy.applyShipping(sale);
        }
    }

    public void generateReport(){
        report.generateReport(sales);
    }
}
