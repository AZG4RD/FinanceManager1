package Finance.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("categories")
public class Category {
    @Id
    private Integer categoryId;
    private String name;
    private String description;
    private String type;
}
