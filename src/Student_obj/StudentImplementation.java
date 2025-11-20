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
		System.out.println("Deleted successfully");
		return ;
	}

	

	

	@Override
	public void displayStudent(ArrayList<Student> studlist) {
		if(studlist!=null) {
			for(Student s:studlist) {
				System.out.println(s);
			}
		}
		
		
		
		
	}

	@Override
	public void updateName(int id,ArrayList<Student>studlist,String un) {
		Student s= findStudent(id,studlist);
		if(s!=null) {
			s.setSname(un);
			}
		}

	@Override
	public int countStudents(ArrayList<Student> studlist) {
		return studlist.size();
	}

}
