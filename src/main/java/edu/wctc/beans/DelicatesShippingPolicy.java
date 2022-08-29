package edu.wctc.beans;

import edu.wctc.interfaces.IShippingPolicy;
import edu.wctc.objects.Sale;

public class DelicatesShippingPolicy implements IShippingPolicy {
    private double rate = 0.35;
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(sale.getAmount() * rate);
    }
}
