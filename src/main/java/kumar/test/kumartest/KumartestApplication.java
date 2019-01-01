package kumar.test.kumartest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("kumar.test")
public class KumartestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KumartestApplication.class, args);
	}

}

