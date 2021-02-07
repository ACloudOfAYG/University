package university;

public class Counselor extends Teacher implements Manage {
	@Override
	public void attend() {
		System.out.println("ATTEND");
	}
	
}
