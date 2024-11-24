package com.osipov.patterns.creational.singleton.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        List<Future<Singleton>> futures = new ArrayList<>();
        try (ExecutorService executorService = Executors.newCachedThreadPool()) {
            for (int i = 0; i < 100; i++) {
                futures.add(executorService.submit(Singleton::getInstance));
            }
        }

        Singleton singleton = Singleton.getInstance();
        boolean match = futures.stream()
                .map(Main::getFuture)
                .allMatch(s -> s == singleton);
        System.out.println(match ? "singleton work correct" : "singleton does not work");
    }

    private static <T> T getFuture(Future<T> future) {
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
