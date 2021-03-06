package cn.edu.cqupt;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDataSource {

	@SuppressWarnings("resource")
	@Test
	public void testDataSources() throws SQLException{
		
		ApplicationContext ac = null;
		ac = new ClassPathXmlApplicationContext("classpath:spring-mybaits.xml");
		DataSource dataSource = ac.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}
}
