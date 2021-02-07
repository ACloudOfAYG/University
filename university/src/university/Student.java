package university;

public class Student {
	private int StudentID;
	private String StudentName;
	private String college;
	
	public Student() {
		
	}
	
	public Student(int StudentID, String StudentName, String college) {
		this.StudentID = StudentID;
		this.StudentName = StudentName;
		this.college = college;
	}
	
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public String toString() {
		return "I'm "+this.StudentName+". My studentID is "+this.StudentID+" And I'm from "+this.college;
	}
}
