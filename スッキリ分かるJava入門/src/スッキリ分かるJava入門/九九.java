package スッキリ分かるJava入門;

public class 九九 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i * j);
				System.out.print("");
			}
			System.out.println("");
		}
	}
}
