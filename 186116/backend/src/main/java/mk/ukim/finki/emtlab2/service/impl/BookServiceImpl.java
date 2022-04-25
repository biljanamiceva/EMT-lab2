package mk.ukim.finki.emtlab2.service.impl;

import mk.ukim.finki.emtlab2.model.Book;
import mk.ukim.finki.emtlab2.model.dto.BookDto;
import mk.ukim.finki.emtlab2.service.BookService;

import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements BookService {
    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String name) {
        return null;
    }

    @Override
    public List<Book> findByCategory(String category) {
        return null;
    }

    @Override
    public Optional<Book> save(BookDto bookDto) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> edit(Long id, BookDto bookDto) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }
}
