package thiruvalluvar_goverment_college.department_publications;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class seminarService {
    @Autowired
    seminarRepository repo;

    // public String a()
    // {
    // return "Manoj";
    // }

    public seminarEntity createseminar(seminarEntity seminardetails) {
        return repo.save(seminardetails);
    }

    public List<seminarEntity> listseminar() {
        return repo.findAll();
    }

    public seminarEntity readseminar(int serialno) {
        return repo.findById(serialno).orElse(new seminarEntity());
    }

    public String deleteseminar(int serialno) {
        seminarEntity temp = repo.findById(serialno).orElse(new seminarEntity());

        repo.delete(temp);

        return temp.getSeminarname() + " has been deleted successfully";
    }
}
