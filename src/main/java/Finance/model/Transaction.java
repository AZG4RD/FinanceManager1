package Finance.model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Table("transactions")
public class Transaction {
    private Integer transactionId;
    private Integer userId;
    private Integer categoryId;
    private Integer accounttId;
    private BigDecimal amount;
    private String description;
    private LocalDateTime date;
    private String type;
}
