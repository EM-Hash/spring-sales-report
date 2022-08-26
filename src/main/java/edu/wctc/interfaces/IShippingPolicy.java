package edu.wctc.interfaces;

import edu.wctc.objects.Sale;

public interface IShippingPolicy {
    public void applyShipping(Sale sale);
}
