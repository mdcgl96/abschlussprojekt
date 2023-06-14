package ch.zhaw.datamanagement.abschlussprojekt.entities.ids;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Embeddable
@EqualsAndHashCode
@NoArgsConstructor
public class MaintenanceId implements Serializable{

    @Column(name = "admin_id")
    private Long adminId;
 
    @Column(name = "node_id")
    private Long nodeId;
 
    public MaintenanceId(
        Long adminId,
        Long nodeId) {
        this.adminId = adminId;
        this.nodeId = nodeId;
    }
}