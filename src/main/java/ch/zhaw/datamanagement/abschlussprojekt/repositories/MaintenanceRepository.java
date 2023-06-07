package ch.zhaw.datamanagement.abschlussprojekt.repositories;

import ch.zhaw.datamanagement.abschlussprojekt.entities.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
    
}