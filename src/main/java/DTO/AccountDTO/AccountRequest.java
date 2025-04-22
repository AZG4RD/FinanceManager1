package DTO.AccountDTO;

import lombok.Data;

@Data
public class AccountRequest {
    private int userId;
    private  String name;
    private java.math.BigDecimal balance;
    private String currency;
}
