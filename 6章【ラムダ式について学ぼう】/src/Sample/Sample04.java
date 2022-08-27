package Sample;

public class Sample04 {
	@FunctionalInterface
	public interface Greeting {
		public String hello(String word);
	}
	Greeting greeting = (String word) -> {
		System.out.println(word);
		return word;
	};
	public static void sayHello(Greeting g) { // 引数で渡す Greeting の実装によって、sayHelloの挙動も変わる
		System.out.println(g.hello("こんにちは")); // このような、g.helloを用いた何らかの処理を書く
	}
}
