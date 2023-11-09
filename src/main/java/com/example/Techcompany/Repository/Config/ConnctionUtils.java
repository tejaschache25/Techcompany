package com.example.Techcompany.Repository.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
public class ConnctionUtils
{	
	@Bean
	public static DataSource getDataSource()
	{	
		System.out.println("test");
		DriverManagerDataSource ds1 = new DriverManagerDataSource();
		ds1.setDriverClassName("org.postgresql.Driver");
		ds1.setUrl("jdbc:postgresql://localhost:5432/companydb");
		ds1.setUsername("postgres");
		ds1.setPassword("1234");
		return ds1;
}
}
