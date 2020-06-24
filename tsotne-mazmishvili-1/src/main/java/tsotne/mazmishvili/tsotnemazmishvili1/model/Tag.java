package tsotne.mazmishvili.tsotnemazmishvili1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class Tag {
    @Id
    private Long id;
    private String name;

    @ToString.Exclude
    @ManyToOne()
    private Book book;
}
