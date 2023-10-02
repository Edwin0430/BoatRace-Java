
public class Current extends RiverElement{
	
	public Current() {
		super ('C');	
	}
	/*public void forward() {
		set.player_location() = set.player_location() + getMove();
		System.out.printf("Player has step on a current moved %d forward\n", getMove());
		System.out.printf("Player %s location %d",get.name(), get.player_location());	
	}*/
	public String toString(){
		return String.format("%s",getIcon());
	}
}
