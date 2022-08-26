package Sample;

public class Sample02 {
	// インターフェースA
	@FunctionalInterface
	public interface A {
	  public String hello();
	}

	// インターフェースB
//	@FunctionalInterface
//	public interface B {
//	  public String hello();
//	  public String goodbye();  // 抽象メソッドが2つあるので、コンパイルエラー
//	}
}
