package com.example.bankapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankTransactionRepository extends JpaRepository<BankTransaction, Long> {
    // 这里面是空的，什么也不用写！
    // 这个接口会自动拥有“存数据”、“查所有数据”、“按ID查数据”、“删数据”等超能力。
}