package com.java.Cl;

public class Person {
	String name;
	String job;
	String gender;
	String blood;
	int age;
	
	Person(){
		this("이름없음",0);
	}
	
	Person(String name,int age){
		this("이름없음",0,"알수없음","알수없음","직업없음");
	}

	Person(String name, int age, String blood, String gender,String job){
		this.name=name;
		this.age=age;		
		this.gender=gender;
		this.blood=blood;
		this.job=job;
	}

	public void play() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+gender);
		System.out.println("직업 : "+job);
		System.out.println("혈액형 : "+blood);
		
		if(this.job.equals("의사")) {
			System.out.println("진료한다.");
		}else if(this.job.equals("골퍼")) {
			System.out.println("골프친다.");
		}else if(this.job.equals("교사")) {
			System.out.println("가르친다.");
		}else {
		
		}
		
	}
	
}
