
public class Player extends River{
	private String player;
	private int playerlocation;
	
	public void setPlayerLocation(int PlayerLocation) {
		this.playerlocation = PlayerLocation;
		
	}
	public int getPlayerLocation() {
		return playerlocation;
	}

	public Player() {
		setPlayerLocation(0);
		setPlayername("boat");
	}
	
	public Player(String player) {
		setPlayerLocation(0);
		setPlayername(player);
	}
	
	public String getPlayername() {
        return player;
    }

    public void setPlayername(String player) {
        this.player = player;
    }
    
    public String toString() {
        return player + " ";
    }
    
}
