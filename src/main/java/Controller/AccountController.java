package Controller;


import DTO.AccountDTO.AccountRequest;
import DTO.AccountDTO.AccountResponse;
import Service.AccountService;
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
