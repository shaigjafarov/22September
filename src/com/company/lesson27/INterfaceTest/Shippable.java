package com.company.lesson27.INterfaceTest;

import com.company.lesson27.Zebra;

public interface Shippable <T,K>{


    void ship(K t);
}

class  Crate implements Shippable<Integer,Zebra>{



    @Override
    public void ship(Zebra t) {
        Object[] sdg = new Object[]{1, "as", 2.0, new Zebra()};
    }
}