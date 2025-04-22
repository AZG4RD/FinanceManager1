package Finance.Service;

import Finance.DTO.TransactionDTO.TransactionRequest;
import Finance.DTO.TransactionDTO.TransactionResponse;
import lombok.RequiredArgsConstructor;
import Finance.model.Transaction;
import org.springframework.stereotype.Service;
import Finance.repository.TransactionRepository;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository transactionRepository;
    public TransactionResponse create(TransactionRequest transactionRequest) {
        Transaction t = new Transaction();
        t.setUserId(transactionRequest.getUserId());
        t.setCategoryId(transactionRequest.getCategoryId());
        t.setAccounttId(transactionRequest.getAccountId());
        t.setAmount(transactionRequest.getAmount());
        t.setDate(transactionRequest.getDate());
        t.setDescription(transactionRequest.getDescription());
        t.setType(transactionRequest.getType());
        t = transactionRepository.save(t);
        var transactionResponse = new TransactionResponse();
        transactionResponse.setTransactionId(t.getTransactionId());
        transactionResponse.setUserId(t.getUserId());
        transactionResponse.setCategoryId(t.getCategoryId());
        transactionResponse.setAccountId(t.getAccounttId());
        transactionResponse.setAmount(t.getAmount());
        transactionResponse.setDate(t.getDate());
        transactionResponse.setDescription(t.getDescription());
        transactionResponse.setType(t.getType());
        return transactionResponse;
    }
}
