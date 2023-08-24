package スッキリ分かるJava入門第4章;

public class 配列の舞台裏 {
	public static void main(String[] args) {
	 //メモリと変数
	 int [] arrayA = {1, 2, 3};
	 int [] arrayB = arrayA;
	 arrayB[0] = 100;
	 System.out.println(arrayA[0]);
 }
}
