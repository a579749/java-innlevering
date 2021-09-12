package innlevering2;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class opg1 {

	public static void main(String[] args) {

		int number = parseInt(showInputDialog("inntekt"));
		
		if (number <= 184000)
			showMessageDialog(null,"Skatten din er 0");
		else if
			(number<= 230950)
			showMessageDialog(null,"Skatten din er "   +   number * 0.0093);
		else if
			(number<=580650)
			showMessageDialog(null,"Skatten din er "   +   number * 0.0241);
		else if
			(number<=934050)
			showMessageDialog(null,"Skatten din er "   +   number * 0.1152);
		else 
			showMessageDialog(null,"Skatten din er "   +   number * 0.1452);
			

	}
}
