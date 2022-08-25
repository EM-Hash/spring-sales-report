package edu.wctc.interfaces;

import edu.wctc.objects.Sale;

import java.util.List;

public interface ISalesReport {
    public void GenerateReport(List<Sale> salesList);
}
