package com.javaex.ex05;

public class Mul {

    private int a;
    private int b;
    
    public Mul() {
    	
    }
    
    public Mul(int a, int b) {
    	this.a = a;
    	this.b = b;
    	
    }
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

    public int calculate() {
    	int Mul = 0;
    	Mul = this.a * this.b;
    	return Mul;
    }

}
