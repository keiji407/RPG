package extend.practice;

public class Wizard extends Human {

	Wizard() {
		super.name = "魔法使い";
		super.hp = 800;
		super.offensive = 50;
	}

	@Override
	void attack(Living target) {
		// TODO 自動生成されたメソッド・スタブ
		int damage = super.offensive * Rand.get(10);
		System.out.println(super.name+"が魔法で攻撃！"+target.name+"に"+damage+"のダメージを与えた。");
		target.hp = target.hp - damage;
	}

}
