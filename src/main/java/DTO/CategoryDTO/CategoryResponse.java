package DTO.CategoryDTO;

import lombok.Data;

@Data
public class CategoryResponse {
    private Integer categoryId;
    private String name;
    private String description;
    private String type;
}
