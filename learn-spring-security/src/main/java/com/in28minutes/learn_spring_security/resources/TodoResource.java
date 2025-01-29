package com.in28minutes.learn_spring_security.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResource {

	private static final List<Todo> TODOS_LIST = List.of(new Todo("sid", "Learn AWS"), new Todo("sid", "Learn AWS"));

	@GetMapping("/todos")
	public List<Todo> retrieveAllTodos() {
		return TODOS_LIST;
	}
	
	@GetMapping("/users/{username}/todos")
	public Todo retrieveTodosForUser() {
		return TODOS_LIST.get(0);
	}
}

record Todo(String username, String description) {
}