import java.util.Random;

public class Dice {
	private static int diceroll;
	

	public static int getDiceroll() {
		Random randomNumbers = new Random();
		diceroll = 1 + randomNumbers.nextInt( 6 );
		return diceroll;
	}
	
	public String toString() {
		return String.format("diceroll = %d",getDiceroll());
	}}