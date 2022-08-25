package edu.wctc;

import edu.wctc.beans.ConsoleSalesInput;
import edu.wctc.interfaces.ISalesInput;

public class SalesReportApp {
    public static void main(String[] args) {
        ISalesInput input = new ConsoleSalesInput();
        input.getSales();
    }
}
