package chapter5.Question;

import java.util.Scanner;

public class StudentMainEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// student, score 클래스로 성적을 입력받아 student,score 클래스 객체로 배열을 다뤄보자.
		
		// student class : 이름, 나이, 학년, 주소, 점수: 과학/수학/영어
		// score class : 과목/점수
		
		String[] str=new String[5];
		Student stud[]=new Student[5];
		
		int math=0;
		int sci=0;
		int eng=0;
		
		for(int i=0; i<str.length;i++) {
			System.out.println((i+1)+"/"+str.length+" 학생 성적을 입력하세요(이름/학년/주소/수학/과학/영어)");
			str[i]=sc.next();

			String person = str[i];
			String[] data=person.split("/");
			
			stud[i] = new Student();
			stud[i].name = data[0];
			stud[i].grade = Integer.parseInt(data[1]);
			stud[i].address = data[2];
			
			stud[i].sco = new Score[3];
			for(int j=0;j<3;j++) {stud[i].sco[j] = new Score();}
			
			stud[i].sco[0].score= Integer.parseInt(data[3]);
			stud[i].sco[1].score= Integer.parseInt(data[4]);
			stud[i].sco[2].score= Integer.parseInt(data[5]);
			
			math+=stud[i].sco[0].score;
			sci+=stud[i].sco[1].score;
			eng+=stud[i].sco[2].score;
			
		}
				
		System.out.println("수학 : "+math+"/ "+(math/str.length));
		System.out.println("과학 : "+sci+"/ "+(sci/str.length));
		System.out.println("영어 : "+eng+"/ "+(eng/str.length));
	}

}
