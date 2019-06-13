package com.stzhangjk.demo.concurrent;

/**
 * 取款线程
 */
public class TakeMoneyThread extends Thread {

    private Account account;
    private int moneyToTake;
    private int oldValue;

    public TakeMoneyThread(Account account, int moneyToTake, int oldValue) {
        this.account = account;
        this.moneyToTake = moneyToTake;
        this.oldValue = oldValue;
    }

    @Override
    public void run() {
        if (this.account.getMoney().compareAndSet(oldValue, oldValue - moneyToTake)) //CAS
            System.out.println("["+Thread.currentThread().getName()+"]取款" + moneyToTake + "元成功。");
        else System.out.println("["+Thread.currentThread().getName()+"]账户余额异常");
    }
}
