package chpter5;

public class StudentMain3 {

	public static void main(String[] args) {
		// Student2, Score2 이용.
		
		Student2 stud=new Student2();
		Student2 stud2=new Student2();
		
		
		//홍길동/ 구로구/ 3학년/ 수학 100, 국어 90
		
		stud.studentName = "홍길동";
		stud.address = "구로구";
		stud.grade = 3;
		
		stud.subj2 = new Score2[2];
		stud.subj2[0] = new Score2();
		stud.subj2[1] = new Score2();
		stud.subj2[0].subject = "수학";
		stud.subj2[0].score = 100;
		stud.subj2[1].subject = "국어";
		stud.subj2[1].score = 90;
		
		System.out.println(stud.studentName +"\t" +stud.address +
				"\t"+stud.grade+"학년\t"+stud.subj2[0].subject+":"
				+stud.subj2[0].score+"\t"+stud.subj2[1].subject+":"
				+stud.subj2[1].score);
		
		//고길동/ 영등포구/ 3학년/ 수학 70, 국어 80
		stud2.studentName = "고길동";
		stud2.address = "영등포구";
		stud2.grade = 3;
		
		stud2.subj2 = new Score2[2];
		stud2.subj2[0] = new Score2();
		stud2.subj2[1] = new Score2();
		stud2.subj2[0].subject = "수학";
		stud2.subj2[0].score = 70;
		stud2.subj2[1].subject = "수학";
		stud2.subj2[1].score = 80;
		
		System.out.println(stud2.studentName +"\t" +stud2.address +
				"\t"+stud2.grade+"학년\t"+stud2.subj2[0].subject+":"
				+stud2.subj2[0].score+"\t"+stud2.subj2[1].subject+":"
				+stud2.subj2[1].score);

	}

}
