package com.java.Cl.calc;

public class Substract extends Calculator {

	public Substract(int op1, int op2) {
		this.op1=op1;
		this.op2=op2;
	}
	
	public int sub() {
		return op1-op2;
	}

}
