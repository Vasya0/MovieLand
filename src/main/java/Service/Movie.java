package Service;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "MOVIES")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieID;

    @Column(name = "NAMERUS")
    private String nameRUS;

    @Column(name = "NAMEENG")
    private String nameENG;
    @Column(name = "\"year\"")
    private int year;
    private String description;
    private double price;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "MOVIECOUNTRY", // таблица связей
            joinColumns = @JoinColumn(name = "MOVIEID"),
            inverseJoinColumns = @JoinColumn(name = "COUNTRYID")
    )
    private List<Country> countries;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "MOVIEGENRE", // таблица связей
            joinColumns = @JoinColumn(name = "MOVIEID"),
            inverseJoinColumns = @JoinColumn(name = "GENREID")
    )
    private List<Genre> genres;


    @OneToOne(mappedBy = "movie", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Rating rating;



    public List<Country> getCountries() {
        return countries;
    }
//    public List<Country> getCountry() {
//        return countries;
//    }


    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public List<Genre> getGenres() {
        return genres;
    }
//    public List<Genre> getGenre() {
//        return genres;
//    }
    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getNameRUS() {
        return nameRUS;
    }

    public void setNameRUS(String nameRUS) {
        this.nameRUS = nameRUS;
    }

    public String getNameENG() {
        return nameENG;
    }

    public void setNameENG(String nameENG) {
        this.nameENG = nameENG;
    }
    //private List<Country> country;
    //private List<Genre> genre;


    public void setCountry(List<Country> country) {
        this.countries = country;
    }


    public void setGenre(List<Genre> genre) {
        this.genres = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Movie() {
    }

//    public Movie(int movieID, String nameRUS, String nameENG, List<Country> country, List<Genre> genre, int year, String description, double price) {
//        this.movieID = movieID;
//        this.nameRUS = nameRUS;
//        this.nameENG = nameENG;
//        this.country = country;
//        this.genre = genre;
//        this.year = year;
//        this.description = description;
//        this.price = price;
//    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieID=" + movieID +
                ", nameRUS='" + nameRUS + '\'' +
                ", nameENG='" + nameENG + '\'' +
//                ", country=" + country.toString() +
//                ", genre=" + genre.toString() +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}



