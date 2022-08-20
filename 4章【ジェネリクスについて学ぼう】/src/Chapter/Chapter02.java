package Chapter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Chapter02 {
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", new BigDecimal(200)));
		Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃", new BigDecimal(300)));

		appleBasket.printTotalPrice(); // 「ふじの入った籠は合計300円です」と出力
		peachBasket.printTotalPrice(); // 「黄金桃の入った籠は合計400円です」と出力

		List<Fruit> fruits = new ArrayList<>();
		List<Apple> apples = new ArrayList<>();
		// 以下は説明用の実現不可能なコードです。いずれもコンパイルエラーとなります。
		// fruits = apples // 要素は親子関係にあるが、この代入は成り立たずコンパイルエラー
		fruits.add(new Peach("黄金桃", new BigDecimal(300))); // 上記を許してしまうと、実体がAppleのListなのに別の型の要素を追加できてしまう

		//doSomething1(apples); // コンパイルエラー

		List<? extends Fruit> fruits1; // 型パラメータとして、Fruitを継承したクラスを指定
		List<Apple> apples1 = new ArrayList<>();

		fruits1 = apples1;// コンパイルエラーにならない

		doSomething2(apples1); // コンパイルエラーにならない
	}
	public static void doSomething1(List<Fruit> fruits) {
		//何らかの処理
	}
	public static void doSomething2(List<? extends Fruit> fruits) {  // 型パラメータとして、Fruitを継承したクラスを指定
		System.out.println(fruits);
		// 何らかの処理
	}
}
