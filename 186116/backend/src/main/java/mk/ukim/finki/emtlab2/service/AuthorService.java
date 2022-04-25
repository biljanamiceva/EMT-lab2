package mk.ukim.finki.emtlab2.service;

import mk.ukim.finki.emtlab2.model.Author;
import mk.ukim.finki.emtlab2.model.dto.AuthorDto;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> findAll();

    Optional<Author> findById(Long id);

    List<Author> findByName(String name);

    List<Author> findBySurname(String surname);

    List<Author> findByCountry(String country);

    Author findByNameAndSurname(String name, String surname);

    Optional<Author> save(AuthorDto authorDto);

    Optional<Author> edit(Long id, AuthorDto authorDto);

    void deleteById(Long id);
}
