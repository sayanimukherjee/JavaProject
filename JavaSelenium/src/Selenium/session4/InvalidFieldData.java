package Selenium.session4;

public class InvalidFieldData {
	String fieldname;
	String value;
	String errorMessage;
	
	public InvalidFieldData(String fieldname, String value, String errorMessage) {
		super();
		this.fieldname = fieldname;
		this.value = value;
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "InvalidFieldData [fieldname=" + fieldname + ", value=" + value + ", errorMessage=" + errorMessage + "]";
	}
}
