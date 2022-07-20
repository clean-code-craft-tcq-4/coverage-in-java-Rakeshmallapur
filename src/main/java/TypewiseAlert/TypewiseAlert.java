package TypewiseAlert;

public class TypewiseAlert {

	private TypewiseAlert() {

	}

	public static BreachType inferBreach(double value, double lowerLimit, double upperLimit) {
		if (value < lowerLimit) {
			return BreachType.TOO_LOW;
		}
		if (value > upperLimit) {
			return BreachType.TOO_HIGH;
		}
		return BreachType.NORMAL;
	}

	public static BreachType classifyTemperatureBreach(CoolingType coolingType, double temperatureInC) {
		int lowerLimit = 0;
		int upperLimit = 0;
		if (coolingType != null) {
			lowerLimit = coolingType.getTempLowerLimit();
			upperLimit = coolingType.getTempUpperLimit();
		}
		return inferBreach(temperatureInC, lowerLimit, upperLimit);
	}

	public static boolean checkAndAlert(AlertTarget alertTarget, BatteryCharacter batteryChar, double temperatureInC) {
		BreachType breachType = classifyTemperatureBreach(batteryChar.coolingType, temperatureInC);
		if (alertTarget == AlertTarget.TO_CONTROLLER) {
			return Alerts.sendToController(breachType);
		} else {
			return Alerts.sendToEmail(breachType);
		}
	}
}
