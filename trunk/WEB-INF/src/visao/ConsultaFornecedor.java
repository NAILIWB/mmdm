package visao;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

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
public class ConsultaFornecedor extends JApplet {
	private JPanel jPanel1;
	private JComboBox jComboBox2;
	private JComboBox jComboBox1;
	private ButtonGroup buttonGroup1;
	private JRadioButton jRadioButton2;
	private JRadioButton jRadioButton1;
	private JPanel jPanel3;
	private JPanel jPanel2;
	private JPanel jPanel7;
	private JPanel jPanel6;
	private JPanel jPanel5;
	private JPanel jPanel4;
	private JTabbedPane jTabbedPane1;
	
	public static void main(String[] args) {
		
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ConsultaFornecedor consultaFornecedor = new ConsultaFornecedor();
				consultaFornecedor.init();
				consultaFornecedor.start();				
				frame.getContentPane().add(consultaFornecedor);
				frame.setPreferredSize(consultaFornecedor.getSize());
				frame.setVisible(true);
			}
		
	public void init() {
		try{
			this.setSize(600,400);
			getContentPane().setLayout(null);
			this.setEnabled(false);
			{
				jPanel1 = new JPanel();
				GridLayout jPanel1Layout = new GridLayout(1, 2);
				jPanel1Layout.setHgap(5);
				jPanel1Layout.setVgap(5);
				jPanel1Layout.setColumns(2);
				getContentPane().add(jPanel1);
				getContentPane().add(getJTabbedPane1());
				jPanel1.setLayout(jPanel1Layout);
				jPanel1.setBounds(12, 12, 460, 84);
				jPanel1.setBorder(BorderFactory.createTitledBorder(""));
				{
					jPanel2 = new JPanel();
					jPanel1.add(jPanel2);
					jPanel2.setLayout(null);
					jPanel2.setBorder(BorderFactory.createTitledBorder("Tipo da Consulta"));
					jPanel2.setToolTipText("Selecione o tipo de consulta.");
					{
						jRadioButton1 = new JRadioButton();
						jPanel2.add(jRadioButton1);
						jRadioButton1.setText("CNPJ/CPF");
						jRadioButton1.setBounds(5, 19, 212, 19);
						getButtonGroup1().add(jRadioButton1);
					}
					{
						jRadioButton2 = new JRadioButton();
						jPanel2.add(jRadioButton2);
						jRadioButton2.setText("Razão Social");
						jRadioButton2.setBounds(5, 39, 211, 21);
						getButtonGroup1().add(jRadioButton2);
					}
				}
				{
					jPanel3 = new JPanel();
					GridLayout jPanel3Layout = new GridLayout(2, 1);
					jPanel3Layout.setHgap(5);
					jPanel3Layout.setVgap(5);
					jPanel3Layout.setColumns(1);
					jPanel3Layout.setRows(2);
					jPanel1.add(jPanel3);
					jPanel3.setLayout(jPanel3Layout);
					jPanel3.setBorder(BorderFactory.createTitledBorder("Parâmetros"));
					{
						jComboBox1 = new JComboBox();
						jPanel3.add(jComboBox1);
						jComboBox1.setMaximumRowCount(4);
						jComboBox1.setEnabled(false);
						jComboBox1.setToolTipText("Selecione o CNPJ/CPF do fornecedor.");

					}
					{
						jComboBox2 = new JComboBox();
						jPanel3.add(jComboBox2);
						jComboBox2.setMaximumRowCount(4);
						jComboBox2.setEnabled(false);
						jComboBox2.setToolTipText("Selecione a razão social do fornecedor.");

					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private ButtonGroup getButtonGroup1() {
		if(buttonGroup1 == null) {
			buttonGroup1 = new ButtonGroup();
		}
		return buttonGroup1;
	}
	
	private JTabbedPane getJTabbedPane1() {
		if(jTabbedPane1 == null) {
			jTabbedPane1 = new JTabbedPane();
			jTabbedPane1.setBounds(12, 122, 460, 221);
			jTabbedPane1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			jTabbedPane1.addTab("Fornecedor", null, getJPanel4(), null);
			jTabbedPane1.addTab("Endereço", null, getJPanel5(), null);
			jTabbedPane1.addTab("Contatos", null, getJPanel6(), null);
			jTabbedPane1.addTab("Dados Bancários", null, getJPanel7(), null);
		}
		return jTabbedPane1;
	}
	
	private JPanel getJPanel4() {
		if(jPanel4 == null) {
			jPanel4 = new JPanel();
			jPanel4.setLayout(null);
			jPanel4.setBorder(BorderFactory.createTitledBorder(""));
		}
		return jPanel4;
	}
	
	private JPanel getJPanel5() {
		if(jPanel5 == null) {
			jPanel5 = new JPanel();
			jPanel5.setLayout(null);
			jPanel5.setBorder(BorderFactory.createTitledBorder(""));
		}
		return jPanel5;
	}
	
	private JPanel getJPanel6() {
		if(jPanel6 == null) {
			jPanel6 = new JPanel();
			jPanel6.setLayout(null);
			jPanel6.setBorder(BorderFactory.createTitledBorder(""));
		}
		return jPanel6;
	}
	
	private JPanel getJPanel7() {
		if(jPanel7 == null) {
			jPanel7 = new JPanel();
			jPanel7.setLayout(null);
			jPanel7.setBorder(BorderFactory.createTitledBorder(""));
		}
		return jPanel7;
	}

}//Fim da classe
