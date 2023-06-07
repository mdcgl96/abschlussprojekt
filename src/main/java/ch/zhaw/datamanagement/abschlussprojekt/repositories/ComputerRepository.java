package ch.zhaw.datamanagement.abschlussprojekt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.datamanagement.abschlussprojekt.entities.Computer;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    
}
