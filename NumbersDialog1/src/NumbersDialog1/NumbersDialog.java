/**
 * 
 */
package NumbersDialog1;
import javax.swing.JOptionPane;
/**
 * @author am312792
 *
 */
public class NumbersDialog
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int creditDays = 30;
		JOptionPane.showMessageDialog(null, "" + creditDays);
		JOptionPane.showMessageDialog
			(null, "Every bil is due in " + creditDays + " days");

	}

}
