package tsotne.mazmishvili.tsotnemazmishvili1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tsotne.mazmishvili.tsotnemazmishvili1.model.Book;


public interface BookRepository extends JpaRepository<Book, Long> {
}
