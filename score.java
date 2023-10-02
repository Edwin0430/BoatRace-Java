import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

//Class attributes
public class score {
	
	// Create array list
	private ArrayList<String> names = new ArrayList<>(); // store name
	private ArrayList<Integer> turns = new ArrayList<>(); // store turns
	private ArrayList<String> fileContents = new ArrayList<>(); // store file content

	// Default constructor
	public score() {
        // Gets the names and scores from the text file and adds it to the names ArrayList and to the turns ArrayList
		try
		{
			File file = new File(".\\highscore.txt");
			Scanner s = new Scanner(new File("highscore.txt"));
			
			// While there is next input (loop)
			while (s.hasNext()) 
			{
				// Add highscore.txt content to filecontent array list
				fileContents.add(s.next());
			}
			
			// Separate names and turns to respective array list
			for (int i = 0; i < fileContents.size(); i++) 
				{
					// 0 != odd or even
					if (i == 0) 
					{
						names.add(getFileContents().get(i));
					} 
					
					// even index position will always be names
					else if (i % 2 == 0) 
					{
						names.add(getFileContents().get(i));
					}
					
					// odd index position will always be turns
					else 
					{
						turns.add(Integer.parseInt(getFileContents().get(i)));
					}
				}
			
		}
		
		
		catch (FileNotFoundException fe) {
			System.out.println("Error when opening/creating file. ");
		}
	}

	// Getters and setters
	public ArrayList<String> getNames() {
		return names;
	}

	public void setNames(ArrayList<String> names) {
		this.names = names;
	}

	public ArrayList<Integer> getTurns() {
		return turns;
	}

	public void setNumTurns(ArrayList<Integer> turns) {
		this.turns = turns;
	}

	public ArrayList<String> getFileContents() {
		return fileContents;
	}

	public void setFileContents(ArrayList<String> fileContents) {
		this.fileContents = fileContents;
	}

	
    // Instance level methods
	// This method reads the score of top five players from the text file
	public void readHighScore() 
	{
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader("highcore.txt"));
			String fileContents;

			// Read file contents 
			while ((fileContents = br.readLine()) != null) 
			{
				// print out the top 5 scores
				System.out.println(fileContents);
			}
			
			br.close();

		} 
		
		catch (Exception e) 
		{
			System.out.println("failed");
			return;
		}
	}

	// This method checks if the player has won before 
    // If the player has, then it checks if his/her latest score is their best score yet
	public void duplicateName(String dupname, int dupturn) {
		
		boolean swap = false;
		
		for (int i = 0; i < this.names.size(); i++) 
		{
			// If name in arraylist = name of winner
			if (this.names.get(i).equals(dupname)) 
			{
				// If turns used for winner is lesser than previous turns that is stored in the arraylist
				if (dupturn <= this.turns.get(i)) 
				
				{
					// set the content of (i) index in arraylist with turns of winner
					this.turns.set(i, dupturn);
					
					// assign replace with true value so that names and turns will not be added again to arraylist
					swap = true;
					break;
				} 
				
				else 
				{
					swap = true;
					break;
				}
			}
		}

		// If there are no duplicate names, will skip previous for loop and come to this loop
		if (swap == false) 
		{
			// add name and numTurn to arraylist
			this.names.add(dupname);
			this.turns.add(dupturn);
		}
	}

	// This method arranges the names and turns from the arraylist in ascending order
	public void arrWinner() 
	{
		// assign temporary variables for numTurn and name
		int temp1;
		String temp2;

		// First index in arraylist (index=0)
		for (int i = 0; i < this.names.size(); i++) 
		{
			// Second index in arraylist (index=1)
			for (int j = i + 1; j < this.names.size(); j++) 
			
			{
				// If first index num > second index num (more number of turns)
				if (this.turns.get(i) > this.turns.get(j)) 
				
				{
					// exchange the numTurn of i and j 
					temp1 = this.turns.get(i);
					this.turns.set(i, this.turns.get(j));
					this.turns.set(j, temp1);

					// exchange names of i and j 
					temp2 = this.names.get(i);
					this.names.set(i, this.names.get(j));
					this.names.set(j, temp2);
				}
			}
		}
	}
	
	// This method writes the score of the winner into the text file
		public void writeHighScore(ArrayList<String> name, ArrayList<Integer> turn) {

			Formatter output;
			try {
				output = new Formatter("highscore.txt");
				for (int i = 0; i < name.size(); i++) 
				{
					// ensure there are only 5 high scores displayed
					if (i > 4) 
					{
						break;
					}
					
					output.format("%s %d\r\n", name.get(i), turn.get(i));
				}
				
				if (output != null) 
				
				{
					output.close();
				}
			}

			catch (SecurityException se) {
				System.out.println("You do not have write access. ");
			}

			catch (FileNotFoundException fe) {
				System.out.println("Error when opening/creating file. ");
			}
		}

}