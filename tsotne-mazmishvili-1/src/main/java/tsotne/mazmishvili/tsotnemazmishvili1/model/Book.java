package tsotne.mazmishvili.tsotnemazmishvili1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Book {
    @Id
    private Long id;
    private String tilte;
    private String desription;

    @OneToOne(cascade = CascadeType.ALL)
    @ToString.Exclude
    private Attachment attachment;

    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Author> author = new ArrayList<>();

    @ToString.Exclude
    @OneToMany( mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Tag> tag = new ArrayList<>();
}
