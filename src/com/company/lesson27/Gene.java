package com.company.lesson27;

public  class Gene<T> {

    T t;

    T[] arr;

    T get() {
        return t;
    }

    void set(T t) {
        this.t = t;
    }

    T[] arr(){
       return arr;
    }
    void  setArr(T[] arr){
      this.arr=arr;
    }



}
