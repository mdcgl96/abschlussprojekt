package ch.zhaw.datamanagement.abschlussprojekt.restcontroller;

import ch.zhaw.datamanagement.abschlussprojekt.entities.Network;
import ch.zhaw.datamanagement.abschlussprojekt.repositories.NetworkRepository;

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
public class NetworkRestController {
    
    @Autowired
    NetworkRepository repository;


    @RequestMapping(value="abschlussprojekt/Network", method=RequestMethod.GET)
    public ResponseEntity<List<Network>> getNetworks()   {
        List<Network> result = this.repository.findAll();
        return new ResponseEntity<List<Network>>(result, HttpStatus.OK);
    }

    @RequestMapping(value="abschlussprojekt/Network/{id}", method=RequestMethod.GET)   
    public ResponseEntity<Network> getEntity(@PathVariable("id") long id) {

        Optional<Network> result = this.repository.findById(id);
        if(result.isEmpty())    {
            return new ResponseEntity<Network>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Network>(result.get(), HttpStatus.OK);
    }

    
    
}
