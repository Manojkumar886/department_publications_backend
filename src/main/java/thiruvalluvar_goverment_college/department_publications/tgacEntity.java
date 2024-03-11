package thiruvalluvar_goverment_college.department_publications;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Journal")
public class tgacEntity {
    @Id // primary key
    private int serialno;
    @Column(name = "ISBN/ISSN")
    private String isbnno_issnno;
    private String author;
    private String coauthor;
    private String article;
    private String journalname;
    private String pageno;
    private int yearofpublication;
    private String publicationmainid;
    private String conferencetype;
    @Column(name = "online/Offline")
    private String online_offline;

}
