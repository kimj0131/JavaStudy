package myobj.arcade;

public class Striker extends ArcadeGame {
	
	String name;
	int bullet;
	int power;
	int life = 3;

	public Striker(String name, int bullet) {
		this.name = name;
		this.bullet = bullet;
	}

	public void killEnemy() {
		score++;
	}
	
	public void hitEnemy() {
		life--;
	}
	
	public void powerUp(int power) {
		this.power += power;
		bullet += power;
	}
	
	public void info() {
		System.out.println("기체이름 : " + name);
		System.out.println("발사되는 총알 개수 : " + bullet);
		System.out.println("현재 POWER : " + power);
	}
}
