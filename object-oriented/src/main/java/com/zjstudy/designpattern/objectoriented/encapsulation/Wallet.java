package com.zjstudy.designpattern.objectoriented.encapsulation;

import java.math.BigDecimal;
import java.util.UUID;

public class Wallet {

    /**
     * 钱包的唯一编号
     */
    private String id;

    /**
     * 钱包创建的时间
     */
    private long createTime;

    /**
     * 钱包中的余额
     */
    private BigDecimal balance;

    /**
     * 上次钱包余额变更的时间
     */
    private long balanceLastModified;

    public Wallet() {
        this.id = UUID.randomUUID().toString();
        this.createTime = System.currentTimeMillis();
        this.balance = BigDecimal.ZERO;
        this.balanceLastModified = System.currentTimeMillis();
    }

    public String getId() {
        return id;
    }

    public long getCreateTime() {
        return createTime;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public long getBalanceLastModified() {
        return balanceLastModified;
    }

    public void increaseBalance(BigDecimal increasedAmount) {
        if (increasedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("increasedAmount < 0");
        }
        this.balance.add(increasedAmount);
        this.balanceLastModified = System.currentTimeMillis();
    }

    public void decreaseBalance(BigDecimal decreasedAmount) {
        if (decreasedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("decreasedAmount < 0");
        }
        if (decreasedAmount.compareTo(this.balance) > 0) {
            throw new RuntimeException("decreasedAmount > balance");
        }
        this.balance.subtract(decreasedAmount);
        this.balanceLastModified = System.currentTimeMillis();
    }
}
