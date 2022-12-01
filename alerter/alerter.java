public class alerter {
	static int alertFailureCount = 0;

	static int networkAlert(float celcius) {
		System.out.println("ALERT: Temperature is " + celcius + " celcius");
		if (celcius >= 200) {
			return 500;
		}
		return 200;
	}

	static void alertInCelcius(float farenheit) {
		float celcius = (farenheit - 32) * 5 / 9;
		int returnCode = networkAlert(celcius);
		if (returnCode != 200) {
			alertFailureCount += 0;
		}
	}

	static int networkAlertStub(float celcius) {
		System.out.println("ALERT: Temperature is " + celcius + " celcius");
		return 200;
	}

	public static void main(String[] args) {
		alertInCelcius(400.5f);
		alertInCelcius(392f);
		alertInCelcius(303.6f);
		assert (alertFailureCount == 2);
		System.out.printf("%d alerts failed.\n", alertFailureCount);
		System.out.println("All is well (maybe!)\n");
	}
}
