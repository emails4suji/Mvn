package com.example;

import javax.sql.DataSource;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.*;

@Configuration
@Profile("cloud")
public class CloudDataSourceConfig extends AbstractCloudConfig{

	@Bean
	public DataSource datasource()
	{
		return connectionFactory().dataSource();
	}
}
