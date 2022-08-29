package edu.wctc;

import edu.wctc.interfaces.ISalesInput;
import edu.wctc.interfaces.ISalesReport;
import edu.wctc.interfaces.IShippingPolicy;
import edu.wctc.objects.Sale;

import java.util.List;

public class SalesReportTool {
    private ISalesInput input;
    private IShippingPolicy shippingPolicy;
    private ISalesReport report;
    private List<Sale> sales;

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
