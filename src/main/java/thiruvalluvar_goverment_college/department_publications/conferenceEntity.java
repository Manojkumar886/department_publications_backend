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
public class conferenceEntity {
    @Id
    private int serialno;
    private String author;
    private String coauthor;
    private String conferencename;
    private String publisher;
    private String pageno;
    private String volumnno;
    private int month;
    private int yearofpublisher;
    private String sponsership;

}
