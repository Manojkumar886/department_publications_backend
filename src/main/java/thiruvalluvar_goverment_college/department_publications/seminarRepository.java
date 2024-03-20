package thiruvalluvar_goverment_college.department_publications;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface seminarRepository extends JpaRepository<seminarEntity, Integer> {

}
