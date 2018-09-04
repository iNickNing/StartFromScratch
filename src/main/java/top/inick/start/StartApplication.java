package top.inick.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(StartApplication.class.getName());
		SpringApplication.run(StartApplication.class, args);
		logger.info("StartApplication Start~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}
}
