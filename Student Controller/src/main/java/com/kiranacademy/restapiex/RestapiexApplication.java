package com.kiranacademy.restapiex;



import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 



@SpringBootApplication
public class RestapiexApplication {

//	@Autowired
//	DataSource datasource;
//	
	public static void main(String[] args) 
	{
		SpringApplication.run(RestapiexApplication.class, args);
		
	}
	
//	@Bean
//	public LocalSessionFactoryBean getFactory()
//	{
//		LocalSessionFactoryBean factory=new LocalSessionFactoryBean();
//		factory.setDataSource(datasource);
//		factory.setAnnotatedClasses(Student.class);
//		return factory;
//	}

	

}
