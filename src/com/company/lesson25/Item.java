package com.company.lesson25;

public class Item {
    boolean red;
    boolean big;

    public boolean isRed() {
        return red;
    }

    public void setRed(boolean red) {
        var sd = As.sd();
//        As sd = new As();
        this.red = red;
    }

    public boolean isBig() {
        return big;
    }

    public void setBig(boolean big) {
        this.big = big;
    }
}
