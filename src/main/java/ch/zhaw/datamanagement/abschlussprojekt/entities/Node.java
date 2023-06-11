package ch.zhaw.datamanagement.abschlussprojekt.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "id")
// abstract class -> wir werden nie eine Instanz der Klasse Node erzeugen, nur Instanzen der Kind-Klassen Network und Computer.
// abstract verhindert dass es moeglich ist instanzen der klasse zu erzeugen und ermoeglicht auch abstrake methoden.
public class Node {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    private String status;

    @OneToMany(mappedBy = "node")
    @JsonManagedReference
    private List<Maintenance> services;

    @ManyToOne
    @JsonBackReference
    private Network network;



    public Node(long id, String status, List<Maintenance> services) {
        this.id = id;
        this.status = status;
        this.services = services;
    }

    public Node() {
    }
    
    
}
