package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController

public class CICDcontroller{
	
	//http://localhost:8080/fisa1
	@GetMapping("/fisa1")
	public String reqRes() {
		System.out.println("reqRes() ******");
		log.info("*요청 & 응답*");
		for(int i=1; i<=10; i++) {
			System.out.println("data 값" + i);
		}
		
		return "gitactions success!!";
		
	}
}






	


