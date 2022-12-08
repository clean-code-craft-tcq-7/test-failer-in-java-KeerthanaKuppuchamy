package alerter;
public class FakeNetworkAlerter implements INetworkAlerter {

	public int networkAlert(float celcius) {
		System.out.println("ALERT: Temperature is " + celcius + " celcius");
		return 200;
	}
}
