package スッキリ分かるJava入門第5章;

public class 戻り値 {
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	
	public static void main(String[] args) {
		int ans = add(100, 10);
		System.out.println("100 + 10 =" + ans);
	}
}
