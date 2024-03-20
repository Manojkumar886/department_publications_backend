package thiruvalluvar_goverment_college.department_publications;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "seminar")
public class seminarEntity {

    @Id
    private int serialno;
    private String name;
    private String seminarname;
    private String venue;
    private Date dateofseminar;
    private String sponsership;

}
