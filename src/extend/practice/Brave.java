package extend.practice;

public class Brave extends Human {

	Brave() {
		super.name = "勇者";
		super.hp = 1000;
		super.offensive = 40;
	}

	@Override
	void attack(Living target) {
		// TODO 自動生成されたメソッド・スタブ
		int damage = super.offensive * Rand.get(10);
		System.out.println(super.name+"が剣で攻撃！"+target.name+"に"+damage+"のダメージを与えた。");
		target.hp = target.hp - damage;
	}

}

