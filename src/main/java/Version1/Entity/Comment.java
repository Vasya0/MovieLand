package Version1.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(
        name = "comments",
        uniqueConstraints = @UniqueConstraint(columnNames = {"movieID", "userID"})
)
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentID;

    private String description;
    private int rate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movieID", nullable = false)
    @JsonIgnore
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userID", nullable = false)
    @JsonIgnore
    private User user;

    public Comment() {
    }

    public Comment(Movie movie, User user, String description, int rate) {
        this.movie = movie;
        this.user = user;
        this.description = description;
        this.rate = rate;
    }

    public Long getCommentID() {
        return commentID;
    }

    public void setCommentID(Long commentID) {
        this.commentID = commentID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentID=" + commentID +
                ", description='" + description + '\'' +
                ", rate=" + rate +
                '}';
    }
}
