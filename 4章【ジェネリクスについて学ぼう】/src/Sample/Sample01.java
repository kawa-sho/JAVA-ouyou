package Sample;

import java.util.ArrayList;
import java.util.List;

public class Sample01 {
	public static void main(String[] args) {
		List<String> items = new ArrayList<String>();

		items.add("bag"); // OK
		// これ以下はString型ではない要素を追加しているのでコンパイルエラー
		// items.add(0);
		// items.add(true);
		System.out.println(items);

		String item = items.get(0); // OK
		// これ以下はString型ではない変数に代入しているのでコンパイルエラー
		// int item = items.get(0);
		// boolean item = items.get(0);
		System.out.println(item);


		List<Object> samples = new ArrayList<Object>();//obhectはつけなくても初期型

		// 以下、いずれもOK
		samples.add("bag");
		samples.add(0);
		samples.add(true);
		System.out.println(samples);

		String sample = (String)samples.get(0);
		System.out.println(sample);

		// String sample1 = (String)items.get(1);
		// Integer型の要素をString型にキャストしようとして実行時エラー
		// List<String> items = new ArrayList<>();
		// 右側の<>の中身を省略できる
	}
}
