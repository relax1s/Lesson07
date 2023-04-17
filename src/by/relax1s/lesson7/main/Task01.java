package by.relax1s.lesson7.main;

public class Task01 {

	public static void main(String[] args) {
		
		double x;
		double y;
		
		x=0.5;
		
		y = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
		
		System.out.println("x = " + x + ", y = " + y);
	}
}