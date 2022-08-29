package edu.wctc.interfaces;

import edu.wctc.objects.Sale;

import java.util.List;

public interface ISalesReport {
    public void generateReport(List<Sale> salesList);
}
