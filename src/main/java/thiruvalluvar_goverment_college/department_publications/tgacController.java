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

    @GetMapping("/readbyid/{id}")
    public tgacEntity readone(@PathVariable("id") int id) {
        return service.findone(id);
    }

    @DeleteMapping("/deletebyid/{id}")
    public void deleteone(@PathVariable("id") int id) {
        service.deletebyid(id);
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

}