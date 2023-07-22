package com.geekster.Todo_app_practies.controller;

import com.geekster.Todo_app_practies.model.Todo;
import com.geekster.Todo_app_practies.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;
    // add todo
    @PostMapping("add/todo")
    public void addTodos(@RequestBody Todo todo){
         todoService.addTodos(todo);
    }
    // find all todo
    @GetMapping("find/todo")
    public List<Todo> findAllTodo(){
        return todoService.findAllTodo();
    }

    // check done status
    @GetMapping("done/todo")
    public List<Todo> doneTodo(){
        return todoService.doneTodo();
    }

    // check not done status
    @GetMapping("undone/todo")
    public List<Todo> undoneTodo(){
        return todoService.undoneTodo();
    }

    // update todo
    @PutMapping("update/todo/{Id}/{name}")
    public String updateTodo(@PathVariable Integer Id,@PathVariable String name){
        return todoService.updateTodo(Id,name);
    }

    // find todo get by id
    @GetMapping("find/by/id/{Id}")
    public Todo findById(@PathVariable Integer Id){
        return todoService.findById(Id);
    }

    // delete todo
    @DeleteMapping("delete/todo/{Id}")
    public String deleteTodo(@PathVariable Integer Id){
        return todoService.deleteTodo(Id);
    }
}
