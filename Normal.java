
public class Normal extends RiverElement{
	
	public Normal() {
		super('*');
		setMove(0);
	}
	
	public String toString(){
		return String.format("%s",getIcon());
	}
	

}
