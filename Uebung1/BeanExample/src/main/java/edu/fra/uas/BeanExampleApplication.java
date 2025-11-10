package edu.fra.uas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner; // App startet, alle Beans erstellt, DANN läuft CommandLineRunner
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import controller.BeanController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import edu.fra.uas.service.MessageService;

@SpringBootApplication
public class BeanExampleApplication {

	private static final Logger log =LoggerFactory.getLogger(BeanExampleApplication.class);

	@Autowired
	//private MessageService messageService;
	private BeanController beanController;
	public static void main(String[] args) {
		SpringApplication.run(BeanExampleApplication.class, args);
	}

	@Bean
	CommandLineRunner init() {
		CommandLineRunner action = new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
			log.debug(beanController.putMessage("Hallo Welt"));
 log.debug(beanController.putMessage("--> OOOHOOO <--"));
			}
		};
		return action;
	}

}
