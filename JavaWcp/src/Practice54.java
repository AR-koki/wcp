
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
		System.out.println("三角形の面積" + triangle + "平方cm");
		
		double circle = calcCircleArea(5.0);
		System.out.println("円の面積" + circle + "平方cm");
	}
}
