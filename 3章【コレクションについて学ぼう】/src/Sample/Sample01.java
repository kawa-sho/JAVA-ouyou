package Sample;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sample01 {
	public static void main(String[] args) {

		// ArrayListを生成する場合
		List<String> list1 = new ArrayList<String>();
		// LinkedListを生成する場合
		List<Integer> list2 = new LinkedList<Integer>();

		// 要素を追加する
		list1.add("りんご");
		System.out.println(list1.get(0));
		System.out.println(list1);
		list1.add("みかん");
		System.out.println(list1.get(1));
		System.out.println(list1);

		// 位置を指定して要素を追加する
		list1.add(1, "バナナ");
		System.out.println(list1.get(1));
		System.out.println(list1);

		// コレクションの要素数より大きい位置を指定すると実行時エラー
		//list1.add(5, "ドリアン");

		// 要素を取得する
		// list1.get(0);

		// 存在チェック (trueを返す)
		if (list1.contains("バナナ")) {
			System.out.println("バナナ");
		};

		// 存在チェック (falseを返す)
		if (list1.contains("なし")) {
			System.out.println("なし");
		};

		System.out.println(list1.size()); // 3を返す

		// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
		list1.remove("バナナ");
		System.out.println(list1);
		list1.remove("なし"); // 何もしない

		// 位置を指定して要素を削除する
		list1.remove(0);
		System.out.println(list1);
		// list1.remove(5); // コレクションの要素数より大きい位置を指定すると実行時エラー
	}
}
