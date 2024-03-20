package thiruvalluvar_goverment_college.department_publications;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * tgacController
 */

// http://localhost:8080
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/department_publications")
public class tgacController {
    @Autowired
    tgacService service;

    // http://localhost:8080/create
    @PostMapping("/create")
    public String maincreate(@RequestBody tgacEntity journaldetails) {
        return service.makeCreate(journaldetails).getAuthor() + " has been added successfully";
    }

    // http://localhost:8080/list
    @GetMapping("/")
    public List<tgacEntity> viewAll() {
        return service.makeAll();
    }

    @GetMapping("/read/{id}")
    public tgacEntity read(@PathVariable("id") int id) {
        return service.makereadone(id);
    }

    @DeleteMapping("/deleteone/{id}")
    public String remove(@PathVariable("id") int id) {
        return service.remove(id) + "";
    }

    @PutMapping("/updating")
    public String updateoneprofile(@RequestBody tgacEntity entitydetails) {
        tgacEntity temp = entitydetails;
        service.makeCreate(temp);
        return temp.getAuthor() + " has been updated successfully";
    }

    @GetMapping("/findbyauthor/{name}")
    public List<tgacEntity> getMethodName(@PathVariable("name") String name) {
        return service.findusingisbn(name);
    }

    @GetMapping("/sorting")
    public List<tgacEntity> asecentingorder() {
        System.out.println("your values is sorted..!");
        return service.ascendingorderbyyear();
    }

    // CONFERENCE MAPPING
    @Autowired
    conferenceService conservice;

    @PostMapping("/conferencecreate")
    public String postMethodName(@RequestBody conferenceEntity conferencedetails) {
        return conservice.conferenceCreate(conferencedetails).getAuthor() + " has been added successfully";
    }

    @GetMapping("/conferencelist")
    public List<conferenceEntity> conferencelist() {
        return conservice.conferenceList();
    }

    @GetMapping("/conferenceread/{id}")
    public conferenceEntity conferenceread(@PathVariable("id") int id) {
        return conservice.conferenceread(id);
    }

    @DeleteMapping("/deleteconference/{id}")
    public String conferenceremove(@PathVariable("id") int id) {
        return conservice.conferencedelete(id) + "";
    }

    @PutMapping("/updateconference")
    public String updateconference(@RequestBody conferenceEntity conferencedetails) {
        conferenceEntity temp = conferencedetails;
        conservice.conferenceCreate(temp);
        return temp.getAuthor() + " has been updated successfully";
    }

    @GetMapping("/findbyauthorusingconference/{author}")
    public List<conferenceEntity> findbyauthorconference(@PathVariable("author") String author) {
        return conservice.findbyauthor(author);
    }
    // BOOKS MAPPING

    @Autowired
    booksService bookservice;

    @PostMapping("/bookscreate")
    public String createbook(@RequestBody booksentity bookdetails) {
        return bookservice.bookcreate(bookdetails).getAuthor() + " has been added successfully";
    }

    @PutMapping("/bookupdate")
    public String updatebook(@RequestBody booksentity bookdetails) {
        booksentity temp = bookdetails;
        return bookservice.bookcreate(temp).getAuthor() + " has been updated done";
    }

    @GetMapping("/booklistall")
    public List<booksentity> listallbooks() {
        return bookservice.booklist();
    }

    @GetMapping("/bookread/{serialno}")
    public booksentity readbook(@PathVariable("serialno") int serialno) {
        return bookservice.bookread(serialno);
    }

    @DeleteMapping("/bookdelete/{serialno}")
    public String deletebook(@PathVariable("serialno") int serialno) {
        return bookservice.bookdelete(serialno) + " ";
    }

    // Seminar Performance
    @Autowired
    seminarService semiservice;

    @PostMapping("/createseminar")
    public seminarEntity seminarcreate(@RequestBody seminarEntity seminardetails) {
        return semiservice.createseminar(seminardetails);
    }

    @GetMapping("/listallseminar")
    public List<seminarEntity> seminarlist() {
        return semiservice.listseminar();
    }

    @GetMapping("/readseminar/{serialno}")
    public seminarEntity seminarread(@PathVariable("serialno") int serialno) {
        return semiservice.readseminar(serialno);
    }

    @DeleteMapping("/deleteseminar/{serialno}")
    public String seminardelete(@PathVariable("serialno") int serialno) {
        return semiservice.deleteseminar(serialno);
    }

    @PutMapping("/updateseminar")
    public String seminarupdate(@RequestBody seminarEntity seminardetail) {
        return semiservice.createseminar(seminardetail).getSeminarname() + " has been updated successfully";
    }
}