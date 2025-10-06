package Service;

import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/users")

public class controlUser {
    private final UserRepository userRepository;

    public controlUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User updatedUser) {
        User user = userRepository.findById((long) id)
                .orElseThrow(() -> new RuntimeException("user  ID " + id + " not found"));

        user.setUsername(updatedUser.getUsername());
        user.setEmail(updatedUser.getEmail());
        user.setPassword(updatedUser.getPassword());

        return userRepository.save(user);
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        if (!userRepository.existsById((long) id)) {
            throw new RuntimeException("user ID " + id + " not found");
        }
        userRepository.deleteById((long) id);
        return "user  ID " + id + " deleted.";
    }
}