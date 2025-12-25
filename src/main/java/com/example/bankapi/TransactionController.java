package com.example.bankapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TransactionController {
    
    @Autowired
    private BankTransactionRepository transactionRepository;
    
    @GetMapping("/transactions")
    public List<BankTransaction> getAllTransactions() {
        // 调用Repository，从数据库查询所有数据
        return transactionRepository.findAll(); // 让搬运工去数据库里把所有数据搬过来
    }
    
    @PostMapping("/transactions")
    public BankTransaction createTransaction(@RequestBody BankTransaction transaction) {
        // 调用Repository，将接收到的新数据保存到数据库
        return transactionRepository.save(transaction);
    }
}