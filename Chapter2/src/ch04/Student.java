package ch04;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.printf("학번 %d 학생의 이름은 %s이고 주소는 %s이다.\n", studentID, studentName, address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

}//Student
