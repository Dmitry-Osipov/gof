package com.osipov.patterns.creational.singleton.implementation;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
    private static Singleton instance;
    private static final Lock lock = new ReentrantLock();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            lock.lock();
            if (instance == null) {
                instance = new Singleton();
            }
            lock.unlock();
        }

        return instance;
    }
}
