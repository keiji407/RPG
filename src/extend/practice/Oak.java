package extend.practice;

public class Oak extends Monster {

	Oak() {
		super.name = "オーク";
		super.hp = 1300;
		super.offensive = 30;
	}

	@Override
	void attack(Living target) {
		// TODO 自動生成されたメソッド・スタブ
		int damage = super.offensive * Rand.get(10);
		System.out.println(super.name+"が槍で攻撃！"+target.name+"に"+damage+"のダメージを与えた。");
		target.hp = target.hp - damage;
	}

}
