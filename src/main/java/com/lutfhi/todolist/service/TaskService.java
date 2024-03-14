package com.lutfhi.todolist.service;

import com.lutfhi.todolist.dto.request.SaveTaskRequest;
import com.lutfhi.todolist.dto.response.AllTaskResponse;
import com.lutfhi.todolist.dto.response.DeleteTaskResponse;
import com.lutfhi.todolist.dto.response.DetailTaskResponse;
import com.lutfhi.todolist.dto.response.SaveTaskResponse;

public interface TaskService {

    // SAVE TASK
    public SaveTaskResponse saveTask(SaveTaskRequest request);

    // UPDATE TASK
    public SaveTaskResponse updateTask(SaveTaskRequest request, int id);

    // GET ALL TASK
    public AllTaskResponse getAllTask();

    // GET TASK DETAIL
    public DetailTaskResponse getTaskDetail(int id);

    // DELETE TASK
    public DeleteTaskResponse deleteTask(int id);
}
