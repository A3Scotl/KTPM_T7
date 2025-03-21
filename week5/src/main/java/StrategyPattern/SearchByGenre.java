package StrategyPattern;

import FactoryMethodPattern.Book;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByGenre implements SearchStrategy {
    @Override
    public List<Book> search(List<Book> books, String query) {
        return books.stream()
                .filter(book -> book.getGenre().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }
}
