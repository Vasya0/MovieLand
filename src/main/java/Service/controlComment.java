package Service;

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
            return ResponseEntity.badRequest().body("❌ Пользователь уже оставил комментарий к этому фильму!");
        }

        var movie = movieRepo.findById((long) comment.getMovie().getMovieID())
                .orElseThrow(() -> new RuntimeException("Фильм не найден"));

        var user = userRepo.findById((long) comment.getUser().getUserID())
                .orElseThrow(() -> new RuntimeException("Пользователь не найден"));

      //  Comment comment = new Comment();
        comment.setMovie(movie);
        comment.setUser(user);
        comment.setDescription(comment.getDescription());
        comment.setRate(comment.getRate());
        commentRepo.save(comment);

        return ResponseEntity.ok("✅ Комментарий успешно добавлен");
    }
}
