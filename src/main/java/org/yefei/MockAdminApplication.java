package org.yefei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = {"org.yefei"})
public class MockAdminApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(MockAdminApplication.class, args);
	}


	@Configuration
	@MapperScan(basePackages = {"org.yefei.model.gen.dao", "org.yefei.mapper.dao"}, sqlSessionFactoryRef="sqlSessionFactoryBean")
	class DBConfig{}

}
