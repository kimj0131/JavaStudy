package quiz;

import myobj.rotate.Shapes;

public class C17_RotateShape {
	/*
	 	2차원 배열로 이루어진 어떤 모양이 있을때
	 	해당 모양을 오른쪽으로 90도 회전시키는 프로그램을 만들어보세요 
	*/
	public static void main(String[] args) {
		Shapes shape = new Shapes(5, 5);
		shape.makeShape();
		shape.print();
		shape.turnRightAngle();
		shape.print();
	}
}
