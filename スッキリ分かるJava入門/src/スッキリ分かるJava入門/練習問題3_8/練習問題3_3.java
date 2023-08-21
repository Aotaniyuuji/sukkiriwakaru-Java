package スッキリ分かるJava入門.練習問題3_8;

public class 練習問題3_3 {
 public static void main(String[] args) {
	 //	 練習問題3-3
	 int isHungry = 0;
	 String food = "そうめん";
	 System.out.println("こんにちは");
	 if (isHungry == 0) {
		 System.out.println("お腹がいっぱいです");
	 } else {
		 System.out.println("はらぺこです");
	 }
	 if (isHungry == 1) {
		 System.out.println(food + "をいただきます");
	 }
	 System.out.println("ごちそうさまでした");
 }
}
