package FactoryMethodPattern;

public class BookFactory {
    public static Book createBook(String type, String title, String author, String genre) {
        switch (type.toLowerCase()) {
            case "physical": return new PhysicalBook(title, author, genre);
            case "ebook": return new Ebook(title, author, genre);
            case "audiobook": return new Audiobook(title, author, genre);
            default: throw new IllegalArgumentException("Unknown Book type");
        }
    }
}
