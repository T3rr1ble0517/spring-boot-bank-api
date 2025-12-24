package com.example.bankapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class TransactionController {
    
    @GetMapping("/transactions")
    public List<BankTransaction> getAllTransactions() {
        BankTransaction t1 = new BankTransaction(1001L, "C1001", "存款", 5000.0, "网银");
        BankTransaction t2 = new BankTransaction(1002L, "C1002", "取款", -2000.0, "ATM");
        BankTransaction t3 = new BankTransaction(1003L, "C1001", "转账", -1500.0, "手机银行");
        return Arrays.asList(t1, t2, t3);
    }
}