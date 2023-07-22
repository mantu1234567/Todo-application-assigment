package com.geekster.Todo_app_practies.repository;

import com.geekster.Todo_app_practies.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepo {

   private List<Todo> myTodos = new ArrayList<>();


    public void addTodos(Todo todo) {
        myTodos.add((Todo) todo);
    }

    public List<Todo> findAllTodo() {
        return myTodos;
    }
}
