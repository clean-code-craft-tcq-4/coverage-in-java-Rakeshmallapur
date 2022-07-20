package TypewiseAlert;

public enum BreachType {
	NORMAL("normal"), TOO_LOW("too-low"), TOO_HIGH("too-high");

	String type;

	BreachType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
