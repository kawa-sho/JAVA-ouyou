package Sample;

public class Sample01 {
	// インターフェースA
	public interface A {
	  public String hello();
	}

	// インターフェースB
	public interface B {
	  public String hello();
	  public String goodbye();  // 抽象メソッドが2つあるので、関数型インターフェースではない
	}

	// インターフェースC
	public interface C {
	  public String hello();
	  public static String hi() { // 抽象メソッドは1つしかないので、関数型インターフェース
	    return "Hi!";
	  }
	}
}
