package chpter5;

public class StudentMain3 {

	public static void main(String[] args) {
		// Student2, Score2 이용.
		
//		Student2 stud=new Student2();
//		Student2 stud2=new Student2();
		Student2[] stu2=new Student2[2];
		stu2[0] = new Student2();
		stu2[1] = new Student2();
		
		//홍길동/ 구로구/ 3학년/ 수학 100, 국어 90
		
		stu2[0].studentName = "홍길동";
		stu2[0].address = "구로구";
		stu2[0].grade = 3;
		
		stu2[0].subj2 = new Score2[2];
		stu2[0].subj2[0] = new Score2();
		stu2[0].subj2[1] = new Score2();
		stu2[0].subj2[0].subject = "수학";
		stu2[0].subj2[0].score = 100;
		stu2[0].subj2[1].subject = "국어";
		stu2[0].subj2[1].score = 90;
		
		System.out.println(stu2[0].studentName +"\t" +stu2[0].address +
				"\t"+stu2[0].grade+"학년\t"+stu2[0].subj2[0].subject+":"
				+stu2[0].subj2[0].score+"\t"+stu2[0].subj2[1].subject+":"
				+stu2[0].subj2[1].score);
		
		//고길동/ 영등포구/ 3학년/ 수학 70, 국어 80
		stu2[1].studentName = "고길동";
		stu2[1].address = "영등포구";
		stu2[1].grade = 3;
		
		stu2[1].subj2 = new Score2[2];
		stu2[1].subj2[0] = new Score2();
		stu2[1].subj2[1] = new Score2();
		stu2[1].subj2[0].subject = "수학";
		stu2[1].subj2[0].score = 70;
		stu2[1].subj2[1].subject = "수학";
		stu2[1].subj2[1].score = 80;
		
		System.out.println(stu2[1].studentName +"\t" +stu2[1].address +
				"\t"+stu2[1].grade+"학년\t"+stu2[1].subj2[0].subject+":"
				+stu2[1].subj2[0].score+"\t"+stu2[1].subj2[1].subject+":"
				+stu2[1].subj2[1].score);

	}

}
