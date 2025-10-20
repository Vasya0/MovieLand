package Version1;

import Version1.Entity.*;
import Version1.Repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataLoader {
    private static final Logger log = LoggerFactory.getLogger(DataLoader.class);


        // твой код

    @Bean
    CommandLineRunner initDatabase(
            UserRepository userRepo,
            CountryRepository countryRepo,
            GenreRepository genreRepo,
            MovieRepository movieRepo,
            RatingRepository ratingRepo,
            CommentRepository commentRepo
    ) {
        return args -> {
            log.info("🚀 Начинаем загрузку данных...");
            try {

            ratingRepo.deleteAll();
            movieRepo.deleteAll();
            genreRepo.deleteAll();
            countryRepo.deleteAll();
            userRepo.deleteAll();
            commentRepo.deleteAll();


            userRepo.saveAll(List.of(
                    new User(1, "Admin", "admin1@gmail.com", "pass1"),
                    new User(2, "Watcher", "admin2@gmail.com", "pass2"),
                    new User(3, "Observer", "observer@gmail.com", "pass3"),
                    new User(4, "Alex", "alex@gmail.com", "pass4")
            ));
            genreRepo.deleteAll();

            if (countryRepo.count() == 0) {
                Country usa = new Country("USA");
                Country uk = new Country("UK");
                Country france = new Country("France");
                countryRepo.saveAll(List.of(usa, uk, france));
            }

            if (genreRepo.count() == 0) {
                Genre drama = new Genre("Drama");
                Genre crime = new Genre("Crime");
                Genre thriller = new Genre("Thriller");
                Genre fantasy = new Genre("Fantasy");
                genreRepo.saveAll(List.of(drama, crime, thriller, fantasy));
            }
//            countryRepo.save(usa);
//            countryRepo.save(uk);
//            countryRepo.save(France);

//            genreRepo.save(drama);
//            genreRepo.save(crime);
//            genreRepo.save(thriler);
//            genreRepo.save(fantasy);
            if (movieRepo.count() == 0) {

                Country usa = countryRepo.findByName("USA").orElseThrow();
                Country uk = countryRepo.findByName("UK").orElseThrow();
                Genre drama = genreRepo.findByName("Drama").orElseThrow();
                Genre crime = genreRepo.findByName("Crime").orElseThrow();
                Genre fantasy = genreRepo.findByName("Fantasy").orElseThrow();

            Movie movie = new Movie();
            movie.setNameRUS("Побег из Шоушенка");
            movie.setNameENG("The Shawshank Redemption");
            movie.setYear(1994);
            movie.setPrice(9.99);
            movie.setDescription("История Энди Дюфрейна, осуждённого за убийство, которого он не совершал.");
//countries
            movie.setCountries(List.of(usa, uk));
            movie.setGenres(List.of(drama, crime));
//rating

            Rating rating = new Rating();
            rating.setMovie(movie);
            rating.setIMDb(9.3);
            rating.setCritics(91);
            rating.setRate(95);


            rating.setMovie(movie);
            movie.setRating(rating);

            movieRepo.save(movie);

            //movie 2
            Movie movie2 = new Movie();
            movie2.setNameRUS("Зелёная миля");
            movie2.setNameENG("The Green Mile");
            movie2.setYear(1999);
            movie2.setPrice(8.99);
            movie2.setDescription("Пол Эджкомб не верил в чудеса, пока не столкнулся с заключённым Джоном Коффи, обладающим даром исцеления.");


            movie2.setCountries(List.of(usa));


            movie2.setGenres(List.of(drama, fantasy));


            Rating rating2 = new Rating();
            rating2.setIMDb(8.6);
            rating2.setCritics(82);
            rating2.setRate(93);
            rating2.setMovie(movie2);

            movie2.setRating(rating2);


            movieRepo.save(movie2);
            }

//            User user1 = userRepo.getReferenceById(1L);
//
//            Comment comment = new Comment();
//            comment.setMovie(movie);
//            comment.setUser(user1);
//            comment.setMovie(movie);
//            comment.setUser(user1);
//            comment.setDescription("Один из лучших фильмов всех времён!");
//            comment.setRate(10);
//
//            commentRepo.save(comment);

            System.out.println("data loaded successfully");
        } catch (Exception e) {
                log.error("Ошибка при загрузке!", e);
            }
        };
    }
}
