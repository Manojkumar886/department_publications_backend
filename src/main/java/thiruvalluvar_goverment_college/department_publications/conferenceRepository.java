package thiruvalluvar_goverment_college.department_publications;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface conferenceRepository extends JpaRepository<conferenceEntity, Integer> {
    public List<conferenceEntity> findByAuthor(String author);
}
