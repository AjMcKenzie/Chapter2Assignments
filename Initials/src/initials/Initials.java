package initials;

import javax.swing.JOptionPane;

/**
 * @author am312792
 *Feb 1st 2017
 */
public class Initials 
{

	public static void main(String[] args) 
	{
		String initail1, initail2, initail3;
		int a;
		int b;
		int c;
		
		initail1 = JOptionPane.showInputDialog(null, "What is your first initial?");
		initail2  = JOptionPane.showInputDialog(null, "What is your second inital?");
		initail3 = JOptionPane.showInputDialog(null, "What is your third inital?");
		
		JOptionPane.showMessageDialog(null, "Your initials are "+ initail1 +"."+ initail2 +"." + initail3 + ".");
		
	}

}
