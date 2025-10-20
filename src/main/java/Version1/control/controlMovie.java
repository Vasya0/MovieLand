package Version1.control;

import Version1.Entity.Movie;
import Version1.Repository.MovieRepository;
import Version1.exceptions.movieNotFoundException;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/movies")

public class controlMovie {
    private final MovieRepository movieRepository;

    public controlMovie(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @GetMapping
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }



    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new movieNotFoundException("Movie not found"));
    }
}