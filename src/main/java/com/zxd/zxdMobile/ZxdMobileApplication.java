package com.zxd.zxdMobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan("com.zxd.zxdMobile.mapper")
public class ZxdMobileApplication {
//public class ZxdMobileApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ZxdMobileApplication.class, args);
	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(ZxdMobileApplication.class);
//	}
}
