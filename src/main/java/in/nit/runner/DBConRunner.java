package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(52)
public class DBConRunner implements CommandLineRunner {

	
	public void run(String... args) throws Exception {
		System.out.println("From DB Config");
		
	}

}
