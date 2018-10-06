package Sessionn11;

import java.util.Comparator;

public class Student implements Comparable<Student> {

	int roll;
	String name;
	int maths;
	int science;
	int total;

	public Student(int roll, String name, int maths, int science, int total) {
		super();
		this.roll = roll;
		this.name = name;
		this.maths = maths;
		this.science = science;
		this.total = total;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", maths=" + maths + ", science=" + science + ", total="
				+ total + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.roll > o.roll) {
			return -1;
		} else if (this.roll < o.roll) {
			return 1;
		} else
			return 0;
	}

	public static Comparator<Student> NameComparator = new Comparator<Student>() {
		public int compare(Student s1, Student s2) {
			return s1.name.compareTo(s2.name);
		}
	};

	public static Comparator<Student> ScienceComparator = new Comparator<Student>() {
		public int compare(Student s1, Student s2) {
			if (s1.science > s2.science) {
				return 1;
			} else if (s1.science < s2.science) {
				return -1;
			} else
				return 0;

		}
	};

}
