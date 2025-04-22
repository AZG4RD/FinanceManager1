package Controller;

import DTO.TransactionDTO.TransactionRequest;
import DTO.TransactionDTO.TransactionResponse;
import Service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/{userId}/budgets")
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
