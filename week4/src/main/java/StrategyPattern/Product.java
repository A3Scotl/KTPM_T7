package StrategyPattern;

public class Product {
    private TaxStrategy taxStrategy;
    private double price;

    public Product(TaxStrategy taxStrategy, double price) {
        this.taxStrategy = taxStrategy;
        this.price = price;
    }

    public double getTax() {
        return taxStrategy.calculateTax(price);
    }
}
