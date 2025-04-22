package model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table("users")
public class User {
    @Id
    private Integer userId;
    private String username;
    private String email;
    private String password;
    private String role;
    private LocalDateTime createdAt;

}
