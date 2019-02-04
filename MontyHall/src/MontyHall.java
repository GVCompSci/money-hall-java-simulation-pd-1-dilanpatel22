import java.util.Scanner;
import java.util.Random;

public class MontyHall {

	public static void main(String[] args)
	{
		
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		
		int car = rand.nextInt(3)+1;
		
		System.out.print("Enter what door you think the car is behind: ");
		int guess = in.nextInt();
		int guess2 = 1;
		
		if (guess>=1 && guess<=3)
		{
			if(guess==car)
			{
				if(car==1)
				{
					System.out.println("There is a goat behind door 2");
					int goat = 2;
					guess2 = 1;
				}
				else if (car==3)
				{
					System.out.println("There is a goat behind door 1");
					int goat = 1;
					guess2 = 2;
				}
			}
			else
			{
				if (car==1 && guess==2)
				{
					System.out.println("There is a goat behind door 3");
					int goat = 3;
					guess2 = 1;
				}
				else if (car==2 && guess==3)
				{
					System.out.println("There is a goat behind door 1");
					int goat = 1;
					guess2 = 2;
				}
				else if (car==3 && guess==1)
				{
					System.out.println("The goat is behind door 2");
					int goat = 2;
					guess2 = 1;
				}
				else if (car==2 && guess==1)
				{
					System.out.println("The goat is behind door 3");
					int goat = 3;
					guess2 = 2;
				}
				else if (car==3 && guess==2)
				{
					System.out.println("The goat is behind dppr 1");
					int goat = 1;
					guess2 = 3;
				}
			}
			System.out.println("Would you like to chamge your guess: ");
			String answer = in.next();
			
			answer = answer.toLowerCase();
			
			if (answer.equals("yes"))
			{
				if (guess2==car)
				{
					System.out.println("The car was behind door " + car);
					System.out.println("You win");
				}
				else
				{
					System.out.println("The car was behind " + car);
					System.out.println("You lose");
				}
			}
			if (answer.equals("no"))
			{
				if (guess==car)
				{
					System.out.println("The car was behind " + car);
					System.out.println("You win");
				}
				else
				{
					System.out.println("The car was behind door" + car);
					System.out.println("You lose");
				}
			}
		}
		
	}
	
}

