package com.company.lesson39;

class OuterClass1 {
	int x = 10;
	static int y = 20;
	class InnerClass{
		public void m1(){
			System.out.println("Value of x = "+x);
			System.out.println("Value of y = "+y);
		}
	}
	public void m2(){
		InnerClass i = new  InnerClass();
		i.m1(); 
	}
	public static void main(String[] args){
		OuterClass1 o = new OuterClass1();
		o.m2();
		System.out.println("Outer class main method");
	}
}