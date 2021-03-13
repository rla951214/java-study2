
public class Main {

	public static void main(String[] args) {
		
		// 객체지향을 활용해서 게임 캐릭터 공격 프로젝트를 구현해보기
		// 상속, 클래스, 배열, 다형성 활용해보기
		
		Hero[] heros = new Hero[3];
		
		heros[0] = new Warrior("전사");
		heros[1] = new Archer("궁수");
		heros[2] = new Wizard("마법사");
		
		for(int i = 0; i < heros.length; i++) {
			heros[i].attack();
			
			if(heros[i] instanceof Warrior) {
				// 전사라면 실행이 됨
				Warrior temp = (Warrior) heros[i];
				temp.groundCutting();
			}
			else if(heros[i] instanceof Archer) {
				// 궁수라면 실행이 됨
				Archer temp = (Archer) heros[i];
				temp.fireArrow();
			}
			else if(heros[i] instanceof Wizard) {
				// 마법사라면 실행이 됨
				Wizard temp = (Wizard) heros[i];
				temp.freezing();
			}
		}
		
	}

}
