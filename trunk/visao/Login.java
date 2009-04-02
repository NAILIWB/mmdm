package visao;

import java.awt.Dimension;

import javax.swing.JApplet;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Login extends JApplet {

	
public static void main(String[] args) {
		JFrame frame = new JFrame();
		Login inst = new Login();
		frame.getContentPane().add(inst);
		((JComponent)frame.getContentPane()).setPreferredSize(inst.getSize());
		frame.pack();
		frame.setVisible(true);
	}
	
	public Login() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			this.setSize(456, 300);
			getContentPane().setLayout(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}//Fim da classe
