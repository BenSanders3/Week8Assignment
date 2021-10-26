package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.House;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public House house() {
		House bean = new House();
		bean.setHouseNum(2248);
		bean.setStreet("SW 16th CT");
		bean.setPhone("(123)-456-7890");
		bean.setName("Jimmy");
		return bean;
	}
}
