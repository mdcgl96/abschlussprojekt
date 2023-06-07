package ch.zhaw.datamanagement.abschlussprojekt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.datamanagement.abschlussprojekt.entities.Network;

public interface NetworkRepository extends  JpaRepository<Network, Long>{
    
}