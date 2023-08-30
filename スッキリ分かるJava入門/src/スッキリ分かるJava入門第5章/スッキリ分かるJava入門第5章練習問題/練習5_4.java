package スッキリ分かるJava入門第5章練習問題;

public class 練習5_4 {
	public static double calcTriangleArea(double bottom, double height) {
		double ans = bottom * height / 2;
		return ans;
	}
	
	public static double calcCircleArea(double radius) {
		double ans = radius * radius * 3.14;
		return ans;
	}
	
	public static void main(String[] args) {
		double trianglearea = calcTriangleArea(5.0, 8.0);
		double circlearea = calcCircleArea(7.0);
		
		System.out.println("三角形の面積：" + trianglearea + "平方cm");
		System.out.println("四角形の面積：" + circlearea + "平方cm");
	}
}
