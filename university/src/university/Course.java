package university;

import java.util.ArrayList;

public abstract class Course {
	protected String CourseName;
	protected String room;
	protected String teacherName;
	ArrayList<Student> student = new ArrayList<>();
	
	
	public abstract String toString();
	
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public ArrayList<Student> getStudent() {
		return student;
	}
	public void setStudent(ArrayList<Student> student) {
		this.student = student;
	}
	
	
}
