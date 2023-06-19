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
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@EqualsAndHashCode
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "id")

public abstract class Node {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    private String status;

    @OneToMany(mappedBy = "node")
    @JsonManagedReference
    private List<Maintenance> maintenances;

    @ManyToOne
    @JsonBackReference
    private Node network;
    // Warum network nicht im allargsconstructor?

    public Node(long id, String status, List<Maintenance> maintenances) {
        this.id = id;
        this.status = status;
        this.maintenances = maintenances;
    }

    public Node() {
    }
    
}
