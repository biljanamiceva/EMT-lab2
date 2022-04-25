package mk.ukim.finki.emtlab2.service.impl;

import mk.ukim.finki.emtlab2.model.Author;
import mk.ukim.finki.emtlab2.model.dto.AuthorDto;
import mk.ukim.finki.emtlab2.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Override
    public List<Author> findAll() {
        return null;
    }

    @Override
    public Optional<Author> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Author> findByName(String name) {
        return null;
    }

    @Override
    public List<Author> findBySurname(String surname) {
        return null;
    }

    @Override
    public List<Author> findByCountry(String country) {
        return null;
    }

    @Override
    public Author findByNameAndSurname(String name, String surname) {
        return null;
    }

    @Override
    public Optional<Author> save(AuthorDto authorDto) {
        return Optional.empty();
    }

    @Override
    public Optional<Author> edit(Long id, AuthorDto authorDto) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }
}
