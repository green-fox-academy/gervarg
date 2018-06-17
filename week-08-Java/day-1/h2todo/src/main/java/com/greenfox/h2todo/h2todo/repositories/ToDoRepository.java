package com.greenfox.h2todo.h2todo.repositories;

import com.greenfox.h2todo.h2todo.models.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
