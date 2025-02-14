package Entity;

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

    public List<Country> getCountry() {
        return country;
    }

    public void setCountry(List<Country> country) {
        this.country = country;
    }

    public List<Genre> getGenre() {
        return genre;
    }

    public void setGenre(List<Genre> genre) {
        this.genre = genre;
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

    @Override
    public String toString() {
        return "Movie{" +
                "movieID=" + movieID +
                ", nameRUS='" + nameRUS + '\'' +
                ", nameENG='" + nameENG + '\'' +
                ", country=" + country.toString() +
                ", genre=" + genre.toString() +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}



