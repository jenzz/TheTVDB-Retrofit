package model;

public enum Status {

	ENDED,
	CONTINUING;

	public static Status parse(String s) {
		for (Status status : values()) {
			if (status.name().equalsIgnoreCase(s)) {
				return status;
			}
		}
		return null;
	}

}
