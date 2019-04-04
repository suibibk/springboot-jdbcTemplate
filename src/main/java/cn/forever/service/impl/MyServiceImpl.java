package cn.forever.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

@Service
public class MyServiceImpl implements cn.forever.service.MyService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public String getUser() {
		List<Map<String,Object>> users =jdbcTemplate.queryForList("select * from user");
		Gson gson = new Gson();
		String user = gson.toJson(users);
		System.out.println("users:"+user.toString());
		return user;
	}

}
