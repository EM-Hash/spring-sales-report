package edu.wctc.beans;

import edu.wctc.interfaces.IShippingPolicy;
import edu.wctc.objects.Sale;

public class FreeShippingPolicy implements IShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
       sale.setShipping(0);
       return;
    }
}
