package de.gedoplan.seminar.java.exercise.exceptions.automat;

public class InvalidCodeException extends Exception{
	
	private String code;

	public InvalidCodeException(String code) {
		this.code = code;
	}

	@Override
	public String getMessage() {
		return "Der Productcode " + code + " wird nicht angenommen.";
	}
}
