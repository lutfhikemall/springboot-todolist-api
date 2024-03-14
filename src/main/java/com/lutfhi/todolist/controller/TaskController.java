package com.lutfhi.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lutfhi.todolist.dto.request.SaveTaskRequest;
import com.lutfhi.todolist.dto.response.AllTaskResponse;
import com.lutfhi.todolist.dto.response.DeleteTaskResponse;
import com.lutfhi.todolist.dto.response.DetailTaskResponse;
import com.lutfhi.todolist.dto.response.SaveTaskResponse;
import com.lutfhi.todolist.service.impl.TaskServiceImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TaskController {

    @Autowired
    TaskServiceImpl taskService;

    // SAVE TASK
    @PostMapping("/api/v1/task")
    public SaveTaskResponse saveTask(@RequestBody SaveTaskRequest request) {
        return taskService.saveTask(request);
    }

    // UPDATE TASK
    @PutMapping("/api/v1/task/{task_id}")
    public SaveTaskResponse updateTask(@PathVariable("task_id") int id, @RequestBody SaveTaskRequest request) {
        return taskService.updateTask(request, id);
    }

    // GET ALL TASK
    @GetMapping("/api/v1/task")
    public AllTaskResponse getAllTask() {
        return taskService.getAllTask();
    }

    // GET TASK DETAIL
    @GetMapping("/api/v1/task/{id}")
    public DetailTaskResponse getAllTask(@PathVariable int id) {
        return taskService.getTaskDetail(id);
    }

    // DELETE TASK
    @DeleteMapping("/api/v1/task/{id}")
    public DeleteTaskResponse deleteTask(@PathVariable int id) {
        return taskService.deleteTask(id);
    }

}
