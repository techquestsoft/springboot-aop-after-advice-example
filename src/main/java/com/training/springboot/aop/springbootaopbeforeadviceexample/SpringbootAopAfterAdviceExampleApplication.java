package com.training.springboot.aop.springbootaopbeforeadviceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringbootAopAfterAdviceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAopAfterAdviceExampleApplication.class, args);
	}

}
