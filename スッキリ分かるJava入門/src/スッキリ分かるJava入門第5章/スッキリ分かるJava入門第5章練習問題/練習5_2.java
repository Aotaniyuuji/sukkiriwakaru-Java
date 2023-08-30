package スッキリ分かるJava入門第5章.スッキリ分かるJava入門第5章練習問題;

public class 練習5_2 {
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void main(String[] args) {
		String title = "メールのタイトル";
		String address = "メールの宛先アドレス";
		String text = "メールの本文";
		email(title, address, text);
	}
 }
