package ch.zhaw.datamanagement.abschlussprojekt.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Admin {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    private String Name;

    @OneToMany(mappedBy = "admin")
    @JsonManagedReference
    private List<Maintenance> maintenances;
    
}
