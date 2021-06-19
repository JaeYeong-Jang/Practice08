package com.javaex.ex05;

public class Div {

    private int a;
    private int b;
    
    public Div() {
    	
    }
    
    public Div(int a, int b) {
    	this.a = a;
    	this.b = b;
    	
    }
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

    public int calculate() {
    	int Div = 0;
    	Div = this.a/this.b;
    	return Div;
    }

}
