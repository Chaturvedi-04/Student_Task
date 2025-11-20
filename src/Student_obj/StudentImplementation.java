package Student_obj;

import java.util.ArrayList;

public class StudentImplementation implements StudentOperation{

	@Override
	public Student findStudent(int id,ArrayList<Student> studlist) {
		Student s=null;
		for(int i=0;i<studlist.size();i++)
		{
			if(studlist.get(i).getSid()==id) 
			{
				s = studlist.get(i);
				break;
			}
		}
		return s;
	}

	@Override
	public void addStudent(Student s,ArrayList<Student> studlist) {
		studlist.add(s);
	}

	@Override
	public void deleteStudent(int id,ArrayList<Student>studlist) {
		Student s=findStudent(id,studlist);
		if(s!=null)
			{
				studlist.remove(s);
			}
		System.out.println("deleted successfully");
		return ;
	}

	

	private void remove(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayStudent(Student s) {
		
		
	}

	@Override
	public void updateName(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int countStudents(ArrayList<Student> studlist) {
		return studlist.size();
	}

}
