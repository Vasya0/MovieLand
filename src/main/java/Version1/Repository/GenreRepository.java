package Version1.Repository;

import Version1.Entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface GenreRepository extends JpaRepository<Genre, Integer> {

    Optional<Genre> findByName(String name);
}


