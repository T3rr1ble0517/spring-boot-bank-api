package com.example.bankapi;
import jakarta.persistence.*;
@Entity // 标签1：说明这个类对应一张数据库表
@Table(name = "bank_transaction") // 标签2：给表取个名字
public class BankTransaction {
    @Id // 标签3：说明这个字段是唯一主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 标签4：让ID自动增长
    private Long id;
    private String customerId;
    private String type;
    private Double amount;
    private String channel;
    
    public BankTransaction() {}

    public BankTransaction(Long id, String customerId, String type, Double amount, String channel) {
        this.id = id;
        this.customerId = customerId;
        this.type = type;
        this.amount = amount;
        this.channel = channel;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getChannel() { return channel; }
    public void setChannel(String channel) { this.channel = channel; }
}