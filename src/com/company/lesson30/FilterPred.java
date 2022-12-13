package com.company.lesson30;

import java.util.function.Predicate;

public class FilterPred<T> implements Predicate<T> {

    T t;

    public FilterPred(T t) {
        this.t = t;
    }

    @Override
    public boolean test(T t) {
        return t.equals(this.t);
    }
}
