package ch.zhaw.datamanagement.abschlussprojekt.repositories;

import ch.zhaw.datamanagement.abschlussprojekt.entities.Node;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/default")
public interface NodeRepository extends JpaRepository<Node, Long> {
    
}