package tsotne.mazmishvili.tsotnemazmishvili2.service;

import tsotne.mazmishvili.tsotnemazmishvili2.dto.task.*;

public interface TaskService {
    GetTaskOutput gettasks(GetTaskInput getTaskInput);

    AddTaskOutput addTask(AddTaskInput addTaskInput);

    void deleteTask(Long id);
}
