package tsotne.mazmishvili.tsotnemazmishvili1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tsotne.mazmishvili.tsotnemazmishvili1.model.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
