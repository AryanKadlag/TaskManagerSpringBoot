package com.scl.firstproj.controllers;


import com.scl.firstproj.data.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/tasks")
public class TaskController {


    ArrayList<Task> tasks = new ArrayList<Task>();

    public TaskController() {

        this.tasks = new ArrayList<>();

        this.tasks.add(new Task("Task 1", new Date(), false));
        this.tasks.add(new Task("Task 2", new Date(), true));
        this.tasks.add(new Task("Task 3", new Date(), false));
    }


    @GetMapping("")
    public ArrayList<Task> getTasks() {
        return tasks;
    }

    @GetMapping("/{id}")
    private Task getTask(@PathVariable("id") int id) {
        return tasks.get(id);
    }
}
