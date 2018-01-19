package blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// applies default configuration settings (finds and loads everything)
@SpringBootApplication

// configures and starts Spring Boot app
public class BlogMvcApplication {
    public static void main(String[] args) {
        // starts Tomcat Web application server
        SpringApplication.run(BlogMvcApplication.class, args);
    }
}