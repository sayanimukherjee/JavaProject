package Session7.person;

public class Name {

	private String firstName;
	private String middleName;
	private String lastName;

	Name(String fullName) {
		String[] nameParts = fullName.split(" ");

		if (nameParts.length == 2) {
			this.firstName = nameParts[0];
			this.lastName = nameParts[1];
		} else if (nameParts.length == 3) {
			this.firstName = nameParts[0];
			this.middleName = nameParts[1];
			this.lastName = nameParts[2];
		}
	}

	Name(String fn, String mn, String ln) {
		this.firstName = fn;
		this.middleName = mn;
		this.lastName = ln;
	}

}
