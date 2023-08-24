package スッキリ分かるJava入門第4章;

public class ガベージコレクション {
	public static void main(String[] args) {
	 boolean judge = true;
	 if (judge == true) {
		 //配列変数自体はif文内で寿命を迎えるが、値は寿命を迎えずそのままどの配列変数からも参照できないまま残ってしまう
		//Javaにはガベージコレクションという、そういったものを自動的に探し出して片付けてくれる仕組みが常に動いている
		 int[] array = {1, 2, 3};
	 }
	 
	 //nullを使用すると意図的に配列を参照されないようにする事ができる
	 int[] array = {1, 2, 3};
	 array = null;
	 array[0] =10;
 }
}
