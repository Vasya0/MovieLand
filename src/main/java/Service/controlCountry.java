package Service;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class controlCountry {



    private final CountryRepository countryRepository;

    public controlCountry(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }



    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryRepository.save(country);
    }


    @GetMapping
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    // Получить страну по id
    @GetMapping("/{id}")
    public Country getCountryById(@PathVariable int id) {
        return countryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Country not found"));
    }

    // Удалить страну
    @DeleteMapping("/{id}")
    public void deleteCountry(@PathVariable int id) {
        countryRepository.deleteById(id);
    }
}
