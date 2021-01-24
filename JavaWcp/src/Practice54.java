
public class Practice54 {
	public static double calcTriangleArea(double bottom, double height) {
		double triangle = bottom * height / 2;
		return triangle;
	}
	public static double calcCircleArea(double radius) {
		double circle = radius * radius * 3.14;
		return circle;
	}
	public static void main(String[] args) {
		double triangle = calcTriangleArea(20,20);
		System.out.println(triangle);
		
		double circle = calcCircleArea(5);
		System.out.println(circle);
	}
}
