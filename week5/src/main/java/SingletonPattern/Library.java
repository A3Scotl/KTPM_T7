package SingletonPattern;

import FactoryMethodPattern.Book;
import ObserverPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;
    private List<Book> books;
    private List<Observer> observers;

    private Library() {
        books = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }
    public void addBook(Book book) {
        books.add(book);
        notifyObservers("New Book added: " + book.getTitle());
    }
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    public List<Book> getBooks() {
        return books;
    }
}
