package com.cogentinfo.abc_insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class AbcInsuranceApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AbcInsuranceApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(AbcInsuranceApplication.class, args);
	}
}
