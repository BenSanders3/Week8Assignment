package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.context.ApplicationContext;

import dmacc.beans.House;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.HouseRepository;

@SpringBootApplication
public class Week8Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Week8Application.class, args);
	}
	
	@Autowired
	HouseRepository repo;


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		House h = appContext.getBean("house", House.class);
		h.setName("Smith");
		repo.save(h);
		
		House g = new House(2020, "Carl", "1234 real st", "(098)-765-4321");
		repo.save(g);
		
		List<House> allHouses = repo.findAll();
		for(House people: allHouses) {
			System.out.println(people.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}

}
