package com.jetbrains.mavendemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenDemoApplication.class, args);
		System.out.println("第一次变更");
		System.out.println("2222222");
		System.out.println("2222223");
		System.out.println("开发分支建立");
		System.out.println("只有develop才触发");
	}

}
