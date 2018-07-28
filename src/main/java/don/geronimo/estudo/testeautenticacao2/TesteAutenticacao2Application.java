package don.geronimo.estudo.testeautenticacao2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class TesteAutenticacao2Application {

    public static void main(String[] args) {
        SpringApplication.run(TesteAutenticacao2Application.class, args);
    }
}
