package pl.cg.Application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import pl.cg.controller.UsersController;
import pl.cg.model.Task;
import pl.cg.model.User;

@SpringBootApplication
@ComponentScan({"pl.cg.controller", "pl.cg.service"})
@EntityScan(basePackageClasses = {Task.class, User.class, UsersController.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
