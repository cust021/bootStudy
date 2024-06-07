package com.study.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication 
@MapperScan
public class BootStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootStudyApplication.class, args);
	}

}
