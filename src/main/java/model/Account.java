package model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Data
@Table("accounts")
public class Account {
    @Id
    private Integer accountId;
    private Integer userId;
    private String name;
    private BigDecimal balance;
    private String currency;
}
