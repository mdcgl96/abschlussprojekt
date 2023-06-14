package ch.zhaw.datamanagement.abschlussprojekt.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import ch.zhaw.datamanagement.abschlussprojekt.entities.ids.MaintenanceId;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "id")
public class Maintenance {
    
    @EmbeddedId
    private MaintenanceId id;

    private int duration;

    @ManyToOne
    @MapsId("nodeId")
    private Node node; 

    @ManyToOne
    @JsonBackReference
    @MapsId("adminId")
    private Admin admin;

    // TODO: das "@JoinColumn" noch implementieren (siehe link)
    // TODO: drop and create db
}
