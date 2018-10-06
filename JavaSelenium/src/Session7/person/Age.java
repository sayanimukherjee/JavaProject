package Session7.person;

import java.time.Period;

public class Age {

	private int years;
	private int months;
	private int days;

	public Age(Period age) {
		this.years = age.getYears();
		this.months = age.getMonths();
		this.days = age.getDays();

	}

	@Override
	public String toString() {
		return "Age [years=" + years + ", months=" + months + ", days=" + days + "]";
	}

}
