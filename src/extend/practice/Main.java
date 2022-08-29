package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		List<Human> hu = new ArrayList<Human>();
		hu.add(new Brave());
		hu.add(new Fighter());
		hu.add(new Wizard());
		
		List<Monster> mo = new ArrayList<Monster>();
		mo.add(new Slime());
		mo.add(new Oak());
		mo.add(new Dragon());
		
		while (true) {
			System.out.println("人間のターン！");
			
			Human h = hu.get(Rand.get(hu.size()));
			Monster m = mo.get(Rand.get(mo.size()));
			h.attack(m);
			
			if(m.hp <= 0) {
				System.out.println(m.name+"が倒れた");
				mo.remove(m);
			}
			if(mo.size()==0) {
				System.out.println("勇者達は勝利した！");
				break;
			}
			
			System.out.println("モンスターのターン！");
			h = hu.get(Rand.get(hu.size()));
			m = mo.get(Rand.get(mo.size()));
			m.attack(h);
			
			if(h.hp <= 0) {
				System.out.println(h.name+"が倒れた");
				hu.remove(h);
			}
			if(hu.size()==0) {
				System.out.println("勇者達は敗北した！");
				break;
			}
		}
	}

}
