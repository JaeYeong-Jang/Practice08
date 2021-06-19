package com.javaex.ex05;

public class Sub {

    private int a;
    private int b;
    
    public Sub() {
    	
    }
    
    public Sub(int a, int b) {
    	this.a = a;
    	this.b = b;
    	
    }
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

    public int calculate() {
    	int Sub = 0;
    	Sub = this.a - this.b;
    	return Sub;
    }

}
