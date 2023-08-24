package スッキリ分かるJava入門第4章;

public class 多次元の配列 {
	public static void main(String[] args) {
		//2次元配列の利用
		int[][] scores = new int[2][3];
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 80;
		scores[1][1] = 60;
		scores[1][2] = 70;
		System.out.println(scores[1][1]);
		
		//親配列と子配列
		int[][] parents = {{40, 50, 60}, {80, 60, 70}};
		System.out.println(parents.length);
		System.out.println(parents[0].length);
	}
}
