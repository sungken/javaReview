package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		studentLee.showStudentInfo();
		
		Student studentJi = new Student();
		studentJi.studentID = 950206;
		studentJi.setStudentName("지성근");
		studentJi.address = "경기도 화성시";
		studentJi.showStudentInfo();
		
		System.out.println(studentJi.getStudentName());
		
		  
		
	}//main

}//StudentTest
