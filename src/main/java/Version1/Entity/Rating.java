package Version1.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "ratings")
public class Rating {
    @Id
    @Column(name = "movieid")
    private int movieId;
    private double IMDb;
    private int critics;
    private double rate;



    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "movieid")
    @JsonBackReference
    private Movie movie;

    public Rating() {

    }
    public Rating(int movieId,double  rate) {

        this.movieId = movieId;
        this.rate=rate;
    }



    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public double getIMDb() {
        return IMDb;
    }

    public void setIMDb(double IMDb) {
        this.IMDb = IMDb;
    }

    public int getCritics() {
        return critics;
    }

    public void setCritics(int critics) {
        this.critics = critics;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "movieId=" + movieId +
                ", IMDb=" + IMDb +
                ", critics=" + critics +
                ", rate=" + rate +
                '}';
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
