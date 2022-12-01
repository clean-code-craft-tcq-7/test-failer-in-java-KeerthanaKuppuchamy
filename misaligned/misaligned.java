import java.util.HashMap;
import java.util.Map;

public class misaligned {

	static Map<Integer, String> colorMap = new HashMap<Integer, String>();
	static String majorColors[] = { "White", "Red", "Black", "Yellow", "Violet" };
	static String minorColors[] = { "Blue", "Orange", "Green", "Brown", "Slate" };

	static int printColorMap(Integer majorColorCount, Integer minorColorCount) {
		int i = 0, j = 0;
		for (i = 0; i < majorColorCount; i++) {
			for (j = 0; j < minorColorCount; j++) {
				getColorMap(i, j);
			}
		}
		for (Integer key : colorMap.keySet()) {
			System.out.printf("%d | %s\n", key, colorMap.get(key));
		}
		return i * j;
	}

	private static void getColorMap(int majorColorCount, int minorColorCount) {
		colorMap.put(getPairNumber(majorColorCount, minorColorCount),
				getMajorColor(majorColorCount) + " | " + getMinorColor(majorColorCount));
	}

	private static Integer getPairNumber(int i, int j) {
		return i * 5 + j;
	}

	private static String getMajorColor(int index) {
		return majorColors[index];
	}

	private static String getMinorColor(int index) {
		return minorColors[index];
	}

	public static void main(String[] args) {
		int result = printColorMap(majorColors.length, minorColors.length);
		assert (result == 25);
		assert (getPairNumber(1, 2) == 7);
		assert (getMajorColor(1) == "Red");
		assert (getMinorColor(2) == "Green");
		assert (colorMap.get(7) == "Red|Green");
		assert (colorMap.containsKey(25));
		assert (!colorMap.containsKey(0));
		System.out.println("All is well (maybe!)");
	}
}
