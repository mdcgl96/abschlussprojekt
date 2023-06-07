package ch.zhaw.datamanagement.abschlussprojekt.repositories;

import ch.zhaw.datamanagement.abschlussprojekt.entities.Node;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NodeRepository extends JpaRepository<Node, Long> {
    
}