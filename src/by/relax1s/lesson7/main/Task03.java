package by.relax1s.lesson7.main;

public class Task03 {

	public static void main(String[] args) {

		int n;

		double x;

		x = 0.5;
		n = 20;

		double sum = 0;
		for (int k = 1; k <= n; k++) {
			sum = sum + (Math.sin((k * x) / 2.0) + Math.sin((k * x - 1) / 2.0)) / Math.pow(Math.E, x - 1.0 / k);
		}

		double result;
		result = Math.sqrt(n * Math.PI) * sum;

		System.out.println("Значение формулы равно - " + result);
	}
}
