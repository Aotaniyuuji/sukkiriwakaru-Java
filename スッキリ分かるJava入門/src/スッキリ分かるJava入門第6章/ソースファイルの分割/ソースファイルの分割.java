package スッキリ分かるJava入門第6章.ソースファイルの分割;

public class ソースファイルの分割 {
 public static void main(String[] args) {
	 int a = 10; int b = 2;
	 int total = 計算処理メソッド.tasu(a, b);
	 int delta = 計算処理メソッド.hiku(a, b);
	 System.out.println("足すと" + total + "、引くと" + delta);
 }
}
