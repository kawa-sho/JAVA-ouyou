package Sample;

public class Example01 {
    public static void main(String[] args) {
        Outer01 outer = new Outer01(); // クラスOuterをインスタンス化
        Outer01.Inner inner = outer.new Inner(); // クラスOuterの内部クラスInnerをインスタンス化
    }
}