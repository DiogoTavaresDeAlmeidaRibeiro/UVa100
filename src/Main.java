import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Class must be called Main, according to UVa
 *
 * @author DiogoRibeiro
 *
 */
public class Main {

	private static final int MAX_LINE_CHARS = 255;

	private void displayMaxCycleLength(int i, int j) {
		System.out.println(i + " " + j + " " + calculateMaxCycleLength(i, j));
	}

	public static int calculateMaxCycleLength(int i, int j) {
		if (i < j) {
			return maxCycleLengthOrderedInput(i, j);
		} else {
			return maxCycleLengthOrderedInput(j, i);
		}
	}

	private static int maxCycleLengthOrderedInput(int i, int j) {
		int result = 0;

		for (int n = i; n <= j; n++) {
			int cycleLength = cycleLength(n);
			if (cycleLength > result) {
				result = cycleLength;
			}
		}

		return result;
	}

	public static int cycleLength(int n) {
		int result = 0;

		do {

			// System.out.print(n + " ");
			result++;
			if (n == 1) {
				break;
			}

			n = calculateNextValue(n);
		} while (true);

		// System.out.println("");
		return result;
	}

	private static int calculateNextValue(int n) {
		if (isOdd(n)) {
			return 3 * n + 1;
		} else {
			return n / 2;
		}
	}

	public static boolean isOdd(int n) {
		return n % 2 != 0;
	}

	public static void main(String args[]) {
		Main main = new Main();
		main.begin();
	}

	private void begin() {
		String inputLine;
		StringTokenizer tokenizer;
		int i = 0;
		int j = 0;

		while ((inputLine = Main.readLine(MAX_LINE_CHARS)) != null) {
			tokenizer = new StringTokenizer(inputLine);
			i = Integer.parseInt(tokenizer.nextToken());
			j = Integer.parseInt(tokenizer.nextToken());

			displayMaxCycleLength(i, j);
		}
	}

	/**
	 * Utility function to read a line from stdin
	 */
	private static String readLine(int maxLineSize) {
		byte[] line = new byte[maxLineSize];
		int totalReadBytes = 0;
		int readByte = -1;

		try {
			while (totalReadBytes < maxLineSize) {
				readByte = System.in.read();
				if ((readByte < 0) || (readByte == '\n')) {
					break;
				}
				line[totalReadBytes++] += readByte;
			}
		} catch (IOException e) {
			return (null);
		}

		if ((readByte < 0) && (totalReadBytes == 0)) {
			return (null); // eof
		}
		return (new String(line, 0, totalReadBytes));
	}

}
