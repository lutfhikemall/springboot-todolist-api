package com.lutfhi.todolist.repository;

import java.util.List;
import java.util.Optional;

import com.lutfhi.todolist.dto.request.SaveTaskRequest;
import com.lutfhi.todolist.model.TaskModel;

public interface TaskRepository {

    // SAVE TASK
    public void saveTask(SaveTaskRequest request);

    // UPDATE TASK
    public void updateTask(SaveTaskRequest request, int id);

    // IS EXIST
    public boolean isExist(int id);

    // GET ALL TASK
    public List<TaskModel> getAllTask();

    // GET TASK DETAIL
    public Optional<TaskModel> getTaskDetail(int id);

    // DELETE TASK
    public void deleteTask(int id);
}
