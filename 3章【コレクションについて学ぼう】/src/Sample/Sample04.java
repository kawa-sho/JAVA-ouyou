package Sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample04 {
	public static void main(String[] args) {
		// Listの例
		List<String> prefectures = new ArrayList<>();
		prefectures.add("北海道");
		prefectures.add("青森県");
		prefectures.add("秋田県");

		for (String prefecture : prefectures) {
			System.out.println(prefecture); // 北海道、青森県、秋田県の順に表示
		}
		
		
		// Mapの例
		Map<Integer, String> classmates = new HashMap<>();
		classmates.put(1, "青木");
		classmates.put(2, "石坂");
		classmates.put(3, "小野田");

		// キーのみ
		for (Integer key : classmates.keySet()) {
		  System.out.println(key); // 1, 2, 3の順に表示
		}

		// 値のみ
		for (String name : classmates.values()) {
		  System.out.println(name); // 青木、石坂、小野田の順に表示
		}

		// キーと値のペア
		for (Map.Entry<Integer, String> classmate : classmates.entrySet()) {
		  System.out.println(classmate.getKey() + "番は" + classmate.getValue() + "さん"); // 1番は青木さん、2番は石坂さん、3番は小野田さんの順に表示
		}
	}
}
