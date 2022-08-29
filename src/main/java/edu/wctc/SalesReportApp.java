package edu.wctc;

import edu.wctc.beans.*;

public class SalesReportApp {
    public static void main(String[] args) {
        SalesReportTool tool = new SalesReportTool(new FileSalesInput(), new DelicatesShippingPolicy(), new DetailedSalesReport());
        tool.readSales();
        tool.applyShipping();
        tool.generateReport();
    }
}
