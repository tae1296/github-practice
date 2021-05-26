package com.java.Cl.calc;

public class Calculator {
	int op1, op2;
	
		public void setOp1(int op1) {
			this.op1 = op1;
		}
		
		public void setOp2(int op2) {
			this.op2 = op2;
		}

	public Calculator() {
		this(0,0);
	}
	
	public Calculator(int op1,int op2) {
		this.op1=op1;
		this.op2=op2;
	}
	
	public int sum() {
		return op1+op2;
	}
	
	public double avg() {
		return sum()/2;
	}
	
}
