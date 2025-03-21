package DecoratorPattern;

import FactoryMethodPattern.Book;

public class Borrowing {
    protected Book book;
    protected int dueDays = 14;

    public Borrowing(Book book) {
        this.book = book;
    }
    public String getDetails() {
        return "Borrowing " + book.getTitle() + " for " + dueDays + " days";
    }
}
