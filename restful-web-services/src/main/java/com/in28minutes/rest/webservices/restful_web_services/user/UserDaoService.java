package com.in28minutes.rest.webservices.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<User>();
	private static int count = 0;

	static {
		users.add(new User(++count, "Adam", LocalDate.now().minusYears(25)));
		users.add(new User(++count, "Eve", LocalDate.now().minusYears(20)));
		users.add(new User(++count, "John", LocalDate.now().minusYears(29)));
	}

	public List<User> findAll() {
		return users;
	}

	public User findOne(int id) {
		User user = users.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
		return user;
	}

	public User save(User user) {
		user.setId(++count);
		users.add(user);
		return user;
	}
	
	public void deleteById(int id) {
		User user = users.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
		users.remove(user);
	}
}
