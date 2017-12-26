package www.wuluyang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void createjdbcuser() {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into user values(null,?,?,?,?);","吴陆阳","男","id222","123456" );
	}

}
