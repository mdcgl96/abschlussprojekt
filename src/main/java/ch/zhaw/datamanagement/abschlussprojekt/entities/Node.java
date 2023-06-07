package ch.zhaw.datamanagement.abschlussprojekt.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
// abstract class -> wir werden nie eine Instanz der Klasse Node erzeugen, nur Instanzen der Kind-Klassen Network und Computer.
// abstract verhindert dass es moeglich ist instanzen der klasse zu erzeugen und ermoeglicht auch abstrake methoden.
public abstract class Node {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    private String status;

    @OneToMany
    private List<Maintenance> services;

    @ManyToOne
    private Network company;


    public Node(long id, String status, List<Maintenance> services) {
        this.id = id;
        this.status = status;
        this.services = services;
    }

    public Node() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Maintenance> getServices() {
        return services;
    }

    public void setServices(List<Maintenance> services) {
        this.services = services;
    }

    public Network getCompany() {
        return company;
    }

    public void setCompany(Network company) {
        this.company = company;
    }
    
    
}
