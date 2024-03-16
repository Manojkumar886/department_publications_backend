package thiruvalluvar_goverment_college.department_publications;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class booksentity {
    @Id
    private int serialno;
    private String author;
    private String coauthor;
    private String bookname;
    private String publisher;
    private int year;
    private String isbn_issnno;
    private String publishercompanyname;
    private String edition;
    private String sponsership;

}
