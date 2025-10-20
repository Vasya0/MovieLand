package Version1.control;

import Version1.Entity.Genre;
import Version1.Repository.GenreRepository;
import Version1.exceptions.genreNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class controlGenre {

    private final GenreRepository genreRepository;

    public controlGenre(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }


    @PostMapping
    public Genre addGenre(@RequestBody Genre genre) {
        return genreRepository.save(genre);
    }


    @GetMapping
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }


    @GetMapping("/{id}")
    public Genre getGenreById(@PathVariable int id) {
        return genreRepository.findById(id)
                .orElseThrow(() -> new genreNotFoundException("Genre not found"));
    }

    @DeleteMapping("/{id}")
    public void deleteGenre(@PathVariable int id) {
        genreRepository.deleteById(id);
    }
}
