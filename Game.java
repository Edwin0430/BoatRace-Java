import java.util.Scanner;
import java.util.Collections;

public class Game {
	private String u1, u2;
	boolean run = true;
	private int option;
	Scanner input = new Scanner(System.in);
	
	public Game() {
		menu();
	}
	
	public String getU1() {
        return u1;
    }

    public void setU1(String u1) {
        this.u1 = u1;
    }

    public String getU2() {
        return u2;
    } 

    public void setU2(String u2) {
        this.u2 = u2;
    }
	
	private void menu() {
		System.out.println("----------Boat Race----------"); 
		while (run == true) {
			try {
			System.out.println("");
			System.out.println("Selection Page:");
			System.out.println("1 -Start-");
			System.out.println("2 -Rules-");
			System.out.println("3 -Exit-");
			System.out.println("");
			System.out.println("What would you like to do? ");
			System.out.print("Enter option: ");
			option = input.nextInt();
			
			//Game option
			if (option == 1) {
				start();
				break;}
			
			//Game rules option
			else if (option == 2) {
				rules();
				break;
			}
			//Quit option
			else if (option == 3) {
				System.out.println("");
				System.out.println("See you next time!");
				break;
			}
			
			//Invalid integer handling
			else {
				System.out.println("");
				System.out.println("Please select an option.");
			}}
			
			//Exception handling for input mismatch
			catch (Exception e) {
				System.out.println("");
				System.out.println("Invalid input, please try again. ");
				input.next();
				continue;}
	}}

	public void rules() {
		System.out.println("");
		System.out.println("-- Game Rules --");
		System.out.println("1. Player 1 and Player 2 are to enter their 5 character username.");
		System.out.println("2. Players will be then placed onto the river with a 100-tiles to row.");
		System.out.println("3. Player 1 start first, followed by Player 2.");
		System.out.println("4. There will be traps(#) and currents(C) scattered along the river.");
		System.out.println("5. The currents(C) on the river which will push the boat foward.");
		System.out.println("6. The traps(#) on the river that will pull the boat backwards.");
		System.out.println("7. Whichever player finished first is the winner!");
		System.out.println("");
		while (run == true) {
		System.out.println("Options:");
		System.out.println("1 -Back to menu-");
		System.out.println("2 -Exit-");
		System.out.print("Enter option: ");
		option = input.nextInt();
		System.out.println("");
		//Back to main menu option
		if (option == 1) {
			menu();
			break;
		}
		//Quit option
		else if (option == 2) {
			System.out.println("See you next time!");
			break;
		}
		else {
			System.out.println("Please select an option.");
			System.out.println("");
			continue;
		}
	}}
	
//Interface
public void start() {
	Scanner input2 = new Scanner(System.in);
	System.out.println("");
	System.out.println("Top 5 Scores:");
	score score = new score();
	score.readHighScore();
		while (run == true) {
		System.out.println("");	
		System.out.println("(Enter a name less than 6 characters)");
		System.out.print("Enter player 1 name: ");
		setU1(input2.nextLine());
		if (u1.length() > 6) {
			System.out.println("");
			System.out.println("Please try again.");
			continue;
		}
		else {
		while (run == true) {
		System.out.println("");
		System.out.println("(Enter a name less than 6 characters)");
		System.out.print("Enter player 2 name: ");
		setU2(input2.nextLine());
		if (u2.equals(u1)) {
			System.out.println("");
			System.out.println("Please try again.");
			run = true;}
		else if (u2.length() > 6) {
			System.out.println("");
			System.out.println("Please try again.");
			continue;}
		else {
			break;}
		}
		}
		
		break;}
		play();}

//Game method
public void play() {
	System.out.println();
	River a1 = new River();
	River a2 = new River();
	a1.setTrapCurrentlocation();
	a2.setTrapCurrentlocation();
	
	a1.showboard();
	System.out.println();
	a2.showboard();
	}

	//Next turn method
	public void turn() {
		
	}

	//End screen
	public void end() {

	}
}
//SCORE//
