package home.clear;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by karimov on 24.02.2016.
 */
@Configuration
@ComponentScan(basePackages = "home.clear")
@EnableJpaRepositories
public class Config {
}
