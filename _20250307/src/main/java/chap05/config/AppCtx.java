package chap05.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap05.spring.ChangePasswordService;
import chap05.spring.MemberDao;
import chap05.spring.MemberInfoPrinter;
import chap05.spring.MemberListPrinter;
import chap05.spring.MemberPrinter;
import chap05.spring.MemberRegisterService;

@Configuration
public class AppCtx {

	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/spring5fs?characterEncoding=utf8");
		ds.setUsername("root");
		ds.setPassword("1234");
		ds.setInitialSize(2);
		ds.setMaxActive(10);
		ds.setTestWhileIdle(true);
		ds.setMinEvictableIdleTimeMillis(60000 * 3);
		ds.setTimeBetweenEvictionRunsMillis(10 * 1000);
		return ds;
	}
	
	@Bean
	public MemberDao memberdao() {
		return new MemberDao(null);
	}
}
