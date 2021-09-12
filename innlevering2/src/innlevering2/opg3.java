package innlevering2;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class opg3 {

	
	public static void main(String[]args) {
		
		int a = parseInt(showInputDialog("Input"));
			
		showMessageDialog(null, fakultet(a));
	}
		public static int fakultet(int n) {
		if(n==1) {
		return 1;
			}  
		else {
			return n*fakultet(n-1);
			}
		
	}
	
}
