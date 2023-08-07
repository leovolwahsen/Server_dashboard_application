package io.gateway.server;

import io.gateway.server.enumeration.Status;
import io.gateway.server.model.Server;
import io.gateway.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo) {
		return args -> {
			serverRepo.save(new Server(null, "175.740.2.636", "Windows 11", "32 GB", "Home " +
					"Laptop", "http://localhost:8080/server/images/server1", Status.SERVER_UP));
			serverRepo.save(new Server(null, "105.434.2.632", "Linux Ubuntu", "64 GB", "Work " +
					"Laptop", "http://localhost:8080/server/images/server2", Status.SERVER_UP));
			serverRepo.save(new Server(null, "185.720.2.116", "Windows 8", "16 GB", "Office " +
					"Computer", "http://localhost:8080/server/images/server3", Status.SERVER_UP));

		};
	}

}
