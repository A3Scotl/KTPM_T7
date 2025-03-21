package FactoryMethodPattern;

public abstract class Book {
    protected String title;
    protected String author;
    protected String genre;

    public Book(String title, String author, String genre) {
        this.author = author;
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public abstract String getType();
}
