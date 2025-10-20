package Version1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"Version1", "Service","exceptions"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}