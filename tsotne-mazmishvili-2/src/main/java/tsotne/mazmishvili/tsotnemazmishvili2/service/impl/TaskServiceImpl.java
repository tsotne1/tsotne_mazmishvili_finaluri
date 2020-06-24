package tsotne.mazmishvili.tsotnemazmishvili2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tsotne.mazmishvili.tsotnemazmishvili2.dto.task.*;
import tsotne.mazmishvili.tsotnemazmishvili2.model.Task;
import tsotne.mazmishvili.tsotnemazmishvili2.repository.TaskRepository;
import tsotne.mazmishvili.tsotnemazmishvili2.service.TaskService;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public GetTaskOutput gettasks(GetTaskInput getTaskInput) {
        List<TaskDTO> taskDTOList = new ArrayList<>();
        for (Task task : taskRepository.findAll()) {
            TaskDTO taskDTO = new TaskDTO();
            taskDTO.setId(task.getId());
            taskDTO.setTitle(task.getTitle());
            taskDTO.setDescription(task.getDescription());
            taskDTO.setStartDate(task.getStartDate());
            taskDTO.setEndDate(task.getEndDate());
            taskDTOList.add(taskDTO);
        }

        GetTaskOutput getTaskOutput = new GetTaskOutput();
        getTaskOutput.setTasks(taskDTOList);
        return getTaskOutput;

    }

    @Override
    public AddTaskOutput addTask(AddTaskInput addTaskInput) {
        Task task = new Task();
        task.setTitle(addTaskInput.getTitle());
        task.setDescription(addTaskInput.getDescription());
        task.setStartDate(addTaskInput.getStartDate());
        task.setEndDate(addTaskInput.getEndDate());

        taskRepository.save(task);

        AddTaskOutput addTaskOutput = new AddTaskOutput();
        addTaskOutput.setMsg("თასქი დაემატა");
        return addTaskOutput;
    }

    @Override
    public void deleteTask(Long id) {
        Task task = taskRepository.getOne(id);
        taskRepository.delete(task);
    }
}
