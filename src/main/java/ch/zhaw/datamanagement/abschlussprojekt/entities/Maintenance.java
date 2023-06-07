package ch.zhaw.datamanagement.abschlussprojekt.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Maintenance {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    private int duration;

    @ManyToOne
    private Admin admin;

    @ManyToOne
    private Node node;
    
}
