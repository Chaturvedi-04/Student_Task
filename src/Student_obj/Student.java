package Student_obj;

public class Student {

	public Student() {
		super();
	}
	private int sid;
	private String sname;
	private String sphone;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", sphone=" + sphone + "]";
	}
	public Student(int sid, String sname, String sphone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sphone = sphone;
	}	
}
