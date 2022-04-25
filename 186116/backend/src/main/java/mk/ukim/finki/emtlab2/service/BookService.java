package mk.ukim.finki.emtlab2.service;

import mk.ukim.finki.emtlab2.model.Book;
import mk.ukim.finki.emtlab2.model.dto.BookDto;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();

    Optional<Book> findById(Long id);

    Optional<Book> findByName(String name);

    List<Book> findByAuthor(String name);

    List<Book> findByCategory(String category);

    Optional<Book> save(BookDto bookDto);

    Optional<Book> edit(Long id, BookDto bookDto);

    void deleteById(Long id);
}
