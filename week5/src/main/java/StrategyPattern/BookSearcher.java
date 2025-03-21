package StrategyPattern;

import FactoryMethodPattern.Book;

import java.util.List;

public class BookSearcher {
    private SearchStrategy strategy;

    public BookSearcher(SearchStrategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }
    public List<Book> search(List<Book> books, String query) {
        return strategy.search(books, query);
    }
}
