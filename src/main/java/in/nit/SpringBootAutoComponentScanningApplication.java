package in.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "in.nit.security", "in.nit.runner" })
public class SpringBootAutoComponentScanningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutoComponentScanningApplication.class, args);
	}

}
