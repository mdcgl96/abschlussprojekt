package ch.zhaw.datamanagement.abschlussprojekt.restcontroller;

import ch.zhaw.datamanagement.abschlussprojekt.entities.Maintenance;
import ch.zhaw.datamanagement.abschlussprojekt.repositories.MaintenanceRepository;

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
public class MaintenanceRestController {
    

    @Autowired
    MaintenanceRepository repository;

    @RequestMapping(value="abschlussprojekt/maintenance", method=RequestMethod.GET)
    public ResponseEntity<List<Maintenance>> getAdmins()   {
        List<Maintenance> result = this.repository.findAll();
        return new ResponseEntity<List<Maintenance>>(result, HttpStatus.OK);
    }

    @RequestMapping(value="abschlussprojekt/admin/{id}", method=RequestMethod.GET)   
    public ResponseEntity<Maintenance> getEntity(@PathVariable("id") long id) {

        Optional<Maintenance> result = this.repository.findById(id);
        if(result.isEmpty())    {
            return new ResponseEntity<Maintenance>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Maintenance>(result.get(), HttpStatus.OK);
    }

}
