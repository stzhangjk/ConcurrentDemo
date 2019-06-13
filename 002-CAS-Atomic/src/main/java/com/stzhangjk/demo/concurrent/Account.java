package com.stzhangjk.demo.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 账户对象
 */
public class Account {
    /**账户余额*/
    private AtomicInteger money;

    public Account() {
        this.money = new AtomicInteger(100);
    }

    public Account(AtomicInteger money) {
        this.money = money;
    }

    public AtomicInteger getMoney() {
        return money;
    }

    public void setMoney(AtomicInteger money) {
        this.money = money;
    }
}
