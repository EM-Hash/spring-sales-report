package edu.wctc;

import edu.wctc.beans.ConsoleSalesInput;
import edu.wctc.beans.DetailedSalesReport;
import edu.wctc.beans.FileSalesInput;
import edu.wctc.beans.FreeShippingPolicy;

public class SalesReportApp {
    public static void main(String[] args) {
        SalesReportTool tool = new SalesReportTool(new FileSalesInput(), new FreeShippingPolicy(), new DetailedSalesReport());
        tool.readSales();
        tool.applyShipping();
        tool.generateReport();
    }
}
