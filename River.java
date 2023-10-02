import java.util.ArrayList;
import java.util.Random;

public class River {
	ArrayList<RiverElement> river = new ArrayList<RiverElement>();
	
	public void setTrapCurrentlocation(){
		for (int i = 0; i < 99; i++) {
			Random number = new Random();
			int a = number.nextInt(6);
			if (i == 0) {
				river.add(new Normal());
			}
			else if (a == 1) {
				river.add(new Trap());
			}
			else if (a == 2) {
				river.add(new Current());	
			}
			else {
				river.add(new Normal());
			}		
			
		}	
		river.add(new Normal());
	}
	
	public ArrayList<RiverElement> getriver() {
		return river;
	}
	
	public void setriver(ArrayList<RiverElement> river) {
		this.river = river;
	}
	public void showboard() {
		for (int i =0; i < river.size();i++) {
			System.out.printf("%s,", river.get(i));
		}
	}

}