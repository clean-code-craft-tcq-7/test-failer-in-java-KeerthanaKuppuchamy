package alerter;

public class alerter {
	static int alertFailureCount = 0;

	static void alertInCelcius(INetworkAlerter networkAlerter, float farenheit) {
		float celcius = (farenheit - 32) * 5 / 9;
		int returnCode = networkAlerter.networkAlert(celcius);
		if (returnCode != 200) {
			alertFailureCount += 1;
		}
	}

	public static void main(String[] args) {
		alertInCelcius(new FakeNetworkAlerter(), 400.5f);
		alertInCelcius(new FakeNetworkAlerter(), 392f);
		alertInCelcius(new FakeNetworkAlerter(), 303.6f);
		assert (alertFailureCount == 0);

		NetworkAlerter networkAlerter = new NetworkAlerter();
		assert (500 == networkAlerter.networkAlert(204.72223f));
		assert (500 == networkAlerter.networkAlert(200.0f));
		assert (200 == networkAlerter.networkAlert(150.88889f));
		System.out.printf("%d alerts failed.\n", alertFailureCount);
		System.out.println("All is well (maybe!)\n");
	}
}
