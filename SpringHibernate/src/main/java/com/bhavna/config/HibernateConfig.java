package com.bhavna.config;


import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.bhavna")
@PropertySource("classpath:database.properties")
public class HibernateConfig {

//    @Autowired
//    private Environment environment;

	 @Bean
	    public LocalSessionFactoryBean sessionFactory() {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(dataSource());
	        sessionFactory.setPackagesToScan(new String[] {
	            "com.bhavna.entity"
	        });
	        sessionFactory.setHibernateProperties(hibernateProperties());
	        return sessionFactory;
	    }
   
   

    /************* End Spring JPA config details **************/

    @Bean
    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driver"));
//        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
//        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
//        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
//        return dataSource;
    	String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    	String url = "jdbc:sqlserver://localhost\\\\BHAVNAWKS723;databaseName=MLDB;portNumber=1433";
    	String user = "sa";
    	String pass = "Bhavna@123";

    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
    	dataSource.setDriverClassName(driver);
    	dataSource.setUrl(url);
    	dataSource.setUsername(user);
    	dataSource.setPassword(pass);
    	return dataSource;

    }

    private Properties hibernateProperties() {
    	
//        Properties properties = new Properties();
//        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
//        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
//        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
//        properties.put("hibernate.ddl-auto", environment.getRequiredProperty("hibernate.ddl-auto"));
//        return properties;
    	Properties properties = new Properties();
    	properties.put("hibernate.dialect","org.hibernate.dialect.SQLServerDialect");
    	properties.put("hibernate.show_sql", "true");
    	properties.put("hibernate.format_sql", "true");
    	properties.put("hibernate.hbm2ddl.auto", "none");
    	return properties;
    }

}
