package Service;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ratings")
public class controlRating {

    private final RatingRepository ratingRepository;
    private final MovieRepository movieRepository;

    public controlRating(RatingRepository ratingRepository, MovieRepository movieRepository) {
        this.ratingRepository = ratingRepository;
        this.movieRepository = movieRepository;
    }

    @PostMapping("/{movieId}")
    public Rating addRating(@PathVariable int movieId, @RequestBody Rating rating) {
        Movie movie = movieRepository.findById((long) movieId)
                .orElseThrow(() -> new RuntimeException("Movie not found"));

        rating.setMovie(movie);
        movie.setRating(rating);

        return ratingRepository.save(rating);
    }

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable int movieId) {
        return ratingRepository.findById(movieId)
                .orElseThrow(() -> new RuntimeException("Rating not found"));
    }
}
