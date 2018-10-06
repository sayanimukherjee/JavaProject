package Sessionn11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassSort {

	public static void main(String[] args) {
		Student s1 = new Student(20,"Ab", 97, 98, 81);
		Student s2 = new Student(5,"Bb", 91, 60, 86);
		Student s3 = new Student(30,"Fb", 77, 79, 90);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		System.out.println(studentList);
		
		Collections.sort(studentList, Student.ScienceComparator);
		//Collections.reverse(studentList);
		System.out.println(studentList);

	}

}
