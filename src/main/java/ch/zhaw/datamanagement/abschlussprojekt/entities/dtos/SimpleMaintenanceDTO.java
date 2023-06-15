package ch.zhaw.datamanagement.abschlussprojekt.entities.dtos;

import ch.zhaw.datamanagement.abschlussprojekt.entities.Maintenance;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SimpleMaintenanceDTO {

    private Long id;
    private int duration;
    private Long adminId;
    private Long nodeId;

    public SimpleMaintenanceDTO(Maintenance maintenance){
        this(maintenance.getId(), maintenance.getDuration(), maintenance.getAdmin().getId(), maintenance.getNode().getId());
    }

}
