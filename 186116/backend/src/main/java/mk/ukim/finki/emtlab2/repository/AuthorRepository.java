package mk.ukim.finki.emtlab2.repository;

import mk.ukim.finki.emtlab2.model.Author;
import mk.ukim.finki.emtlab2.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findAllByName(String name);

    List<Author> findAllBySurname(String surname);

    List<Author> findAllByCountry(Country country);

    Optional<Author> findAuthorByNameAndSurname(String name, String surname);

    Optional<Author> findAuthorByName(String name);
}
