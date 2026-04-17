public class LabOne {
	public static void main(String[] args) {
		//----------
		// Example
		//----------
		String myName = "Daniel Cardenas";  // TODO: Change to your own name.
		System.out.println("Hi, my name is " + myName + ".");

		//----------
		// Q1
		//----------

		// TODO: intialize variables to fill in the two FIXMEs in the following print.
		String favoriteSong = "Bupkis";
		String artist ="Mustard Service";
		System.out.println("I love listening to " + favoriteSong + " by " + artist + ".");

		//----------
		// Q2
		//----------

		// TODO: initialize variables to fill in the FIXMEs.
		// You may not declare/initialize any strings for this question.
		// Each variable type initialized in this question can only be used once.
		// The available datatypes are float, boolean, double, int, and char.
		
		//Justification Here
		int songYear = 2023 ;

		//Justification Here
		double fractionPlayed = 0.0000042509;

		//Justification Here
		float vinylCost = 35;

		//Justification Here
		char tier = 'S';

		boolean certifiedBanger = true ;

		//replace FIXME with the appropriate variable
		System.out.println("The song was released in the year " + songYear + ".");

		System.out.println("A vinyl copy might sell for $" + vinylCost + "!");

		System.out.println("One play of the song would only equal " + fractionPlayed + " of the total plays!");

		System.out.println("Overall, this artist's songs should be considered " + tier + " tier.");

		System.out.println("And is it a certified Banger? " + certifiedBanger);

		//----------
		// Q3
		//----------
		// Change the values for these variables to test your expression
		boolean isExpensive = false ;
		boolean worthIt = true;
		boolean areFriendsGoing = true ;

		// TODO: Replace initialization with boolean expression using above three boolean variables.
		// I will go to the concert if my friends are going and it is either worth it or not expensive.
		boolean willAttendConcertResult = (areFriendsGoing)&&(isExpensive||worthIt); 

		System.out.println("Will I go to the next concert? The answer is " + willAttendConcertResult + ".\n");
		
		//----------
		// Q4
		//----------

		// TODO: update the previous play count variable, incrementing it by 1, and fill in the FIXME.
		fractionPlayed = fractionPlayed *2 ;
		System.out.println("Even if I listen to it 2 times, that only makes up " + fractionPlayed + " of the total plays!");
	}
}