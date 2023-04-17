package by.relax1s.lesson7.main;

public class Task06 {

	public static void main(String[] args) {

		double a = 3.0e4;
		double b = 6.0e4;
		double m = 4;

		double t1 = Math.sqrt(a + b + m);
		double t2 = m * Math.sqrt(a + b);

		double t3 = Math.sqrt(a * b * m);
		double t4 = m * Math.sqrt(a * b);

		double y;
		int sum = 0;
		for (int k = -30; k < 60; k++) {
			y = k * k * k - 25 * k * k + 50 * k + 1000;
			if (y > t1 && y < t2) {
				System.out.println(y);
			} else if (y > t3 && y < t4) {
				System.out.println("-----" + y);
			} else {

				sum++;
			}
		}
		System.out.println(sum);
	}
}
