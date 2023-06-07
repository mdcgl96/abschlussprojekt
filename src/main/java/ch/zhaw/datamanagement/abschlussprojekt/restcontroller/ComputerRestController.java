package ch.zhaw.datamanagement.abschlussprojekt.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.datamanagement.abschlussprojekt.entities.Computer;
import ch.zhaw.datamanagement.abschlussprojekt.repositories.ComputerRepository;




@RestController
public class ComputerRestController{

    @Autowired
    ComputerRepository repository;


    @RequestMapping(value="abschlussprojekt/computer", method=RequestMethod.GET)
    public ResponseEntity<List<Computer>> getComputers()   {
        List<Computer> result = this.repository.findAll();
        return new ResponseEntity<List<Computer>>(result, HttpStatus.OK);
    }

    @RequestMapping(value="abschlussprojekt/computer/{id}", method=RequestMethod.GET)   
    public ResponseEntity<Computer> getEntity(@PathVariable("id") long id) {

        Optional<Computer> result = this.repository.findById(id);
        if(result.isEmpty())    {
            return new ResponseEntity<Computer>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Computer>(result.get(), HttpStatus.OK);
    }
    
}
