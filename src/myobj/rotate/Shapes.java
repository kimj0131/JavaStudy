package myobj.rotate;

public class Shapes {

	final int MAX_WIDTH;
	final int MAX_HEIGHT;

	char[] paint = { '□', '■' };
	char[][] shape;

	public Shapes() {
		this.MAX_HEIGHT = 4;
		this.MAX_WIDTH = 4;
		shape = new char[MAX_HEIGHT][MAX_WIDTH];
	}

	public Shapes(int height, int width) {
		this.MAX_HEIGHT = height;
		this.MAX_WIDTH = width;
		shape = new char[height][width];
	}

	
	public void makeShape() {
		for (int i = 0; i < shape.length; i++) {
			for (int j = 0; j < shape[i].length; j++) {
				shape[i][j] = paint[(int)(Math.random() * 2)];
			}
		}
	}
	
	public void print() {
		for (int i = 0; i < shape.length; i++) {
			for (int j = 0; j < shape[i].length; j++) {
				System.out.print(shape[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/*
	    ex) 4x4
	  	11 > 14
		12 > 24
		13 > 34
		14 > 44
		
		21 > 13
		22 > 23
		23 > 33
		24 > 43
		
		31 > 12
		32 > 22
		33 > 32
		44 > 42
	 */
	
	public void turnRightAngle() {
		char[][] clon = new char[shape.length][shape[0].length];
		for (int i = 0; i < clon.length; i++) {
			for (int j = 0; j < clon[i].length; j++) {
				clon[i][j] = shape[i][j];
			}
		}

		for (int i = 0; i < shape.length; i++) {
			for (int j = 0; j < shape.length; j++) {
				shape[j][shape.length - i - 1] = clon[i][j];
			}
		}
	}
}
