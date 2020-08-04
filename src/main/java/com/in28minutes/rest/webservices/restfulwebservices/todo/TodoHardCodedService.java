package com.in28minutes.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCodedService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "in28Minutes", "Learn to Dance", new Date(), false));
		todos.add(new Todo(++idCounter, "in28Minutes", "Learn Microservices", new Date(), false));
		todos.add(new Todo(++idCounter, "in28Minutes", "Learn about Angular", new Date(), false));
	}
	
	public List<Todo> findAll() {
		return todos;
	}
	
	public Todo deleteById(int id) {
		Todo todo = findById(id);
		if(todo == null) return null;
		todos.remove(todo);
		return todo;
	}

	public Todo findById(int id) {
		for(Todo todo: todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	

}
