package tsotne.mazmishvili.tsotnemazmishvili2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tsotne.mazmishvili.tsotnemazmishvili2.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
