package Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    // Все комментарии к фильму
    List<Comment> findByMovie_MovieID(int movieID);

    // Все комментарии пользователя
    List<Comment> findByUser_UserID(int userID);

    // Проверить — оставлял ли пользователь комментарий к фильму
    boolean existsByMovie_MovieIDAndUser_UserID(int movieID, int userID);
}
