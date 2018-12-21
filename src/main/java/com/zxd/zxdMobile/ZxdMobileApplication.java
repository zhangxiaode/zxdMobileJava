package com.zxd.zxdMobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.zxd.zxdMobile.mapper")
public class ZxdMobileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZxdMobileApplication.class, args);
	}

}
