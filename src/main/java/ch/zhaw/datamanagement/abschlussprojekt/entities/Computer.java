package ch.zhaw.datamanagement.abschlussprojekt.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "id")
@Getter
@Setter
@NoArgsConstructor
public class Computer extends Node {

    private String macAdress;

    public Computer(long id, String status, List<Maintenance> services, String macAdress) {
        super(id, status, services);
        this.macAdress = macAdress;
    }


    
}
