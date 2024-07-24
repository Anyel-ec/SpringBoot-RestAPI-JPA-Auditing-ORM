package top.anyel.appd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ExamenSpringBootU2Application {

    public static void main(String[] args) {
        SpringApplication.run(ExamenSpringBootU2Application.class, args);
    }

}
