package com.lutfhi.todolist.constants;

public class QueryConstant {
    public static final class Task {
        // SAVE TASK
        public static final String SAVE_TASK = "INSERT INTO tasks (task_name, description, due_date, priority, status) VALUES (?,?,?,?,?)";

        // UPDATE TASK
        public static final String UPDATE_TASK = "UPDATE tasks SET task_name = ?, description = ?, due_date = ?, priority = ?, status = ? WHERE task_id = ?";

        // GET ALL TASK
        public static final String GET_ALL_TASK = "SELECT * FROM tasks";

        // GET TASK BY TASK ID
        public static final String GET_TASK_BY_ID = "SELECT * FROM tasks WHERE task_id =?";

        // IS EXIT
        public static final String IS_EXIST = "SELECT COUNT(*) FROM tasks WHERE task_id =?";

        // DELETE TASK BY TASK ID
        public static final String DELETE_TASK_BY_ID = "DELETE FROM tasks WHERE task_id = ?";
    }
}
