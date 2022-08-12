package Sample;

public class Outer02 {
	// 非staticなフィールドgreeting
    private String greeting = "こんにちは";

  // staticな内部クラスInner
    public static class Inner {

        public String hello() {
      // 外部クラスOuterのフィールドgreetingは非staticなので、コンパイルエラー
            return greeting;
        }
    }
}
