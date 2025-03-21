package FactoryMethodPattern;

public class Ebook extends Book {
    public Ebook(String author, String title, String genre) {
        super(author, title, genre);
    }
    public String getType() {
        return "Ebook";
    }
}
