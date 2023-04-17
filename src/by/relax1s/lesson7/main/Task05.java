package by.relax1s.lesson7.main;

public class Task05 {

	public static void main(String[] args) {

		double x;
		double y;
		double n;

		double x1;
		double dX;

		double a;

		n = 20;

		a = 1;
		x1 = -2 * a;
		dX = a / 5.0;

		x = x1;
		for (int i = 0; i <= n; i++) {
			if (x <= 0) {
				y = a / 2.0 * (Math.pow(Math.E, x / a) + Math.pow(Math.E, -x / a));
			} else {
				y = 4 * Math.pow(a, 3) / (x * x + 4 * a * a);
			}

			System.out.printf("(%5.2f, %10.6f)\n", x, y);
			x = x + dX;
		}
	}
}
