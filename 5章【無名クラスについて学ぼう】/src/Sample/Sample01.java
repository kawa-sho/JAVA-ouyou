package Sample;

public class Sample01 {
	public static void main(String[] args) {
		A a = new A(){}; // ()のあとに{}を追加
		System.out.println(a.hello());

		A b = new A() {

			// {}の中にメソッドを追加します。

			// クラスAのhelloメソッドをオーバーライドします。
			@Override
			public String hello() {
			  // "Hello B!"を返します。
			  return "Hello B!";
			}
		};
		System.out.println(b.hello());

		B c = new BImpl();
		System.out.println(c.hello());

		// ()のあとに{}を追加
		B d = new B() {
		  // helloメソッドを実装
		  @Override
		  public String hello() {
		    return "Hello B!";
		  }
		};
		System.out.println(d.hello());
	}
}
