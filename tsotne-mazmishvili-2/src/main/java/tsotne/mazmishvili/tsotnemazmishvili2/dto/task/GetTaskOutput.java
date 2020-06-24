package tsotne.mazmishvili.tsotnemazmishvili2.dto.task;

import lombok.Data;

import java.util.List;

@Data
public class GetTaskOutput {
    private List<TaskDTO> tasks;
}
