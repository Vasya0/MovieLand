import java.util.List;

public class Movie {
    private int movieID;
    private String nameRUS;
    private String nameENG;
    private List<Country> country;
    private List<Genre> genre;
    private int year;
    private String description;
    private double price;

    public Movie(int movieID, String nameRUS, String nameENG, List<Country> country, List<Genre> genre, int year, String description, double price) {
        this.movieID = movieID;
        this.nameRUS = nameRUS;
        this.nameENG = nameENG;
        this.country = country;
        this.genre = genre;
        this.year = year;
        this.description = description;
        this.price = price;
    }
}



