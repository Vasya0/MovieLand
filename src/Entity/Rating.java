package Entity;

public class Rating {
    private int movieId;
    private double IMDb;
    private int critics;
    private double rate;


    public Rating(int movieId,double  rate) {
        this.movieId = movieId;
        this.rate=rate;
    }

    public Rating() {

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

    public void setRate(int rate) {
        this.rate = rate;
    }
}
