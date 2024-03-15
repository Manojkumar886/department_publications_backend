package thiruvalluvar_goverment_college.department_publications;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class conferenceService {

    @Autowired
    conferenceRepository repo;

    public conferenceEntity conferenceCreate(conferenceEntity conferencedetails) {
        return repo.save(conferencedetails);
    }

    public List<conferenceEntity> conferenceList() {
        return repo.findAll();
    }

    public conferenceEntity conferenceread(int serialno) {
        return repo.findById(serialno).orElse(new conferenceEntity());
    }

    public String conferencedelete(int id) {
        conferenceEntity temp = repo.findById(id).orElse(new conferenceEntity());
        repo.delete(temp);
        return temp.getConferencename() + " has been deleted successfully";
    }
}
