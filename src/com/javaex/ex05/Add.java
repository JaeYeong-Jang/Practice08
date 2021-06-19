package com.javaex.ex05;

public class Add {
    
    private int a;
    private int b;
    
    public Add() {
    	
    }
    
    public Add(int a, int b) {
    	this.a = a;
    	this.b = b;
    	
    }
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

    public int calculate() {
    	int sum = 0;
    	sum = this.a + this.b;
    	return sum;
    }

}
