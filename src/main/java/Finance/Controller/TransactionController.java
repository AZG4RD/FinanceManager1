package Finance.Controller;

import Finance.DTO.TransactionDTO.TransactionRequest;
import Finance.DTO.TransactionDTO.TransactionResponse;
import Finance.Service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/{userId}/transactions")
@RequiredArgsConstructor
public class TransactionController {
    private final TransactionService transactionService;
    @PostMapping
    public TransactionResponse create(
            @PathVariable Integer userId,
            @RequestBody TransactionRequest transactionRequest
            ){
        transactionRequest.setUserId(userId);
        return transactionService.create(transactionRequest);
    }
}
