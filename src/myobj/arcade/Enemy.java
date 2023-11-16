package myobj.arcade;

public class Enemy extends Striker {

	int shotNum;
	
	public Enemy(String name, int bullet, int shotNum) {
		super(name, bullet);
		this.shotNum = shotNum;
	}

	void shot() {
		for(int i = 0; i < shotNum; i++) {
			System.out.println("총알발사");
		}
	}
}
