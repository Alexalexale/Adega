package br.adega.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@ComponentScan({ "br.adega.controller", "br.adega.service" })
@EntityScan("br.adega.domain")
@EnableJpaRepositories("br.adega.repository")
@Controller
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@RequestMapping(value = "/")
	public String home(Model model) {
		return "home";
	}

}
