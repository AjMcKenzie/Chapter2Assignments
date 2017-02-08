/**
 * 
 */
package youDoIt;

import java.util.Scanner;

/**
 * @author AM312792
 *
 */
public class CreateSpaceServices 
{

	public static void main(String[] args) 
	{
		String service;
		double price;
		
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter service >> ");
		service = keyboard.nextLine();
		System.out.print("Enter price >> ");
		price = keyboard.nextDouble();
		
		
		

	}

}
