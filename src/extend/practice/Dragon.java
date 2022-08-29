package extend.practice;

public class Dragon extends Monster {

	Dragon() {
		super.name = "ドラゴン";
		super.hp = 1500;
		super.offensive = 50;
	}

	@Override
	void attack(Living target) {
		// TODO 自動生成されたメソッド・スタブ
		int damage = super.offensive * Rand.get(10);
		System.out.println(super.name+"が炎で攻撃！"+target.name+"に"+damage+"のダメージを与えた。");
		target.hp = target.hp - damage;
	}

}
