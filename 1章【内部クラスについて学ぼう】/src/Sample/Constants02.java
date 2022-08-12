package Sample;

public class Constants02 {
	//内部クラスCatの中に、猫関係の定数を定義
    public static class Cat {
        public static final String NAME = "猫";
        public static final int LEG_COUNT = 4;
    }

  //内部クラスOctopusの中に、タコ関係の定数を定義
    public static class Octopus {
        public static final String NAME = "タコ";
        public static final int LEG_COUNT = 8;
    }
}

//上の定数を場合
//System.out.println(Constants.Cat.NAME); // "猫"
//System.out.println(Constants.Cat.LEG_COUNT); // 4
//System.out.println(Constants.Octopus.NAME);  // "タコ"
//System.out.println(Constants.Octopus.LEG_COUNT);  // 8
