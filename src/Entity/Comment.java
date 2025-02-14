package Entity;

public class Comment {
    private int movieId;
    private int userId;

    private String description;



    private int rate;
    //like самого коментария
    //private int like;
    //boolean positive;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public Comment(int movieId, int userId, String description, int rate) {
        this.movieId = movieId;
        this.userId = userId;
        this.description = description;
        this.rate = rate;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }



    public int getMovieId() {
        return movieId;
    }

    public String getDescription() {
        return description;
    }

    public int getRate() {
        return rate;
    }

    public Comment() {

    }




    @Override
    public String toString() {
        return "Comments{" +
                "movieId=" + movieId +
                ", description='" + description + '\'' +
                ", rate=" + rate +
                '}';
    }
}
