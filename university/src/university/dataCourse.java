package university;

public class dataCourse extends Course {
	public String toString() {
		String res = "Name: "+this.CourseName+"\n Room:  "+this.room+"\n Teacher: "+this.teacherName+"\n Student: ";
		for(int i=0;i<student.size();i++) {
			res += student.get(i)+" ";
		}
		return res;
	}

}
