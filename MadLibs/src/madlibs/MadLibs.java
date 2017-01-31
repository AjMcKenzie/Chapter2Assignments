package madlibs;
import javax.swing.JOptionPane;
/**
 * @author AM312792
 *Jan 31st 2017
 */
public class MadLibs 
{
	public static void main(String[] args)
	{
		String color, wordEst, bodyPartPlural, animal, noun, pluralNoun, wholeNumber, bodyPart, bodyPartTold;
		int a = 5;
		
		int b;
		
		int c;
		
		
		color = JOptionPane.showInputDialog(null, "What is your color");
		
		wordEst = JOptionPane.showInputDialog(null, "Pick a word that ends in est");
		
		bodyPartPlural = JOptionPane.showInputDialog(null, "Name a plural body part.");
		
		wholeNumber = JOptionPane.showInputDialog(null, "Give a number that is a whole number, no decimals.");
		b = Integer.parseInt(wholeNumber);
		
		animal = JOptionPane.showInputDialog(null, "Name an animal.");
		
		noun = JOptionPane.showInputDialog(null, "Give a noun.");
		
		pluralNoun = JOptionPane.showInputDialog(null, "Type a plural Noun.");
		
		bodyPart = JOptionPane.showInputDialog(null, "Name a body part.");
		
		bodyPartTold = bodyPart;
		
		c = a - b;
		
		
		
		JOptionPane.showMessageDialog(null, "The " + color + " Dragon is the " + wordEst + " dragon of all. It has " + wholeNumber + " " + bodyPartPlural + ", and a " + animal + 
				" shaped like a " + noun + ". It loves to eat " + pluralNoun +  ", although it will feast on nearly anything. The dragons " + bodyPart + 
				" is always cold. So one day the dargon wanted to warm up it's " + bodyPartTold + ". But he died!");
		
	}

}
