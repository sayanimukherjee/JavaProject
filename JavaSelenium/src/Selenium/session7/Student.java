package Selenium.session7;

public class Student {
	
	String name;
	int roll;
	String classname;
	String sec;
	
	public Student(String name, int roll, String classname, String sec) {
		super();
		this.name = name;
		this.roll = roll;
		this.classname = classname;
		this.sec = sec;
	}

	@Override
	public int hashCode() {
		final int prime = 51;
		int result = 1;
		result = prime * result + ((classname == null) ? 0 : classname.hashCode());
		result = prime * result + roll;
		result = prime * result + ((sec == null) ? 0 : sec.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (classname == null) {
			if (other.classname != null)
				return false;
		} else if (!classname.equals(other.classname))
			return false;
		if (roll != other.roll)
			return false;
		if (sec == null) {
			if (other.sec != null)
				return false;
		} else if (!sec.equals(other.sec))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", classname=" + classname + ", sec=" + sec + "]";
	}

	
}
