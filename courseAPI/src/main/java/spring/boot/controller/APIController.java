package spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sayHi() {
		return "<h1>This is my first spring boot application</h1>";
	}
	
}
