package extend.practice;

public class Fighter extends Human {

	Fighter() {
		super.name = "戦士";
		super.hp = 1200;
		super.offensive = 30;
	}

	@Override
	void attack(Living target) {
		// TODO 自動生成されたメソッド・スタブ
		int damage = super.offensive * Rand.get(10);
		System.out.println(super.name+"が斧で攻撃！"+target.name+"に"+damage+"のダメージを与えた。");
		target.hp = target.hp - damage;
	}

}
