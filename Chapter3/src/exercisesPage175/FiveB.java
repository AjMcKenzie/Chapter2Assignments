package exercisesPage175;
import javax.swing.JOptionPane;

/**
 * @author am312792
 *Feb 6th 2017
 */
public class FiveB 
{
	public static void main(String[] args) 
	{
	
	String userInputString;
	double secondDoubleEntry;
	double firstDoubleEntry;
	double answer;
	
	
	userInputString = JOptionPane.showInputDialog(null, "Please enter a value ");
	firstDoubleEntry = Double.parseDouble(userInputString);
	
	userInputString = JOptionPane.showInputDialog(null, "Please enter a value");
	secondDoubleEntry = Double.parseDouble(userInputString);
	
	answer = firstDoubleEntry / secondDoubleEntry;
	
	
	JOptionPane.showMessageDialog(null, " " + firstDoubleEntry + " is " + answer +  " percent of " + secondDoubleEntry + " = " + answer);
	
	
	
	
	}

}
