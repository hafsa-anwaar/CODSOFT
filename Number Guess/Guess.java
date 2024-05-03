import java.util.Scanner;
public class Guess {
	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		//the number that the developer assigned
		int guess;
		//we keep the guess as 10
		//attempt is a counter variable of the no of attempts in the game
		int attempt=0;
		// a max no of attempt a user can make to guess the number is 3 in this program
		
		do {
		System.out.print("Guess the number from 1 to 100: ");
		//asking user to guess the number
		guess=myObj.nextInt();
		attempt++;
		if(guess==10) {
		System.out.println("\t\tCongratulations you have guessed the number!");
		//break is used to jump out of the do while loop
		break;
		}
		else if(guess>=50)
		{
			System.out.println("\t\tYour guess is too high");
		}
		else if(guess>=20)
		{
			System.out.println("\t\tYour guess is high ");
		}
		else if(guess<=5)
		{
			System.out.println("\t\tYour guess is too low");
		}
		else if(guess==9||guess==11)
		{
			System.out.println("\t\t You are about to guess the number");
		}
		else if(guess>10)
		{
			System.out.println("\t\tYour guess is near");
		}
		else {
			System.out.println("\t\tYour guess is low");
		}
		if(attempt>=3)
	//statement  if the guess is incorrect until the last no. of attempt
		{ System.out.println("Sorry you have ran out of attempts");
		System.out.println("Your score is 0");
		
		break;}
		
		}
		while(guess!=10);
		//after the loop the score will be given acc. to no of attempts
		while(guess==10) {
		if(attempt==1) {
			System.out.println("Your score is 100");
			break;
		      }
		else if(attempt==2) {
			System.out.println("Your score is 70");
			break;
		      }
		else  {
			System.out.println("Your score is 50");
			break;
		      }
				}
		myObj.close();
	}
}
