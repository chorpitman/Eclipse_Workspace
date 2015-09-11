package practices_lesson_5;

import java.util.Scanner;

public class Program5Additional {

	public static void main(String[] args) {
		new Program5Additional().doActions();
	}

	private void doActions() {
		boolean cont = true;
		do {
			String sizeStr = keyboard("Input matrix size (greater than 2)");
			Integer size = Integer.valueOf(sizeStr);

			if (size < 2) {
				System.out.println("Matrix size should be greater than 2");
				continue;
			}

			int[][] matrix = createSandClock(size);
			outputMatrix(matrix);

			String reply = keyboard("Try again? (y - Yes, n - No)");
			cont = reply.compareToIgnoreCase("y") == 0;
		} while (cont);
	}

	private int[][] createSandClock(Integer size) {
		int[][] matrix = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i < (size / 2)) {
					if ((j < i) || (j > (size - i - 1))) {
						matrix[i][j] = 0;
					} else {
						matrix[i][j] = 1;
					}
				} else {
					if ((j > i) || (j < (size - i - 1))) {
						matrix[i][j] = 0;
					} else {
						matrix[i][j] = 1;
					}
				}
			}
		}

		return matrix;
	}

	private void outputMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private String keyboard(String message) {
		System.out.print(message + ": ");
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}

}
