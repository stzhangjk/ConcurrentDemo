package com.stzhangjk.demo.concurrent.delay.queue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * 元素类
 * 必须实现Delayed接口
 * @see java.util.concurrent.Delayed
 * @see java.util.concurrent.DelayQueue
 */
public class TestDelayedElement implements Delayed {

    private long trigger;

    public TestDelayedElement(long trigger) {
        this.trigger = trigger;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long n = trigger - System.nanoTime();
        return unit.convert(n, TimeUnit.NANOSECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        TestDelayedElement e = (TestDelayedElement)o;
        return Long.compare(trigger, e.getTrigger());
    }

    public long getTrigger() {
        return trigger;
    }
}
