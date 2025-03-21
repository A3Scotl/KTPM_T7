package FactoryMethodPattern;

public class Audiobook extends Book {
    public Audiobook(String author, String title, String genre) {
        super(author, title, genre);
    }
    public String getType() {
        return "audiobook";
    }
}
