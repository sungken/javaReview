package ch06;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	
	public Student( int studentNumber, String studentName, int grade ) {
		
		System.out.println("Student 생성");
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
		
	}//Student( int studentNumber, String studentName, int grade )
	
	public String showStudentInfo() {
		
		return studentName + " 학생의 번호는 " + studentNumber + "이고, " + grade + "학년입니다.";
	}//showStudentInfo

}//Student
