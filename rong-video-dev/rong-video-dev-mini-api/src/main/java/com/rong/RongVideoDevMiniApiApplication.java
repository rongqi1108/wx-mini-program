package com.rong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = "com.rong.mapper")
@ComponentScan(basePackages = {"com.rong","org.n3r.idworker"})
@SpringBootApplication
public class RongVideoDevMiniApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RongVideoDevMiniApiApplication.class, args);
	}

}
