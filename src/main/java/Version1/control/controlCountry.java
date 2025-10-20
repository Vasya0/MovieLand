package Version1.control;

import Version1.Entity.Country;
import Version1.Repository.CountryRepository;
import Version1.exceptions.countryNotFoundException;
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


    @GetMapping("/{id}")
    public Country getCountryById(@PathVariable int id) {
        return countryRepository.findById(id)
                .orElseThrow(() -> new countryNotFoundException("Country not found"));
    }


    @DeleteMapping("/{id}")
    public void deleteCountry(@PathVariable int id) {
        countryRepository.deleteById(id);
    }
}
