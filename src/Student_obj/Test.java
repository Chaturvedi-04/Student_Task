package Student_obj;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Student> studlist= new ArrayList<>();
		StudentImplementation si = new StudentImplementation();
		
		Student s1 = new Student(101,"Suresh","9908223304");
		Student s2 = new Student(102,"Ramesh","1234567890");
		Student s3 = new Student(103,"Suresh","0987654321");
		
		//adding students
		si.addStudent(s1,studlist);
		si.addStudent(s2,studlist);
		si.addStudent(s3,studlist);
		
		//printing list after adding students
		System.out.println(studlist);
		
		//finding students with id 101 & 201
		System.out.println(si.findStudent(101,studlist));
		System.out.println(si.findStudent(201,studlist));
	}

}
