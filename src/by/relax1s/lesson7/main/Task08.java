package by.relax1s.lesson7.main;

public class Task08 {

	public static void main(String[] args) {

		double x;
		double yPrevious;
		double y;

		double xStart = 0.1;
		double xStop = 10;
		double dX = 0.1;

		x = xStart;
		y = x * x - Math.pow(Math.E, 2 * x) + 4;
		while (x < xStop) {
			if (y == 0) {
				System.out.println("Нуль функции найден: (" + x + ", " + y + ")");
				break;
			}

			yPrevious = y;
			x = x + dX;
			y = x * x - Math.pow(Math.E, 2 * x) + 4;

			if ((yPrevious > 0 && y < 0) || (yPrevious < 0 && y > 0)) {
				System.out.println(
						"Нуль функции пройден между: (" + (x - dX) + ", " + yPrevious + ") и (" + x + ", " + y + ")");
				break;
			}
		}

		if (x >= xStop) {
			System.out.println("Нуля функции не случилось.");
		}
	}
}
