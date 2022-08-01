package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		 ApplicationContext ctx = SpringApplication.run(SpringBootHelloWorldApplication.class, args);
//		 DispatcherServlet dispatcherServlet = (DispatcherServlet)ctx.getBean("dispatcherServlet");
//	        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
	}
}