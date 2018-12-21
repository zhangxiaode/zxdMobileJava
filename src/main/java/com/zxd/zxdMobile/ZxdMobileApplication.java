package com.zxd.zxdMobile;

//import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

@SpringBootApplication
//@RestController
//@RequestMapping("/apis")
@MapperScan("com.zxd.zxdMobile.mapper")
//public class ZxdMobileApplication extends SpringBootServletInitializer {
public class ZxdMobileApplication {
//	private static final Logger logger = LoggerFactory.getLogger(ZxdMobileApplication.class);

//	@Value("${spring.application.name}")
//	private String name;

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(ZxdMobileApplication.class);
//	}

	public static void main(String[] args) {
//		logger.info("this is a info message");
//		logger.warn("this is a warn message");
//		logger.error("this is a error message");
		SpringApplication.run(ZxdMobileApplication.class, args);
	}

//	@RequestMapping(value = "/helloworld")
//	public String hello() {
//		return "Hello World";
//	}

//	@RequestMapping(value = "/name")
//	public String name() {
//		return name;
//	}

//	private static Map<String, Product> productRepo = new HashMap<>();
//	static {
//		Product honey = new Product();
//		honey.setId("1");
//		honey.setName("Honey");
//		productRepo.put(honey.getId(), honey);
//
//		Product almond = new Product();
//		almond.setId("2");
//		almond.setName("Almond");
//		productRepo.put(almond.getId(), almond);
//	}
//	@RequestMapping(value = "/products")
//	public ResponseEntity<Object> getProduct() {
//		return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
//	}

}
