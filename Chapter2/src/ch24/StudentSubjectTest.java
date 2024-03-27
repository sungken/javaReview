package ch24;

public class StudentSubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("국어", 80);
		studentKim.addSubject("수학", 90);
		
		studentLee.showStudentSocre();
		System.out.println("========================================");
		studentKim.showStudentSocre();
		
		
		
	}//main

}//StudentTest