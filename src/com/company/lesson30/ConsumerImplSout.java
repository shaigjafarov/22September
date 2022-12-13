package com.company.lesson30;

import java.util.function.Consumer;

public class ConsumerImplSout implements Consumer {

    @Override
    public void accept(Object o) {
        System.out.println(o);
    }
}
