package FactoryMethodPattern;

public class PhysicalBook extends Book {
    public PhysicalBook(String author, String title, String genre) {
        super(author, title, genre);
    }
    public String getType() {
        return "physicalBook";
    }
}
