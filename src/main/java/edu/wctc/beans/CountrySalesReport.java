package edu.wctc.beans;

import edu.wctc.interfaces.ISalesReport;
import edu.wctc.objects.Sale;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountrySalesReport implements ISalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        String[] headers = {"Country", "Amount", "Tax", "Shipping"};
        int width = 45;

        System.out.println("COUNTRY SALES REPORT");

        String tableBorder= String.format("+%" + width + "s+", "").replace(' ', '-');
        System.out.println(tableBorder);

        System.out.printf("|%15S|%9S|%9S|%9S|%n", headers[0], headers[1], headers[2], headers[3]);
        System.out.println(tableBorder);

        List<String> countries  = new ArrayList<>();

        //Get all the countries in the salesList
        for(Sale sale : salesList){
            String country = sale.getCountry();
            if(!countries.contains(country)){
                countries.add(country);
            }
        }

        for(String country : countries){
            double amount = 0;
            double shipping = 0;
            double tax = 0;
            List<Sale> countrySales = salesList.stream().filter(sale -> sale.getCountry()
                    .equals(country)).collect(Collectors.toList());
            for(Sale sale : countrySales){
                amount += sale.getAmount();
                shipping += sale.getShipping();
                tax += sale.getTax();
            }

            System.out.printf("|%15s|$%8.2f|$%8.2f|$%8.2f|%n", country, amount, shipping, tax);
            System.out.println(tableBorder);
        }
    }
}
