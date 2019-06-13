package com.stzhangjk.demo.concurrent;

public class AtomicTest {
    public static void main(String[] args) {
        Account account = new Account();
        Thread t1 = new TakeMoneyThread(account, account.getMoney().get(), 100);
        Thread t2 = new TakeMoneyThread(account, account.getMoney().get(), 100);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("账户余额：" + account.getMoney().get());

    }

}
