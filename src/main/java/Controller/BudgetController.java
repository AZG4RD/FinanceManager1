package Controller;

import DTO.BudgetDTO.BudgetRequest;
import DTO.BudgetDTO.BudgetResponse;
import Service.BudgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/{userId}/budgets")
@RequiredArgsConstructor
public class BudgetController {
    private final BudgetService budgetService;
    @PostMapping
    public BudgetResponse create(
            @PathVariable Integer userId,
            @RequestBody BudgetRequest budgetRequest
    ){
        budgetRequest.setUserId(userId);
        return budgetService.create(budgetRequest);
    }
}
