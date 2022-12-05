public class misaligned {

	static String majorColors[] = { "White", "Red", "Black", "Yellow", "Violet" };
	static String minorColors[] = { "Blue", "Orange", "Green", "Brown", "Slate" };

	static int printColorMap(Integer majorColorCount, Integer minorColorCount) {
		int i = 0, j = 0;
		for (i = 0; i < majorColorCount; i++) {
			for (j = 0; j < minorColorCount; j++) {
				System.out.println(formatColorCode(getPairNumber(i, j), i, j));
			}
		}
		return i * j;
	}

	private static String formatColorCode(int pairNumber, int majorColorIndex, int minorColorIndex) {
		return pairNumber + " | " + majorColors[majorColorIndex] + " | " + minorColors[minorColorIndex];
	}

	private static Integer getPairNumber(int i, int j) {
		return i * 5 + j;
	}

	public static void main(String[] args) {
		int result = printColorMap(majorColors.length, minorColors.length);
		assert (result == 25);
		assert (getPairNumber(1, 2) == 7);
		assert (formatColorCode(7, 1, 2).equalsIgnoreCase("7 | Red | Green"));
		System.out.println("All is well (maybe!)");
	}
}
