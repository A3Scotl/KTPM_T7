package SingletonPattern;

import DecoratorPattern.*;
import FactoryMethodPattern.*;
import ObserverPattern.*;
import StrategyPattern.*;

public class LibraryManagement {
    static Book[] books;

    public static void main(String[] args) {
        Library library = Library.getInstance();
        library.registerObserver(new User("An Dep Trai"));
        dataModel();
        for (Book book : books) library.addBook(book);
        System.out.println("\nSearch Results: ");
        new BookSearcher(new SearchByTitle()).search(library.getBooks(), "e")
                .forEach(b -> System.out.println(b.getTitle()));
        System.out.println("\nBorrowing Details:");
        for (Book book : books) {
            System.out.println(new ExtendedBorrowing(new Borrowing(book)).getDetails());
        }
    }
    public static void dataModel() {
        books = new Book[]{
                BookFactory.createBook("audiobook", "Dai ca ra tu", "Nguyen An", "Manhwa"),
                BookFactory.createBook("ebook", "Anh trai say gex", "An Nguyen", "Manhwa"),
                BookFactory.createBook("physical", "LO bi la be", "Auyen Nguyen", "YeuWa")
        };
    }
}