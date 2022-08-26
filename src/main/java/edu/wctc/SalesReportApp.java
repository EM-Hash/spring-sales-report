package edu.wctc;

import edu.wctc.beans.ConsoleSalesInput;
import edu.wctc.beans.DetailedSalesReport;
import edu.wctc.beans.FreeShippingPolicy;
import edu.wctc.interfaces.ISalesInput;

public class SalesReportApp {
    public static void main(String[] args) {
        SalesReportTool tool = new SalesReportTool(new ConsoleSalesInput(), new FreeShippingPolicy(), new DetailedSalesReport());
        tool.readSales();
        tool.applyShipping();
    }
}
