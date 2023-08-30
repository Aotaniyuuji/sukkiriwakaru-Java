package スッキリ分かるJava入門第5章練習問題;

public class 練習5_1 {
	public static void main(String[] args) {
		introduceOneself();
	}
	
	public static void introduceOneself() {
		String name = "青谷勇次";
		int age = 25;
		double height = 165;
		char zodiac = '寅';
		System.out.println(name + "です");
		System.out.println("年齢は" + age + "です");
		System.out.println("身長は" + height + "です");
		System.out.println("干支は" + zodiac + "です");
	}
}
