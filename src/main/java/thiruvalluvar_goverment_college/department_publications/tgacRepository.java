package thiruvalluvar_goverment_college.department_publications;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface tgacRepository extends JpaRepository<tgacEntity, Integer> {

    // HQL-Hibernate Query Language
    public List<tgacEntity> findByAuthor(String author);

    @Query("from tgacEntity ORDER BY yearofpublication ASC")
    public List<tgacEntity> findAllOrderByYearofpublicationList();

}
