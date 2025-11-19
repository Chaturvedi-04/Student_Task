package Student_obj;

public interface StudentOperation {
	
	public Student findStudent(int id);
	
	public void addStudent(Student s);
	
	public void deleteStudent(int id);
	
	public void displayStudent(Student s);
	
	public void updateName(int id);
	
	public int countStudents(Student s);

}
