package tsotne.mazmishvili.tsotnemazmishvili1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tsotne.mazmishvili.tsotnemazmishvili1.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
