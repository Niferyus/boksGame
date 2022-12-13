package boksGame;

public class Main {

	public static void main(String[] args) {
		int randomnumber = (int) (Math.random() *10);
		int randomnumber1 = (int) (Math.random() *10);
		int randomnumber2 = (int) (Math.random() *10);
		int randomnumber3 = (int) (Math.random() *10);
		Fighter fighter = new Fighter("Mike Tyson", 10, 100, 120,randomnumber,randomnumber2);
		Fighter fighter1 = new Fighter("Muhammed Ali", 10, 100, 120,randomnumber1,randomnumber3);
		
		Match match = new Match(fighter, fighter1, 120, 150);
		
		match.run();
	
		
	}

}
