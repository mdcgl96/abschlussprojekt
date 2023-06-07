package ch.zhaw.datamanagement.abschlussprojekt.restcontroller;

import ch.zhaw.datamanagement.abschlussprojekt.entities.Node;
import ch.zhaw.datamanagement.abschlussprojekt.repositories.NodeRepository;

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
public class NodeRestController {
    
    @Autowired
    NodeRepository repository;


    @RequestMapping(value="abschlussprojekt/node", method=RequestMethod.GET)
    public ResponseEntity<List<Node>> getNodes()   {
        List<Node> result = this.repository.findAll();
        return new ResponseEntity<List<Node>>(result, HttpStatus.OK);
    }

    @RequestMapping(value="abschlussprojekt/node/{id}", method=RequestMethod.GET)   
    public ResponseEntity<Node> getEntity(@PathVariable("id") long id) {

        Optional<Node> result = this.repository.findById(id);
        if(result.isEmpty())    {
            return new ResponseEntity<Node>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Node>(result.get(), HttpStatus.OK);
    }
    
}
