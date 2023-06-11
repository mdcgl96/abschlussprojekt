package ch.zhaw.datamanagement.abschlussprojekt.restcontroller;

import ch.zhaw.datamanagement.abschlussprojekt.entities.Admin;
import ch.zhaw.datamanagement.abschlussprojekt.repositories.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminRestController {

    @Autowired
    AdminRepository repository;

    @RequestMapping(value="abschlussprojekt/admin", method=RequestMethod.GET)
    public ResponseEntity<List<Admin>> getAdmins()   {
        List<Admin> result = this.repository.findAdmins();
        return new ResponseEntity<List<Admin>>(result, HttpStatus.OK);
    }

    @RequestMapping(value="abschlussprojekt/admin/{id}", method=RequestMethod.GET)   
    public ResponseEntity<Admin> getEntity(@PathVariable("id") long id) {

        Optional<Admin> result = this.repository.findById(id);
        if(result.isEmpty())    {
            return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Admin>(result.get(), HttpStatus.OK);
    }
    
}
