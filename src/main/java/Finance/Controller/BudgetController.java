package Finance.Controller;

import Finance.DTO.BudgetDTO.BudgetRequest;
import Finance.DTO.BudgetDTO.BudgetResponse;
import Finance.Service.BudgetService;
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
