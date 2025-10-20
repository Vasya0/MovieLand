

import java.sql.*;
import java.util.List;
@Deprecated
public class DatabaseConnection {
//    private Connection connection;
//
//
//   // private String url = "jdbc:mysql://localhost:3306/Films";
//    //private String user = "root";
//    //private String password = "NewSecurePassword";
//    //private String url = "jdbc:mysql://localhost::8082/Films";
//   private String url = "jdbc:h2:~/test";
//   //private String user = "NEWUSER";
//   private String user = "sa";
//   //private String password = "p";
//    private String password = "";
//
//    public DatabaseConnection() {
//
//
//        try {
//            // Class.forName("org.h2.Driver");
//
//            this.connection = DriverManager.getConnection(url, user, password);
//            //Main.logger.info("conection to "+url +" open");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    //Users
//    public void userWrite(User user) {
//
//
//        String insertSQL = "INSERT INTO FILMS.USERS (UserId,userName,password,email) VALUES ('" + user.getUserId() + "','" + user.getUsername() + "','" + user.getPassword() + "','" + user.getEmail() + "');";
//        try {
//            Statement stmt = connection.createStatement();
//            stmt.execute(insertSQL);
//            System.out.println("Inserted data into 'users'.");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    public void userFind(User user) {
//
//
//        String selectSQL = "SELECT * FROM FILMS.users WHERE userID=" + user.getUserId() + ";";
//
//        try {
//
//            Statement stmt = connection.createStatement();
//            ResultSet resultSet = stmt.executeQuery(selectSQL);
//            while (resultSet.next()) {
//                int userId = resultSet.getInt("userId");
//                String userName = resultSet.getString("userName");
//                String password = resultSet.getString("password");
//                String email = resultSet.getString("email");
//
//                System.out.println("userId: " + userId + ", UserName: " + userName + ", password: " + password + ", email: " + email);
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    public void userDelete(User user) {
//
//
//        String selectSQL = "DELETE FROM users WHERE userID=" + user.getUserId() + ";";
//
//        try {
//            Statement stmt = connection.createStatement();
//
//            stmt.execute(selectSQL);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    //comments
//    public void commentWrite(Comment comment) {
//
//
//        String insertSQL = "INSERT INTO FILMS.comments (movieId,userId,description,rate) VALUES ('" + comment.getMovieId() + "','" + comment.getUserId() + "','" + comment.getDescription() + "','" + comment.getRate() + "');";
//        try {
//            System.out.println(insertSQL);
//            Statement stmt = connection.createStatement();
//            stmt.execute(insertSQL);
//            System.out.println("Inserted data into 'comments'.");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    public void commentFind(Comment comment) {
//
//
//
//        String selectSQL = "SELECT * FROM FILMS.comments WHERE userID=" + comment.getUserId() + ";";
//
//        try {
//
//            Statement stmt = connection.createStatement();
//            ResultSet resultSet = stmt.executeQuery(selectSQL);
//            while (resultSet.next()) {
//                int movieId = resultSet.getInt("movieId");
//                int userId = resultSet.getInt("userId");
//                String description = resultSet.getString("description");
//                int rate = resultSet.getInt("rate");
//
//
//                System.out.println("movieId: " + movieId + ", userId: " + userId + ", description: " + description + ", rate: " + rate);
//            }
//        }
//        catch (SQLException e) {
//
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    public void commentDelete(Comment comment) {
//
//
//        String deleteSQL = "DELETE FROM FILMS.comments WHERE userID=" + comment.getUserId() + "AND movieId="+ comment.getMovieId()+";";
//
//        try {
//            System.out.println(deleteSQL);
//            Statement stmt = connection.createStatement();
//
//            stmt.execute(deleteSQL);
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//    //raiting
//    public void ratingWrite(Rating rating) {
//
//
//        String insertSQL = "INSERT INTO FILMS.ratings (movieId,IMDb,critics,rate) VALUES ('" + rating.getMovieId() + "','" + rating.getIMDb() + "','" + rating.getCritics() + "','" + rating.getRate() + "');";
//        try {
//            Statement stmt = connection.createStatement();
//            stmt.execute(insertSQL);
//            System.out.println("Inserted data into 'ratings'.");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//    public void ratingDelete(Rating rating) {
//
//
//        String deleteSQL = "DELETE FROM FILMS.comments WHERE userID=" + rating.getMovieId()+";";
//
//        try {
//            Statement stmt = connection.createStatement();
//            stmt.execute(deleteSQL);
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//    public void ratingFind(Rating rating) {
//
//
//        String selectSQL = "SELECT movieId,IMDb,critics,rate FROM FILMS.ratings WHERE movieId=" + rating.getMovieId() + ";";
//
//        try {
//
//            Statement stmt = connection.createStatement();
//            ResultSet resultSet = stmt.executeQuery(selectSQL);
//            while (resultSet.next()) {
//                int movieId = resultSet.getInt("movieId");
//               Double IMDb = resultSet.getDouble("IMDb");
//                int critics = resultSet.getInt("critics");
//                Double rate = resultSet.getDouble("rate");
//
//
//
//
//                System.out.println("movieId: " + movieId + ", IMDb: " + IMDb + ", critics: " + critics + ", email: " + rate);
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    //movies
//    public void initGenres() {
//       String insertSQL = "INSERT INTO FILMS.genres (genreId,name) VALUES (1,'Thriller');";
//        // String insertSQL = "INSERT INTO FILMS.genres (genreId,name) VALUES (2,'Drama');";
//        //  String insertSQL = "INSERT INTO FILMS.GENRES (genreId,name) VALUES (3,'Crime');";
//        try {
//            System.out.println(insertSQL);
//            Statement stmt = connection.createStatement();
//            stmt.execute(insertSQL);
//            System.out.println("Inserted data into 'genres'.");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    public void initCountries() {
//        String insertSQL = "INSERT INTO FILMS.countries (countryId,name) VALUES (1,'USA');";
//        // String insertSQL = "INSERT INTO FILMS.countries (countryId,name) VALUES (2,'Canada');";
//        // String insertSQL = "INSERT INTO FILMS.COUNTRIES (countryId,name) VALUES (3,'Great Britain');";
//        try {
//            Statement stmt = connection.createStatement();
//            stmt.execute(insertSQL);
//            System.out.println("Inserted data into 'countries'.");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//
//    public void writeMovie(Movie movie) {
//
////        String insertSQL = "INSERT INTO FILMS.MOVIES (movieId,nameRUS,nameENG,yearr,description,price) VALUES ('" + movie.getMovieID() + "','" + movie.getNameRUS() + "','" + movie.getNameENG() + "','" + movie.getYear() + "','" + movie.getDescription() + "','" + movie.getPrice() + "');";
////
////        List<Country> countries = movie.getCountry();
////        List<Genre> genres = movie.getGenre();
////
////
////        try {
////            Statement stmt = connection.createStatement();
////            stmt.execute(insertSQL);
////            for (int i = 0; i < countries.size(); i++) {
////                System.out.println(countries.get(i).getCountryID());
////                String insertCountriesSQL = "INSERT INTO FILMS.movieCountry (movieId,countryID) VALUES ('" + movie.getMovieID() + "','" + countries.get(i).getCountryID() + "');";
////                stmt.execute(insertCountriesSQL);
////
////            }
////            for (int i = 0; i < genres.size(); i++) {
////
////                String insertGenreSQL = "INSERT INTO FILMS.movieGenre (movieId,genreID) VALUES ('" + movie.getMovieID() + "','" + genres.get(i).getId() + "');";
////                stmt.execute(insertGenreSQL);
////            }
////            System.out.println("Inserted data into 'movies'.");
////        } catch (SQLException e) {
////            throw new RuntimeException(e);
////        }
////
////    }
////
////    public void movieFind(Movie movie) {
////
////
////        String selectSQL = "SELECT * FROM FILMS.movies m LEFT JOIN FILMS.movieCountry c on m.movieId=c.movieId  LEFT JOIN FILMS.movieGenre g on c.movieId=g.movieId  WHERE  m.movieId=" + movie.getMovieID() + ";";
////
////        try {
////
////            Statement stmt = connection.createStatement();
////
////            ResultSet resultSet = stmt.executeQuery(selectSQL);
////            while (resultSet.next()) {
////                int id = resultSet.getInt("movieId");
////                String nameRus = resultSet.getString("nameRus");
////                String nameEng = resultSet.getString("nameEng");
////                int year = resultSet.getInt("year");
////                String description = resultSet.getString("description");
////                int price = resultSet.getInt("price");
////                int countryId = resultSet.getInt("countryId");
////                int genreID = resultSet.getInt("genreID");
////
////
////                System.out.println("movieId: " + id + ", nameRus: " + nameRus + ", nameEng: " + nameEng + ", year: " + year + ", description: " + description + ", price: " + price + ", countryId: " + countryId + ", genreID: " + genreID);
////            }
////
////        } catch (SQLException e) {
////            throw new RuntimeException(e);
////        }
////
//   }
//
//
}
