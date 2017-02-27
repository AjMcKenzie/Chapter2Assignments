package decisionMaking;
import java.util.Scanner;
/**
 * @author am312792
 *
 */
public class doorPrize 
{

	public static void main(String[] args) 
	{
		int choice;
		Scanner input = new Scanner(System.in);
		System.out.print("Choose a door between 1 and 3! >>>> ");
		choice = input.nextInt();
		
		//door number one
		if(choice == 1)
		{
			System.out.println("You win a brand new car!");
			
		}
		if(choice == 2)
		{
			System.out.println("You win an old pair of socks!");
			
		}
		if(choice == 3)
		{
			System.out.println("You win two, two way tickets to Norway!");
			
		}
		if(choice >= 4)
		{
			System.out.println("Didn't you read the instructions? There are only three doors, so you get nothing!"); 
		}
		

	}

}
