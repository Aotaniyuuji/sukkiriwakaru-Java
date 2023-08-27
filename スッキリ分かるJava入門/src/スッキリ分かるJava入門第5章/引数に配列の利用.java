package スッキリ分かるJava入門第5章;

public class 引数に配列の利用 {
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];  //メインメソッド内の実引数をint [size]で受け取り、それをさらにnewArrayに代入
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		int[] array = makeArray(3);
		for (int i : array) {
			System.out.println(i);
		}
	}
}
