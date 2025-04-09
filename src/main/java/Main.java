import Entity.*;
import Service.*;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ServiceCache serviceCache = new ServiceCache();

        Movies movies = serviceCache.initFilms();
        Users users = serviceCache.initUsers();
        Reviews reviews = serviceCache.initReview();
        Raitings raitings = serviceCache.initRatings(reviews, movies);


        DatabaseConnection databaseConnection = new DatabaseConnection();
        //INSERT
        //databaseConnection.initGenres();
        // databaseConnection.initCountries();
        //databaseConnection.userWrite(users.getUser(3));
        //databaseConnection.userDelete(users.getUser(2));
        //databaseConnection.commentWrite(reviews.getByMovieName(movies.getMovie(2),users.getUser(1)));
        //databaseConnection.writeMovie(movies.getMovie(6));
        //databaseConnection.ratingWrite(raitings.getByMovieName(movies.getMovie(6)));


        //SELECT
        //databaseConnection.commentsWrite(reviews.getByMovieName(movies.getMovie(1),users.getUser(1)));
        //databaseConnection.commentFind(reviews.getById(1, 1));
        //databaseConnection.userFind(users.getUser(1));
        //databaseConnection.movieFind(movies.getMovie(3));
        //databaseConnection.ratingFind(raitings.getByMovieName(movies.getMovie(6)));


    }


}
