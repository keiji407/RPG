package extend.practice;

public class Slime extends Monster {

	Slime() {
		super.name = "スライム";
		super.hp = 500;
		super.offensive = 20;
	}

	@Override
	void attack(Living target) {
		// TODO 自動生成されたメソッド・スタブ
		int damage = super.offensive * Rand.get(10);
		System.out.println(super.name+"が体当たりで攻撃！"+target.name+"に"+damage+"のダメージを与えた。");
		target.hp = target.hp - damage;
	}

}
