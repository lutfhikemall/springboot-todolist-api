package com.lutfhi.todolist.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.lutfhi.todolist.dto.request.SaveTaskRequest;
import com.lutfhi.todolist.dto.response.AllTaskResponse;
import com.lutfhi.todolist.dto.response.DeleteTaskResponse;
import com.lutfhi.todolist.dto.response.DetailTaskResponse;
import com.lutfhi.todolist.dto.response.SaveTaskResponse;
import com.lutfhi.todolist.model.TaskModel;
import com.lutfhi.todolist.repository.impl.TaskRepositoryImpl;
import com.lutfhi.todolist.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepositoryImpl taskRepository;

    // SAVE TASSK
    @Override
    public SaveTaskResponse saveTask(SaveTaskRequest request) {
        // Initiate Save Task Response
        SaveTaskResponse response = new SaveTaskResponse();

        // Save Task
        taskRepository.saveTask(request);

        // Handle Success Response Either on Advice Controller
        response.setStatus("OK");

        return response;
    }

    // UPDATE TASK
    @Override
    public SaveTaskResponse updateTask(SaveTaskRequest request, int id) {
        // Initiate Save Task Response
        SaveTaskResponse response = new SaveTaskResponse();

        // Save Task
        taskRepository.updateTask(request, id);

        // Handle Success Response Either on Advice Controller
        response.setStatus("OK");

        return response;
    }

    // GET ALL TASK
    @Override
    public AllTaskResponse getAllTask() {
        // Initiate All Task Response
        AllTaskResponse response = new AllTaskResponse();

        // GET TASKS
        List<TaskModel> tasks = taskRepository.getAllTask();

        // Handle Success Response Either on Advice Controller
        response.setStatus("OK");
        response.setData(tasks);

        return response;
    }

    // GET TASK DETAIL
    @Override
    public DetailTaskResponse getTaskDetail(int id) {
        // Initiate Detail Task Response
        DetailTaskResponse response = new DetailTaskResponse();

        // GET TASK
        Optional<TaskModel> task = taskRepository.getTaskDetail(id);

        // Check If Task Is Not Present Then Throw The 404 Error
        if (!task.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Task with id : " + id + " is not found");
        }

        // Handle Success Response Either on Advice Controller
        response.setStatus("OK");
        response.setData(task.get());

        return response;
    }

    // DELETE TASK
    @Override
    public DeleteTaskResponse deleteTask(int id) {
        // Initiate Delete Task Response
        DeleteTaskResponse response = new DeleteTaskResponse();

        // DELETE TASK
        taskRepository.deleteTask(id);

        // Handle Success Response Either on Advice Controller
        response.setStatus("OK");

        return response;
    }

}
