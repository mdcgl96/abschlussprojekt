package ch.zhaw.datamanagement.abschlussprojekt.repositories;

import ch.zhaw.datamanagement.abschlussprojekt.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    
}
