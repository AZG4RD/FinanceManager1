package Finance.DTO.DiagramDTO;

import lombok.Data;

@Data
public class DiagramResponse {
    private Integer diagramId;
    private Integer userId;
    private String title;
    private String type;
    private String configuration;
}
