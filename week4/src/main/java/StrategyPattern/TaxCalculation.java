package StrategyPattern;

public class TaxCalculation {
    public static void main(String[] args) {
        Product product1 = new Product(new VATStrategy(), 100);
        System.out.println("VAT: " + product1.getTax());

        Product product2 = new Product(new LuxuryTaxStrategy(), 200);
        System.out.println("Luxury Tax: " + product2.getTax());
    }
}
