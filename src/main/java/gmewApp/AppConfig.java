package gmewApp;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import gmewApp.dao.Alumno;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
@EnableJpaRepositories("gmewApp.repositories")
public class AppConfig {

	@Autowired
	private Environment ev;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(ev.getProperty("db.driver"));
		ds.setUrl(ev.getProperty("db.url"));
		ds.setUsername(ev.getProperty("db.username"));
		ds.setPassword(ev.getProperty("db.password"));
		return ds;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		emf.setPackagesToScan(Alumno.class.getPackage().getName());

		HibernateJpaVendorAdapter hJpa = new HibernateJpaVendorAdapter();
		hJpa.setDatabase(Database.POSTGRESQL);
		hJpa.setDatabasePlatform(ev.getProperty("hibernate.dialect"));
		hJpa.setGenerateDdl(ev.getProperty("hibernate.generateDdl", Boolean.class));
		hJpa.setShowSql(ev.getProperty("hibernate.show_sql", Boolean.class));
		emf.setJpaVendorAdapter(hJpa);

		Properties jpaProperties = new Properties();
		jpaProperties.put("hibernate.hbm2ddl.auto", ev.getProperty("hibernate.hbm2ddl.auto"));
		jpaProperties.put("hibernate.show_sql", ev.getProperty("hibernate.show_sql"));
		jpaProperties.put("hibernate.format_sql", ev.getProperty("hibernate.format_sql"));		
		emf.setJpaProperties(jpaProperties);

		return emf;
	}

	@Bean
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager tm = new JpaTransactionManager();
		tm.setEntityManagerFactory(entityManagerFactory().getObject());
		return tm;
	}

}
