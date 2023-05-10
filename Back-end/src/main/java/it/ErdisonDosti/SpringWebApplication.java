package it.ErdisonDosti;

import it.ErdisonDosti.Config.RegisterRequest;
;
import it.ErdisonDosti.service.AuthenticationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

import static it.ErdisonDosti.entity.Role.ADMIN;
import static it.ErdisonDosti.entity.Role.MANAGER;

/**
 * 
 * Da qui parte l'applicazione SpringBoot.
 * 
 * @author SpringBoot
 *
 */
@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}


//	@Bean
//	public CommandLineRunner commandLineRunner(AuthenticationService service){
//
//		return arg->{
//			var admin = RegisterRequest
//					.builder()
//					.email("admin@zerodd.com")
//					.password("1234")
//					.role(ADMIN)
//					.build();
//
//			System.out.printf("Admin token:"+ service.register(admin).getAccessToken());
//
//			var manager = RegisterRequest
//					.builder()
//					.email("manager@zerodd.com")
//					.password("1234")
//					.role(MANAGER)
//					.build();
//
//			System.out.printf("Manager token:"+ service.register(manager).getAccessToken());
//		};
//	}
}
