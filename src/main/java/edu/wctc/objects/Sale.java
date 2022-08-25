package edu.wctc.objects;

public class Sale {
    String customer;
    String country;
    Double amount;
    Double tax;
    Double shipping;

    //Constructor
    //Since shipping has to be calculated, it's not expected to be available when the Sale is constructed
    //It's also the only item that needs to be set after the Sale is constructed
    public Sale(String customer, String country, Double amount, Double tax){
        this.customer = customer;
        this.country = country;
        this.amount = amount;
        this.tax = tax;
    }

    //Getters
    public String getCustomer() {
        return customer;
    }

    public String getCountry() {
        return country;
    }

    public Double getAmount() {
        return amount;
    }

    public Double getTax() {
        return tax;
    }

    public Double getShipping() {
        return shipping;
    }

    //Setters
    public void setShipping(double shipping){
        this.shipping = shipping;
    }
}
