package com.lutfhi.todolist.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lutfhi.todolist.constants.QueryConstant;
import com.lutfhi.todolist.dto.request.SaveTaskRequest;
import com.lutfhi.todolist.model.TaskModel;
import com.lutfhi.todolist.repository.TaskRepository;

@Repository
public class TaskRepositoryImpl implements TaskRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    // SAVE TASK
    @Override
    @Transactional
    public void saveTask(SaveTaskRequest request) {
        // Set Task Parameter
        Object[] taskParameter = new Object[] { request.getTaskName(), request.getDescription(),
                request.getDueDate(), request.getPriority(), request.getStatus() };

        // SAVE INTO DB
        jdbcTemplate.update(QueryConstant.Task.SAVE_TASK, taskParameter);
    }

    // UPDATE TASK
    @Override
    @Transactional
    public void updateTask(SaveTaskRequest request, int id) {
        // Set Task Parameter
        Object[] taskParameter = new Object[] { request.getTaskName(), request.getDescription(),
                request.getDueDate(), request.getPriority(), request.getStatus(), id };

        // SAVE INTO DB
        jdbcTemplate.update(QueryConstant.Task.SAVE_TASK, taskParameter);
    }

    // IS EXIST
    @Override
    public boolean isExist(int id) {
        // Query Parameter
        Object[] parameter = new Object[] { id };

        // Check If Exist
        int exist = jdbcTemplate.queryForObject(QueryConstant.Task.IS_EXIST,
                Integer.class,
                parameter);

        return exist == 1 ? true : false;
    }

    // GET ALL TASK
    @Override
    public List<TaskModel> getAllTask() {
        // GET TASKS
        List<TaskModel> tasks = jdbcTemplate.queryForList(QueryConstant.Task.GET_ALL_TASK, TaskModel.class);

        return tasks;
    }

    // GET TASK DETAIL
    @Override
    public Optional<TaskModel> getTaskDetail(int id) {
        try {
            // Set Task Parameter
            Object[] taskParameter = new Object[] { id };

            // GET TASK
            TaskModel task = jdbcTemplate.queryForObject(QueryConstant.Task.GET_TASK_BY_ID, TaskModel.class,
                    taskParameter);

            return Optional.ofNullable(task);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    // DELETE TASK
    @Override
    public void deleteTask(int id) {
        // Set Task Parameter
        Object[] taskParameter = new Object[] { id };

        // DELETE TASK
        jdbcTemplate.update(QueryConstant.Task.DELETE_TASK_BY_ID, taskParameter);
    }

}
