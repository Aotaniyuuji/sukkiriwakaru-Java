package スッキリ分かるJava入門第4章;

public class 配列 {
 public static void main(String[] args) {
	 int [] scores;
	 scores = new int[5];
	 int num = scores.length;
	 System.out.println("要素の数:" + num);
	 scores[1] = 30;
	 System.out.println(scores[1]);
	 int[] scores1 = new int[] {20,30,40,50,80};
	 int[] scores2 = {20,30,40,50,80};
 }
}
