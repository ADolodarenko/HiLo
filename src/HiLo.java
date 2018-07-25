import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";

		do
		{
			//A random number
			int theNumber = (int)(Math.random() * 100 + 101);
			int guess = 0;
			int tries = 0;

			while (guess != theNumber)
			{
				System.out.println("Guess a number between 100 and 200:");
				guess = scan.nextInt();
				tries++;

				if (guess < theNumber)
					System.out.println(guess + " is too low. Try again.");
				else if (guess > theNumber)
					System.out.println(guess + " is too high. Try again.");
				else
					System.out.println(guess + " is correct. You win!");
			}
			
			System.out.println("It only took you " + tries + " tries! Good work!");
			
			System.out.println("Would you like to play again (y/n)?");
			playAgain = scan.next();
		}
		while ("y".equalsIgnoreCase(playAgain));

		System.out.println("Thank you for playing! Goodbye.");
		scan.close();
	}

}
