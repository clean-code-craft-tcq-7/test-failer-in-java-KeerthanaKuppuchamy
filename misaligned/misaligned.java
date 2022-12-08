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
		return (i * 5 + j) + 1;
	}

	public static void main(String[] args) {
		int result = printColorMap(majorColors.length, minorColors.length);
		assert (result == 25);
		assert (getPairNumber(0, 0) == 1);
		assert (formatColorCode(1, 0, 0).equalsIgnoreCase("1 | White | Blue"));
		assert (getPairNumber(4, 4) == 25);
		assert (formatColorCode(25, 4, 4).equalsIgnoreCase("25 | Violet | Slate"));
		assert (getPairNumber(1, 2) == 8);
		assert (formatColorCode(8, 1, 2).equalsIgnoreCase("8 | Red | Green"));
		System.out.println("All is well (maybe!)");
	}
}
