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
		
		animal = JOptionPane.showInputDialog(null, "Name a animal.");
		
		noun = JOptionPane.showInputDialog(null, "Give a noun.");
		
		pluralNoun = JOptionPane.showInputDialog(null, "Type a plural Noun.");
		
		bodyPart = JOptionPane.showInputDialog(null, "Name a body part.");
		
		bodyPartTold = bodyPart;
		
		c = a - b;
		
		
		
		JOptionPane.showMessageDialog(null, " There once was a man with a  " + color + " shirt his name was Gary Busey and he is the " + wordEst + " of all humans. He has " + wholeNumber + " " + bodyPartPlural + ", and a/an "  + animal + 
				" shaped like a " + noun + ". \n The " + animal +  " loves to eat " + pluralNoun +  ", although it will feast on nearly anything. Gary Busey's " + bodyPart + 
				" is always cold. \n So one day Gary Busey wanted to warm up his " + bodyPartTold + " with a big bonfire. But when he was making the fire he leaned over to put more wood in it and...fell in and burn to death!");
		
	}

}
