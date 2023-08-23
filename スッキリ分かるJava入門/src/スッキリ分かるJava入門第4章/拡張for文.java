package スッキリ分かるJava入門第4章;

public class 拡張for文 {
	public static void main(String[] args) {
		//従来のfor文
		int[] scores = {20, 30, 40, 50, 80};
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		//拡張for文
		int[] score = {20, 30, 40, 50, 80};
		for (int value : score) {
			System.out.println(value);
		}
	}
}
