package tsotne.mazmishvili.tsotnemazmishvili1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
public class Author {
    @Id
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "author",cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Book> books=new ArrayList<>();
}
