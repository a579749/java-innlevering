package innlevering2;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class opg2 {

	 public static void main(String[]args) {


		    for(int asd=1; asd<=10; asd++) {

		    int poeng=parseInt(showInputDialog("Karakter " + asd));


		    if	(poeng > 100 || poeng < 0)
		    {
		    showMessageDialog(null,"Error");
		    asd -=1; }	
		    
		    else if
		    	(poeng<40)
		    	showMessageDialog(null,"F");
		    else if
		        (poeng<=49)
		        showMessageDialog(null,"E");
		    else if
		        (poeng<=59)
		        showMessageDialog(null,"D");
		    else if
		        (poeng<=79)
		        showMessageDialog(null,"C");
		    else if
		        (poeng<=89)
		        showMessageDialog(null,"B");
		    else if
		    	(poeng<=100)
		        showMessageDialog(null,"A");
		  
		    }
		    }
	
}
