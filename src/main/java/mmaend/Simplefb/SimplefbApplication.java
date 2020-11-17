package mmaend.Simplefb;

import io.sentry.Sentry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimplefbApplication {

	public static void main(String[] args) {
		Sentry.capture("Application have started");
		SpringApplication.run(SimplefbApplication.class, args);
	}

}
