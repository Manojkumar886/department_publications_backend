package thiruvalluvar_goverment_college.department_publications;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class booksService {
    @Autowired
    booksrepository booksrepo;

    public booksentity bookcreate(booksentity booksdetails) {
        return booksrepo.save(booksdetails);
    }

    public List<booksentity> booklist() {
        return booksrepo.findAll();
    }

    public booksentity bookread(int serialno) {
        return booksrepo.findById(serialno).orElse(new booksentity());
    }

    public String bookdelete(int serialno) {
        booksentity temp = booksrepo.findById(serialno).orElse(new booksentity());

        booksrepo.delete(temp);

        return temp.getAuthor() + " has been deleted successfully";
    }

}
