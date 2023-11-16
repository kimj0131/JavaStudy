
public class C11_AccessModifier extends myobj.C11_ModifierTest{
	
	// 다른 패키지의 클래스를 그냥 불러 쓰는 경우에는 public만 사용할 수 있지만
	// 다른 패키지의 클래스를 상속받는 경우 protected까지 사용할 수 있다.
	public C11_AccessModifier() {
		super.i1 = 123;
		super.i2 = 123;
	}
	/*
	 	# 접근 제어자 (Accesss Modifier)
	 	
	 	- 다른 클래스에서 해당 자원을 사용하려고 할 때 허용 범위를 설정한다.
	 	- 같은 패키지의 다른 클래스에서 접근할 때
	 	- 다른 패키지의 다른 클래스에서 접근할 때
	 	
	 	# 종류
	 	
	 	- public	: 다른 패키지의 다른 클래스에서도 해당 자원(필드, 메서드)에 자유롭게 접근할 수 있다.
	 	- protected	: 다른 패키지의 다른 클래스에서 해당 자원에 접근하기 위해서는 해당 클래스를 상속을 받아야 한다.
	 	- default	: 아무것도 안쓰는 것. 다른 패키지에서는 해당 자원에 접근할 수 없다. / 같은 패키지에서는 자유롭게 접근이 가능하다.
	 	- private	: 같은 패키지의 다른 클래스에서도 접근할 수 없다. / 현재 클래스 내부에서만 사용할 수 있다.
	 */
	public static void main(String[] args) {
		
		// ### 같은 패키지의 다른 클래스에 접근하는 경우
		// public, protected, default까지 접근이 가능하다.
		System.out.println("public static field:" + C11_ModifierTest.si1);
		System.out.println("protect static field:" + C11_ModifierTest.si2);
		System.out.println("default static field:" + C11_ModifierTest.si3);
		//System.out.println("private static field:" + C11_ModifierTest.si4);
		
		C11_ModifierTest.smethod1();
		C11_ModifierTest.smethod2();
		C11_ModifierTest.smethod3();
		//C11_ModifierTest.smethod4();
		
		// # 인스턴스로 사용할 경우
		C11_ModifierTest instance = new C11_ModifierTest(); 
	
		System.out.println("public static field:" + instance.i1);
		System.out.println("protect static field:" + instance.i2);
		System.out.println("default static field:" + instance.i3);
		//System.out.println("private static field:" + instance.i4);
		
		
		// ### 다른 패키지에 다른 클래스에 접근하는 경우
		// 기본적으로는 public이 붙은 자원에만 접근할 수 있다.
		myobj.C11_ModifierTest instance2 = new myobj.C11_ModifierTest();
		
		System.out.println(instance2.i1);
		instance2.method1();
	}
}
