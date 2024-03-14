package com.lutfhi.todolist.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaveTaskRequest {
    private String taskName;
    private String description;
    private String dueDate;
    private String priority;
    private String status;
}
