package com.labouardy.init;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.labouardy.dao.UserRespository;
import com.labouardy.model.User;

@Component
public class InitClr implements CommandLineRunner{

	@Autowired
	private UserRespository userRespository;
	
	@Override
	public void run(String... arg0) throws Exception {
		Stream.of("Med","John","Frank","Youssef","Ayoub")
			  .forEach(s -> {
				  User user=new User();
				  user.setUsername(s);
				  userRespository.save(user);
			  });
		
		userRespository.findAll().forEach(System.out::println);
	}

}
