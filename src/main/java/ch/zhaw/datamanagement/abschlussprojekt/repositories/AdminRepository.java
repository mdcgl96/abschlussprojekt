package ch.zhaw.datamanagement.abschlussprojekt.repositories;

import ch.zhaw.datamanagement.abschlussprojekt.entities.Admin;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    @Query(value= "SELECT * FROM Admin", nativeQuery = true)
    List<Admin> findAdmins();
}
