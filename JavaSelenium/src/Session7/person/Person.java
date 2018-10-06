package Session7.person;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Person {

	private Name name;
	private LocalDate dob;

	Person(String fullName, String dob) {
		this.name = new Name(fullName);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.dob = LocalDate.parse(dob, formatter);
	}

	public Age calcAge(int diff) {
		LocalDate end = LocalDate.now(ZoneId.systemDefault());
		if (diff > 0) {
			end = end.plusYears(diff);
		} else {
			end = end.minusYears(-diff);
		}
		Period p = Period.between(this.dob, end);
		return new Age(p);
	}

	public Age calcAge() {
		return calcAge(0);
	}

}
