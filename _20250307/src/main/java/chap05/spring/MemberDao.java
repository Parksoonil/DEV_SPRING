package chap05.spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class MemberDao {

	private JdbcTemplate jdbcTemplate;

	public MemberDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public Member selectByEmail(String email) {
		return null;
	}

	public void insert(Member member) {
		String sql = "insert into member(email, password, name, regdate) values (?,?,?, now())";
		jdbcTemplate.update(sql, member.getEmail(), member.getPassword(), member.getName());
	}

	public void update(Member member) {
	}

	public Collection<Member> selectAll() {
		return null;
	}
}
