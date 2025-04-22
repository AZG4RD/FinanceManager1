package Finance.DTO.AccountDTO;

import lombok.Data;

@Data
public class AccountResponse {
    private Integer accountId;
    private Integer userId;
    private String name;
    private java.math.BigDecimal balance;
    private String currency;
}
