package com.company.lesson31;

public class Telebe implements Cloneable, Comparable<Telebe> {

   private String ad;

    public Telebe(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Telebe{" +
                "ad='" + ad + '\'' +
                '}';
    }

    @Override
    protected Telebe clone() throws CloneNotSupportedException {
        return new Telebe(ad);
    }

    public String getAd() {
        return ad;
    }

    @Override
    public int compareTo(Telebe o) {
        return ad.compareTo(o.getAd());
    }
}
