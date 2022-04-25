package mk.ukim.finki.emtlab2.repository;

import mk.ukim.finki.emtlab2.model.Author;
import mk.ukim.finki.emtlab2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByName(String name);

    List<Book> findAllByAuthor(Author author);

    List<Book> findAllByCategory(String category);
}
