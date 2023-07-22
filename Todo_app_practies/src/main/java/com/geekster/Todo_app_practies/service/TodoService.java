package com.geekster.Todo_app_practies.service;

import com.geekster.Todo_app_practies.model.Todo;
import com.geekster.Todo_app_practies.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepo todoRepo;

    public void addTodos(Todo todo) {
         todoRepo.addTodos(todo);
    }

    public List<Todo> findAllTodo() {
        return todoRepo.findAllTodo();
    }

    public List<Todo> doneTodo() {
        List<Todo> todoList =todoRepo.findAllTodo();
        List<Todo> doneTodo = new ArrayList<>();
        for (Todo todo :todoList){
            if(todo.isTodoDoneStatus()== true){
                doneTodo.add(todo);
            }
        }
        return doneTodo;
    }

    public List<Todo> undoneTodo() {
        List<Todo> todoList =todoRepo.findAllTodo();
        List<Todo> undoneTodo = new ArrayList<>();
        for (Todo todo :todoList){
            if(todo.isTodoDoneStatus()== false){
                undoneTodo.add(todo);
            }
        }
        return undoneTodo;
    }

    public String deleteTodo(Integer id) {
        List<Todo> todoList =todoRepo.findAllTodo();

        for (Todo todo :todoList){
            if(todo.getTodoId().equals(id)){
                todoList.remove(todo);
               return "Delete todo successful";
            }
        }
        return "not delete";
    }

    public String updateTodo(Integer id, String name) {
        List<Todo> todoList =todoRepo.findAllTodo();
        for (Todo todo:todoList){
            if(todo.getTodoId().equals(id)){
                todo.setTotoName(name);
                return "update successfully";
            }
        }
        return "not update";
    }

    public Todo findById(Integer id) {
        for (Todo todo : todoRepo.findAllTodo()){
            if(todo.getTodoId().equals(id) ){
                return todo;
            }
        }
        return null;
    }
}
