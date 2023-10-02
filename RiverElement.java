import java.util.Random;

public class RiverElement {
	private int move;
	private char icon;
	
	public RiverElement(char a) {
		Random number = new Random();
		move = number.nextInt(4);
		icon = a;
	}

	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}

	public char getIcon() {
		return icon;
	}

	public void setIcon(char icon) {
		this.icon = icon;
	}
	

}