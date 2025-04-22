package Finance.DTO.UserDTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserResponse {
    private Integer userId;
    private String username;
    private String email;
    private String role;
    private LocalDateTime createdAt;
}
