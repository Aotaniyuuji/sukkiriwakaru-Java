package スッキリ分かるJava入門第4章.練習問題;

public class 練習問題4_4 {
	public static void main(String[] args) {
		int[] number = {3, 4, 9};
		System.out.println("１桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		 for (int n : number) {
			 if (n == input) {
				 System.out.println("アタリ！");
			 }
 		 }
	}
}
