package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableRedisHttpSession
@RestController
public class SpringSessionTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSessionTestApplication.class, args);
	}


    @RequestMapping("/")
    public String call(){
        return "hello";
    }
}
