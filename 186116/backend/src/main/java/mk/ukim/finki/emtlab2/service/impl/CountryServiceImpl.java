package mk.ukim.finki.emtlab2.service.impl;

import mk.ukim.finki.emtlab2.model.Country;
import mk.ukim.finki.emtlab2.model.dto.CountryDto;
import mk.ukim.finki.emtlab2.service.CountryService;

import java.util.List;
import java.util.Optional;

public class CountryServiceImpl implements CountryService {

    @Override
    public List<Country> findAll() {
        return null;
    }

    @Override
    public Optional<Country> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Country> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Country> findByContainingName(String name) {
        return null;
    }

    @Override
    public List<Country> findByContinent(String continent) {
        return null;
    }

    @Override
    public Optional<Country> save(CountryDto countryDto) {
        return Optional.empty();
    }

    @Override
    public Optional<Country> edit(Long id, CountryDto countryDto) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }
}
