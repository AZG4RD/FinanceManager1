package model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("diagrams")
public class Diagram {
    private Integer diagramId;
    private Integer userId;
    private String title;
    private String type;
    private String configuration;
}
