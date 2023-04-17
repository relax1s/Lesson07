package by.relax1s.lesson7.main;

public class Task02 {

	public static void main(String[] args) {
		
		double y;

		double n = 10;
		double a = 0.50;
		double b = 1.00;
		double h;

		h = (b - a) / n;

		for (double x = a, i = 1; x <= b; x = x + h, i++) {
			y = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
			System.out.printf("%2d-(%.2f,%.6f)\n", (int) i, x, y);
		}
		int i = 1;
		for (double x = a; x <= b; x = x + h) {
			y = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
			System.out.printf("%2d-(%.2f,%.6f)\n", i, x, y);
			i++;
		}
	}
}