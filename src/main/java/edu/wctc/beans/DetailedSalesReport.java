package edu.wctc.beans;

import edu.wctc.interfaces.ISalesReport;
import edu.wctc.objects.Sale;

import java.util.ArrayList;
import java.util.List;

public class DetailedSalesReport implements ISalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("DETAILED SALES REPORT");
        String[] headers = {"Name", "Country", "Price", "Tax", "Shipping"};
        int width = 64;
        String tableBorder= String.format("+%" + width + "s+", "").replace(' ', '-');
        System.out.println(tableBorder);
        System.out.printf("|%20S|%15S|%9S|%7S|%9S|%n", headers[0], headers[1], headers[2], headers[3], headers[4]);
        System.out.println(tableBorder);
        for(Sale sale : salesList){
            System.out.printf("|%20s|%15s|$%8.2f|$%6.2f|$%8.2f|%n", sale.getCustomer(), sale.getCountry(), sale.getAmount(), sale.getTax(), sale.getShipping());
            System.out.println(tableBorder);
        }
    }
}
