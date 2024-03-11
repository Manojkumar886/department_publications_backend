package thiruvalluvar_goverment_college.department_publications;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tgacService {
    @Autowired // object creation
    tgacRepository repo;

    public tgacEntity makeCreate(tgacEntity journaldetails) {
        return repo.save(journaldetails);
    }

    public List<tgacEntity> makeAll() {
        return repo.findAll();
    }

    public tgacEntity makereadone(int serialno) {
        return repo.findById(serialno).orElse(new tgacEntity());
    }

    public String remove(int id) {
        tgacEntity temp = repo.findById(id).orElse(new tgacEntity());
        repo.delete(temp);
        return temp.getIsbnno_issnno() + " has been deleted successfully";
    }

    public List<tgacEntity> findusingisbn(String name) {
        return repo.findByAuthor(name);
    }

    public List<tgacEntity> ascendingorderbyyear() {
        return repo.findAllOrderByYearofpublicationList();
    }
}