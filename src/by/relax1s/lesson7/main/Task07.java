package by.relax1s.lesson7.main;



public class Task07 {

	public static void main(String[] args) {

		double y;

		int n = 4;
		double x = 2;
		double Xнач = 0.1;
		double Hx = 0.2;

		int m = 4;
		double z = 2;
		double Zнач = 0.1;
		double Hz = 0.3;

		x = Xнач;
		for (int i = 0; i < n; i++) {
			System.out.println("x=" + x);
			z = Zнач;
			for (int a = 0; a < m; a++) {
				y = Math.sqrt(z * z + x * x) * Math.log(z) + Math.abs(Math.log(z)) / Math.sqrt(x * x - z * z + 3.2);
				System.out.println("z=" + z + ",y=" + y);
				z = z + Hz;
			}
			x = x + Hx;
		}

	}

}
