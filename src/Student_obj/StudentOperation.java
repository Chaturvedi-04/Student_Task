package Student_obj;

import java.util.ArrayList;

public interface StudentOperation {
	
	public Student findStudent(int id,ArrayList<Student> studlist);
	
	public void addStudent(Student s,ArrayList<Student> studlist);
	
	public void deleteStudent(int id,ArrayList<Student> studlist);
	
	public void displayStudent(Student s);
	
	public void updateName(int id);
	
	public int countStudents(ArrayList<Student> studlist);

}
