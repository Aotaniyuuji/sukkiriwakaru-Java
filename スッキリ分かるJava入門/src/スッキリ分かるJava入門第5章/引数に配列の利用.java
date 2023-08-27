package スッキリ分かるJava入門第5章;

public class 引数に配列の利用 {
	//int型配列を受け取り、
	//配列内の全てに１を加えるメソッド
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
 	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3};
		incArray(array);
		for (int i : array) {
			System.out.println(i);
		}
	}
}
