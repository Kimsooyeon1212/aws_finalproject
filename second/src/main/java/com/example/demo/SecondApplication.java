package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication //내가 설정클래스 파일
@ComponentScan
@ComponentScan(basePackages = {"upload", "board.spring.mybatis"})
@ComponentScan(basePackages="websocket")
@ComponentScan(basePackages = "spring.mybatis")
@MapperScan(basePackages={"spring.mybatis", "board.spring.mybatis"})
@ComponentScan(basePackages= "dbsecure")
public class SecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondApplication.class, args);
	}

}
