package Service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class ControlMain {
    private final JdbcTemplate jdbcTemplate;

    public ControlMain(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @DeleteMapping("/clear-all")
    public String clearAllTables() {
        // порядок важен! сначала таблицы связей
        jdbcTemplate.execute("DELETE FROM MOVIECOUNTRY");
        jdbcTemplate.execute("DELETE FROM MOVIEGENRE");
        jdbcTemplate.execute("DELETE FROM COMMENTS");
        jdbcTemplate.execute("DELETE FROM RATINGS");
        jdbcTemplate.execute("DELETE FROM MOVIES");
        jdbcTemplate.execute("DELETE FROM COUNTRIES");
        jdbcTemplate.execute("DELETE FROM GENRES");
        jdbcTemplate.execute("DELETE FROM USERS");

        return "✅ All tables cleared successfully!";
    }
}
