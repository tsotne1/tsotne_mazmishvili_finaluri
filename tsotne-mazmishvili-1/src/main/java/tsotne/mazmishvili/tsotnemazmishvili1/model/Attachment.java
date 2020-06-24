package tsotne.mazmishvili.tsotnemazmishvili1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;


@Data
@Entity
public class Attachment {
    @Id
    private Long id;
    private String pdfUrl;

    @OneToOne(mappedBy = "attachment", cascade = CascadeType.ALL)
    @ToString.Exclude
    private Book book;
}
