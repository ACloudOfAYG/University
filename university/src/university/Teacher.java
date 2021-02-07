package university;

import java.util.ArrayList;

public class Teacher {
	private int ID;
	private String name;
	ArrayList<javaCourse> course1 = new ArrayList<>();
	ArrayList<dataCourse> course2 = new ArrayList<>();

	
	public String toString() {
		String res1 = "ID: "+this.ID+"\n Name: "+this.name+"\n javaCourse: ";
		for(int i=0;i<course1.size();i++) {
			res1 += course1.get(i)+" ";
		}
		
		String res2 = "ID: "+this.ID+"\n Name: "+this.name+"\n dataCourse: ";
		for(int i=0;i<course1.size();i++) {
			res2 += course1.get(i)+" ";
		}
		
		return res1+"\n "+res2;
	}
	
	public void inCourse() {
		System.out.println("IS ON CLASS");
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<javaCourse> getCourse1() {
		return course1;
	}

	public void setCourse1(ArrayList<javaCourse> course1) {
		this.course1 = course1;
	}

	public ArrayList<dataCourse> getCourse2() {
		return course2;
	}

	public void setCourse2(ArrayList<dataCourse> course2) {
		this.course2 = course2;
	}

	
}
