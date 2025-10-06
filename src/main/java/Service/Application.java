package Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "Service")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

//
//        ServiceCache serviceCache = new ServiceCache();


//        Movies movies = serviceCache.initFilms();
//        Users users = serviceCache.initUsers();
//        Reviews reviews = serviceCache.initReview();
//        Raitings raitings = serviceCache.initRatings(reviews, movies);
//

        //DatabaseConnection databaseConnection = new DatabaseConnection();

        //SELECT
        //databaseConnection.commentsWrite(reviews.getByMovieName(movies.getMovie(1),users.getUser(1)));
        //databaseConnection.commentFind(reviews.getById(1, 1));
        //databaseConnection.userFind(users.getUser(1));
        //databaseConnection.movieFind(movies.getMovie(3));
        //databaseConnection.ratingFind(raitings.getByMovieName(movies.getMovie(6)));


    }
}