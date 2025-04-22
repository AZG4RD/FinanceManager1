package DTO.DiagramDTO;

import lombok.Data;

@Data
public class DiagramRequest {
    private Integer userId;
    private String title;
    private String type;
    private String configuration;
}
