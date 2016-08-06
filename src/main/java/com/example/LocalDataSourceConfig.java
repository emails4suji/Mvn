package com.example;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;

@Configuration
@Profile("!cloud")
public class LocalDataSourceConfig {

	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource datasource()
	{
		return DataSourceBuilder.create().build();
	}
}
