package Selenium.session7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashCodeSample {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		System.out.println(s1.add(1));
		System.out.println(s1);

		System.out.println((new Integer(1)).hashCode());

		Set<String> s2 = new HashSet<String>();
		s2.add("ABC");
		s2.add("aBC");
		s2.add("xyz");
		s2.add("wyz");
		s2.add("xfz");
		s2.add("xqz");
		System.out.println(s2);
		
		Set<String> s3 = new TreeSet<String>();
		s3.add("ABC");
		s3.add("aBC");
		s3.add("xyz");
		s3.add("wyz");
		s3.add("xfz");
		s3.add("xqz");
		System.out.println(s3);
		

		Set<Student> studentSet = new HashSet<Student>();
		Student std1 = new Student("A",1,"5","C");
		Student std2 = new Student("B",2,"5","C");
		Student std3 = new Student("C",3,"5","C");
		Student std4 = new Student("D",4,"5","C");
		Student std5 = new Student("D",4,"5","C");
		Student std6 = new Student("A",1,"5","C");
		Student std7 = std1;
		
		studentSet.add(std6);
		studentSet.add(std5);
		studentSet.add(std4);
		studentSet.add(std3);
		studentSet.add(std2);
		studentSet.add(std1);
		
		System.out.println(studentSet.size());
		
		System.out.println("HashCode of std1 "+std1.hashCode());
		System.out.println("HashCode of std6 "+std6.hashCode());
		System.out.println("HashCode of std7 "+std7.hashCode());
		
		System.out.println(studentSet);
		
		

	}

}
