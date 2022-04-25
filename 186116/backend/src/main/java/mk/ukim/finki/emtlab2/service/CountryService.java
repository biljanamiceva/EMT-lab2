package mk.ukim.finki.emtlab2.service;

import mk.ukim.finki.emtlab2.model.Country;
import mk.ukim.finki.emtlab2.model.dto.CountryDto;

import java.util.List;
import java.util.Optional;

public interface CountryService {

    List<Country> findAll();

    Optional<Country> findById(Long id);

    Optional<Country> findByName(String name);

    List<Country> findByContainingName(String name);

    List<Country> findByContinent(String continent);

    Optional<Country> save(CountryDto countryDto);

    Optional<Country> edit(Long id, CountryDto countryDto);

    void deleteById(Long id);

}
