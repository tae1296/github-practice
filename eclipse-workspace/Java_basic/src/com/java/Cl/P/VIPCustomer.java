package com.java.Cl.P;

public class VIPCustomer extends Customer {
	private int agentID;
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	public int getAgentID() {
		return agentID;
	}

	double saleRatio;
	
	public VIPCustomer() {
		this(0,"");
	}
	
	public VIPCustomer(int id, String name) {
		customerGrade="VIP";
		customerName=name;
		bonusRatio=0.05;
		saleRatio=0.1;
		System.out.println("vip");
	}
	
	public int calcPrice(int price) {
		bonusPoint +=price*bonusRatio;
		return price -(int)(price*saleRatio);
	}
	
	public String showVIPinfo() {
		return super.showCustomerInfo()+ " 담당 상담원 아이디는 "+agentID+"입니다.";
	}
}
