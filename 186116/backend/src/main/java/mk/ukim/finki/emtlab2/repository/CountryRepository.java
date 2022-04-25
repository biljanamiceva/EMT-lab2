package mk.ukim.finki.emtlab2.repository;

import mk.ukim.finki.emtlab2.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long> {
    Optional<Country> findByName(String name);

    List<Country> findAllByNameLike(String name);

    List<Country> findAllByContinent(String continent);

}
