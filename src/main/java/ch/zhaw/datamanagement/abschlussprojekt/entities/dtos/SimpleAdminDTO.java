package ch.zhaw.datamanagement.abschlussprojekt.entities.dtos;

import ch.zhaw.datamanagement.abschlussprojekt.entities.Admin;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SimpleAdminDTO {
    
    private Long id;
    private String name;

    public SimpleAdminDTO(Admin admin){
        this(admin.getId(), admin.getName());
    }

}
