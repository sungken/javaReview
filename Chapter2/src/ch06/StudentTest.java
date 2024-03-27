package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentJI = new Student(950206, "지성근", 3);
//		studentJI.studentNumber = 950206;
//		studentJI.studentName = "지성근";
//		studentJI.grade = 3;
		
		System.out.println(studentJI.showStudentInfo());
		
	}//main

}//StudentTest
