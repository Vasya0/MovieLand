package Version1.Repository;
import Version1.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MovieRepository extends JpaRepository<Movie, Long> {
    Optional<Movie> findByNameENG(String nameENG);
}