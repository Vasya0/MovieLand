package Version1.control;

import Version1.Entity.Comment;
import Version1.Repository.MovieRepository;
import Version1.Repository.CommentRepository;
import Version1.Repository.UserRepository;
import Version1.exceptions.UserNotFoundException;
import Version1.exceptions.movieNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class controlComment {

    private final CommentRepository commentRepo;
    private final MovieRepository movieRepo;
    private final UserRepository userRepo;

    public controlComment(CommentRepository commentRepo, MovieRepository movieRepo, UserRepository userRepo) {
        this.commentRepo = commentRepo;
        this.movieRepo = movieRepo;
        this.userRepo = userRepo;
    }

    // 🔹 Получить все комментарии
    @GetMapping
    public List<Comment> getAllComments() {
        return commentRepo.findAll();
    }

    // 🔹 Получить комментарии к конкретному фильму
    @GetMapping("/{movieID}")
    public List<Comment> getCommentsByMovie(@PathVariable int movieID) {
        return commentRepo.findByMovie_MovieID(movieID);
    }

    // 🔹 Добавить новый комментарий
    @PostMapping
    public ResponseEntity<?> addComment(@RequestBody Comment comment) {
        if (commentRepo.existsByMovie_MovieIDAndUser_UserID(comment.getMovie().getMovieID(), comment.getUser().getUserID())) {
            return ResponseEntity.badRequest().body("comment from user exist");
        }

        var movie = movieRepo.findById((long) comment.getMovie().getMovieID())
                .orElseThrow(() -> new movieNotFoundException("movie not found"));

        var user = userRepo.findById((long) comment.getUser().getUserID())
                .orElseThrow(() -> new UserNotFoundException("user not found"));

      //  Comment comment = new Comment();
        comment.setMovie(movie);
        comment.setUser(user);
        comment.setDescription(comment.getDescription());
        comment.setRate(comment.getRate());
        commentRepo.save(comment);

        return ResponseEntity.ok("comment added ");
    }
}
