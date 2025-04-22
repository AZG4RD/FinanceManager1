package Finance.DTO.TransactionDTO;

import lombok.Data;

@Data
public class TransactionRequest {
    private Integer userId;
    private Integer categoryId;
    private Integer accountId;
    private java.math.BigDecimal amount;
    private java.time.LocalDateTime date;
    private String description;
    private String type;
}
