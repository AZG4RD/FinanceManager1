package Finance.Service;

import Finance.DTO.BudgetDTO.BudgetRequest;
import Finance.DTO.BudgetDTO.BudgetResponse;
import lombok.RequiredArgsConstructor;
import Finance.model.Budget;
import org.springframework.stereotype.Service;
import Finance.repository.BudgetRepository;

@Service
@RequiredArgsConstructor
public class BudgetService {
    private final BudgetRepository budgetRepository;
    public BudgetResponse create(BudgetRequest budgetRequest) {
       Budget b = new Budget();
       b.setUserId(budgetRequest.getUserId());
       b.setCategoryId(budgetRequest.getCategoryId());
       b.setAmount(budgetRequest.getAmount());
       b.setStartDate(budgetRequest.getStartDate());
       b.setEndDate(budgetRequest.getEndDate());
       b = budgetRepository.save(b);
       var response = new BudgetResponse();
       response.setBudgetId(b.getBudgetId());
       response.setUserId(b.getUserId());
       response.setCategoryId(b.getCategoryId());
       response.setAmount(b.getAmount());
       response.setStartDate(b.getStartDate());
       response.setEndDate(b.getEndDate());
       return response;
    }
}
