package Finance.Service;


import Finance.DTO.AccountDTO.AccountRequest;
import Finance.DTO.AccountDTO.AccountResponse;
import lombok.RequiredArgsConstructor;
import Finance.model.Account;
import org.springframework.stereotype.Service;
import Finance.repository.AccountRepository;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    public AccountResponse createAccount(AccountRequest accountRequest) {
        Account a = new Account();
        a.setUserId(accountRequest.getUserId());
        a.setName(accountRequest.getName());
        a.setBalance(accountRequest.getBalance());
        a.setCurrency(accountRequest.getCurrency());
        a = accountRepository.save(a);
        var response = new AccountResponse();
        response.setAccountId(a.getAccountId());
        response.setUserId(a.getUserId());
        response.setBalance(a.getBalance());
        response.setCurrency(a.getCurrency());
        return response;
    }
}
