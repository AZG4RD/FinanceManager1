package model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Table("budgets")
public class Budget {
    @Id
    private Integer budgetId;
    private Integer userId;
    private Integer categoryId;
    private BigDecimal amount;
    private LocalDate startDate;
    private LocalDate endDate;
}
