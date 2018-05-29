package mundo;

public class Cuadrito {

	//ATIBUTOS//
	
	private int x;
	
	private int y;
	
	//CONSTRUCTOR//
	public Cuadrito() {
		x = 628;
		y = 336;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void moverse() {
		y+=24.4;
	}
}
