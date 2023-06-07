package ch.zhaw.datamanagement.abschlussprojekt.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CompositeIterator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.pattern.parser.Node;
import ch.zhaw.datamanagement.abschlussprojekt.entities.Computer;
import ch.zhaw.datamanagement.abschlussprojekt.entities.Network;
import ch.zhaw.datamanagement.abschlussprojekt.repositories.ComputerRepository;
import ch.zhaw.datamanagement.abschlussprojekt.repositories.NodeRepository;

@RestController
@RequestMapping("/computers")
public class ComputerRestController{

    @Autowired
    private ComputerRepository computerRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Computer> getComputerById(@PathVariable Long id) {
        Optional<Node> node = computerRepository.findById(id);
        Optional<Computer> computer = node.map(n -> (Computer) n);

        if (computer.isPresent()) {
            return ResponseEntity.ok(computer.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
