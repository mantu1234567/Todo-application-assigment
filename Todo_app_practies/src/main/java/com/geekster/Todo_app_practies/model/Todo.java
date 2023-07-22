package com.geekster.Todo_app_practies.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    private Integer todoId;
    private String totoName;
    private boolean isTodoDoneStatus;
}
