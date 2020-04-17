package com.in28minutes.rest.webservices.restfulwebservices.helloWorld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorldController {
	/* @RequestMapping(method = RequestMethod.GET,path = "/hello-world") */
	
	@Autowired
	private MessageSource messagesource;
	
	@GetMapping(path = "/hello-world")
	public String HelloWorld() {
		
		return "Hello World";
	}
	@GetMapping(path = "/hello-world-bean")
	
	public HellowWorldBean hellowWorldBean() {
		return new HellowWorldBean("hello world");
	}
	
	@GetMapping(path = "/hello-world-bean/path-variable/{name}")
	
	public HellowWorldBean hellowWorldBean(@PathVariable String name) {
		return new HellowWorldBean(String.format("Hello World , %s ", name));
	}

	@GetMapping(path="/hello-world-Internaliazation")
public String helloWorldI8n(@RequestHeader(name="Accept-Language", required = false) Locale local) {
	return messagesource.getMessage("good.morning.message",null, local);
}

	
	  @GetMapping(path="/hello-world-In18") public String helloWorldI8n2ndWay() {
	  return messagesource.getMessage("good.morning.message",null,
	  LocaleContextHolder.getLocale()); }
	 
}

