package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age,Address address) {};
record Address(String firstLine,String city){};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Sid";
	}
	
	@Bean
	public int age() {
		return 21;
	}
	
	@Bean
	public Person person() {
		return new Person("John",25,new Address("Main Street","India"));
	}
	
	@Bean
	@Primary
	public Person person2MethodCall() {
		return new Person(name(),age(),address());
	}
	
	@Bean
	public Person person3Parameters(String name,int age,Address address3) {
		return new Person(name,age,address3);
	}
	
	@Bean(name="address2")
	@Primary
	public Address address() {
		return new Address("Baker Street","London");
	}
	
	@Bean(name="address3")
	public Address address3() {
		return new Address("Church Street","Banglore");
	}
}
