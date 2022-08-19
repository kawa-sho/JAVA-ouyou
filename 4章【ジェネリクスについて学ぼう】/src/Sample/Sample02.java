package Sample;

class Basket<E extends Fruit> {
	private E elem;

	Basket(E e) {
	  elem = e;
	}

	void replace(E e) {
	  elem = e;
	}

	E get() {
	  return elem;
	}

	void printName() {
	  System.out.println("籠の中身は" + elem.getName() + "です"); // EはFruitのサブクラスなので、getNameが使えると保証されている
	}
}

//class Apple {
//	private String name;
//
//	Apple(String name) {
//	  this.name = name;
//	}
//
//	String getName() {
//	  return name;
//	}
//}

class Peach {
	private String name;

	Peach(String name) {
	  this.name = name;
	}

	String getName() {
	  return name;
	}
}

abstract class Fruit {
	String name;

	Fruit(String name) {
	  this.name = name;
	}

	abstract protected String getName();
}

class Apple extends Fruit {
	Apple(String name) {
	  super(name);
	}

	@Override
	protected String getName() {
	  return name;
	}
}