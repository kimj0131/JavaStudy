
public class C05_Static {

	/*
	 	# static (정적 영역, 클래스 영역)
	 	
	  	- 인스턴스 영역과 대조되는 개념의 영역
	  	- 같은 클래스로 만들어진 모든 인스턴스들이 함께 사용하는 공통 영역을 의미한다.
	  	
	  	클래스로 같은영역을 인스턴스로 여러개뽑을 수 있다
	  	클래스들의 변수는 다를 수 있지만 모든 클래스에서 같아야할 내용도 있다.
	  	ex) 스타크래프트 질럿 : 각자 달라야하는 값(체력, 질럿의 위치) 
	  						/ 모두 같아야하는 값 (공격력, 방어력, 이동속도, 등등..) << static 영역에 저장할 값들
	  	모든 클래스들이 함께 사용하는 영역이 클래스영역이라고 한다.
	  	
	  	- 앞에 static 이라는 키워드가 붙은 모든 자원(변수, 메서드)들은 모든 인스턴스들이 함께 사용하는 공동 영역에 있는 자원이 된다
	*/
	
	// 내가 이 클래스를 몇개씩 찍어내도 main은 하나이다의 의미의 static (유일의 의미)
	public static void main(String[] args) {
		
		// 객체를 100개 담을 수 있는 배열을 생성 (내용은 비어있다)
		Wall[] walls = new Wall[100];
		
		// new로 실체를 만들어 배열에 담아야 한다.
		for(int i = 0; i < walls.length; i++) {
			walls[i] = new Wall();
		}
		
	}
	
}

class Wall {
	// 생성된 모든 벽에서 동일할 값
	static int def;
	static int maxHp;
	
	// 각 벽마다 다를 값
	int hp;
	int x;
	int y;
	
}

/*
 	현실의 객체를 참고하여 static 필드를 포함한 적당한 클래스를 하나 만들어보세요
*/

class Monitor{
	
	static int powerCable;
	
	boolean vesa;
	int resolution;
	int size;
	String panel;
	int button;
	
}



