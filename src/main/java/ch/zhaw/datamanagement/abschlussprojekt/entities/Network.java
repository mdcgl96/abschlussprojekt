package ch.zhaw.datamanagement.abschlussprojekt.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
public class Network extends Node{

    private String companyName;

    @OneToMany(mappedBy = "network")
    @JsonManagedReference
    private List<Node> nodes;

    public Network(long id, String status, List<Maintenance> services, String companyName, List<Node> nodes) {
        super(id, status, services);
        this.companyName = companyName;
        this.nodes = nodes;
    }


}
