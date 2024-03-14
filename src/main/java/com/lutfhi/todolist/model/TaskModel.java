package com.lutfhi.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskModel {
    private int taskId;
    private String taskName;
    private String description;
    private String dueDate;
    private String priority;
    private String status;
    private String createdAt;
    private String updatedAt;
}
