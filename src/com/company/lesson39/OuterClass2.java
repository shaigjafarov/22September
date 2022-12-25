package com.company.lesson39;

class OuterClass2 {
	static int r=3;
	int er=4;
	public void m1(){
		int salam=43;
		class InnerClass{
			 public int sum(int x , int y){
				return salam;
			}
		}
		InnerClass i = new  InnerClass();
		System.out.println("Sum :- "+i.sum(r, er));
	}
	public static void main(String[] args){
		OuterClass2 o = new OuterClass2();
		o.m1();
		System.out.println("Outer class main method");
	}
}