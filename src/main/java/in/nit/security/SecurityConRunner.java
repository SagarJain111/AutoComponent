package in.nit.security;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(50)
public class SecurityConRunner implements CommandLineRunner, Ordered {

	public void run(String... args) throws Exception {
		System.out.println("From Security Config");

	}

	public int getOrder() {

		return 500;
	}

}
