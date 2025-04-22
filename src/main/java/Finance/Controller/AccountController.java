package Finance.Controller;


import Finance.DTO.AccountDTO.AccountRequest;
import Finance.DTO.AccountDTO.AccountResponse;
import Finance.Service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/{userId}/accounts")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
    @PostMapping
    public AccountResponse create(@PathVariable Integer userId, @RequestBody AccountRequest accountRequest) {
        accountRequest.setUserId(userId);
        return accountService.createAccount(accountRequest);
    }
}
