package DTO.BudgetDTO;

import lombok.Data;

@Data
public class BudgetResponse {
    private Integer budgetId;
    private Integer userId;
    private Integer categoryId;
    private java.math.BigDecimal amount;
    private java.time.LocalDate startDate;
    private java.time.LocalDate endDate;
}
