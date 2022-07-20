package TypewiseAlert;

public enum CoolingType {
	PASSIVE_COOLING(0, 35), HI_ACTIVE_COOLING(0, 45), MED_ACTIVE_COOLING(0, 40);

	int lowerTempLimit;
	int upperTempLimit;

	CoolingType(int lowerTempLimit, int upperTempLimit) {
		this.lowerTempLimit = lowerTempLimit;
		this.upperTempLimit = upperTempLimit;

	}

	public int getTempLowerLimit() {
		return lowerTempLimit;
	}

	public int getTempUpperLimit() {
		return upperTempLimit;
	}

}