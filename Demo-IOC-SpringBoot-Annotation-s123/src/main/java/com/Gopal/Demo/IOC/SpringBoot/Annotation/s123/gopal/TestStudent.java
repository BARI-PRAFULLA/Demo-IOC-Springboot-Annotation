package com.Gopal.Demo.IOC.SpringBoot.Annotation.s123.gopal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.Session;

@RestController
public class TestStudent {
	
	@Autowired
	
	
	
	Student ss;
	
	
	
	
	@Value("${merchantID}")
	int merchantID;
	
	@RequestMapping("myname")
	public String getName() {
	System.out.println(merchantID);
	
	return ss.myName();
	}
	
}
