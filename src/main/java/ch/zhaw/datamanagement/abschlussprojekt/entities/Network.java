package ch.zhaw.datamanagement.abschlussprojekt.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Network extends Node{

    private String companyName;

    @OneToMany
    private List<Node> node;

    public Network(long id, String status, List<Maintenance> services, String companyName, List<Node> node) {
        super(id, status, services);
        this.companyName = companyName;
        this.node = node;
    }

    public Network() {
        super();
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Node> getNode() {
        return node;
    }

    public void setNode(List<Node> node) {
        this.node = node;
    }
    

}
