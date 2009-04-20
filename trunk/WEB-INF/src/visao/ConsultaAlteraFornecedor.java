package visao;

import javax.swing.JApplet;
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
@SuppressWarnings("serial")
public class ConsultaAlteraFornecedor extends JApplet {

	public static void main(String[] args) {
		
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ConsultaAlteraFornecedor consultaAlteraFornecedor = new ConsultaAlteraFornecedor();
				consultaAlteraFornecedor.init();
				consultaAlteraFornecedor.start();				
				frame.getContentPane().add(consultaAlteraFornecedor);
				frame.setPreferredSize(consultaAlteraFornecedor.getSize());
				frame.setVisible(true);
			}
		
	public void init() {
		try{
			getContentPane().setLayout(null);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}//Fim da classe
