package Chapter;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Chapter01 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1); // OK
		// set.add("Two"); // コンパイルエラー
		System.out.println(set);

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Taro"); // OK
		map.put(2, "Hanako"); // OK
		// int value = map.get(0); // コンパイルエラー
		System.out.println(map);
	}
}
