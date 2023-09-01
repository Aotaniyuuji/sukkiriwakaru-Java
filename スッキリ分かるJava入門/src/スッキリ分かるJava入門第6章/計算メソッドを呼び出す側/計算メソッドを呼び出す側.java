package スッキリ分かるJava入門第6章.計算メソッドを呼び出す側;

import スッキリ分かるJava入門第6章.計算処理メソッド.計算処理メソッド;  
//スッキリ分かるJava入門第6章.計算処理メソッドパッケージに属する全てのクラスをインポートしたい場合は最後に[.*]をつける事で可能
//例えばcalc.mainとcalc.logicsは全く別のパッケージ扱いなので、両方インポートする場合はimport calc.mainとcalc.logics両方記述しなければならない

public class 計算メソッドを呼び出す側 {
 public static void main(String[] args) {
	 int a = 10; int b = 2;
	 int total = 計算処理メソッド.tasu(a, b);
	 int delta = 計算処理メソッド.hiku(a, b);
	 System.out.println("足すと" + total + "、引くと" + delta);
 }
}
