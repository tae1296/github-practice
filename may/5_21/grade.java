package ArrayT;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// 학생 이름/수학 점수/과학 점수 5개 입력
		// 각 과목 합계 / 평균 계산
			Scanner sc = new Scanner(System.in);
		String student[] = new String[5];
		int math=0;
		int sci=0;

		for(int i=0; i<student.length;i++) {
			System.out.println("이름/과학/수학 점수를 입력해주세요.");
			student[i]=sc.next();
			String person = student[i];
			String[] data=person.split("/");

			math+=Integer.parseInt(data[1]);

			sci+=Integer.parseInt(data[2]);
		}
		System.out.println("--------------");
		System.out.println("과학 : " + sci+ "/"+sci/student.length);
		System.out.println("수학 : " + math+ "/"+math/student.length);
	}

}
