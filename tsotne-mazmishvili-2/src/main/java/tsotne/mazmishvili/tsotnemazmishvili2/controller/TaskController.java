package tsotne.mazmishvili.tsotnemazmishvili2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tsotne.mazmishvili.tsotnemazmishvili2.dto.task.AddTaskInput;
import tsotne.mazmishvili.tsotnemazmishvili2.dto.task.AddTaskOutput;
import tsotne.mazmishvili.tsotnemazmishvili2.dto.task.GetTaskInput;
import tsotne.mazmishvili.tsotnemazmishvili2.dto.task.GetTaskOutput;
import tsotne.mazmishvili.tsotnemazmishvili2.service.TaskService;

@RestController
@RequestMapping("api/TaskController")
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("tasks")
    public GetTaskOutput gettasks(@RequestBody GetTaskInput getTaskInput) {
        return taskService.gettasks(getTaskInput);
    }

    @PostMapping("task")
    public AddTaskOutput addTask(@RequestBody AddTaskInput addTaskInput) {
        return taskService.addTask(addTaskInput);
    }

    @DeleteMapping("delete/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

}
