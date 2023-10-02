public class Trap extends RiverElement{
	
	public Trap() {
		super ('#');	
	}
	public void backward() {
		setPlayerLocation() = setPlayerLocation() - getMove();
		System.out.printf("Player has step on a trap, moved %d backward\n", getMove());
		System.out.printf("Player %s location %d",getPlayername(), getPlayerLocation());}	
	
	public String toString(){
		return String.format("%s",getIcon());
	}


}
