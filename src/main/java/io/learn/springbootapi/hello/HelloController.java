package io.learn.springbootapi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String greetUser() {
		return "Welcome to Spring Boot Rest Application";
	}
}
