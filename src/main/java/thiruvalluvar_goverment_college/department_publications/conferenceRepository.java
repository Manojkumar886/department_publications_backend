package thiruvalluvar_goverment_college.department_publications;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface conferenceRepository extends JpaRepository<conferenceEntity, Integer> {

}
