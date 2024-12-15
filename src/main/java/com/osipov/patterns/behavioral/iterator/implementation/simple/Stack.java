package com.osipov.patterns.behavioral.iterator.implementation.simple;

import java.util.Collection;

public interface Stack<T> {
    void push(T item);
    void pushAll(Collection<? extends T> collection);
    T pop();
    void popAll(Collection<? super T> collection);
    boolean isEmpty();
}
