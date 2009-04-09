package visao;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
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

public class CadastraCliente extends JApplet {
	private static final long serialVersionUID = 1L;
	private JTabbedPane jTabbedPane1;
	private JPanel jPanel1;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JFormattedTextField jFormattedTextField1;
	private JComboBox jComboBox1;
	private JTextField jTextField3;
	private JLabel jLabel2;
	private JTextField jTextField1;
	private JLabel jLabel1;
	private JPanel jPanel5;
	private JPanel jPanel4;
	private JPanel jPanel3;
	private JPanel jPanel2;

	public static void main(String[] args) {
		
				JFrame frame = new JFrame("DADOS DO CLIENTE");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				CadastraCliente cadastraCliente = new CadastraCliente();
				cadastraCliente.init();
				cadastraCliente.start();
				frame.getContentPane().add(cadastraCliente);
				frame.setPreferredSize(cadastraCliente.getSize());
				frame.setVisible(true);
			}
		
	public void init() {
		try {
			this.setSize(500,400);
			getContentPane().setLayout(null);
			{
				jTabbedPane1 = new JTabbedPane();
				getContentPane().add(jTabbedPane1);
				jTabbedPane1.setBounds(12, 12, 476, 286);
				jTabbedPane1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				{
					jPanel1 = new JPanel();
					jTabbedPane1.addTab("Cliente", null, jPanel1, null);
					jPanel1.setLayout(null);
					jPanel1.setBorder(BorderFactory.createTitledBorder(""));
					jPanel1.setPreferredSize(new java.awt.Dimension(465, 211));
					{
						jLabel1 = new JLabel();
						jPanel1.add(jLabel1);
						jLabel1.setText("Razão Social");
						jLabel1.setBounds(17, 17, 89, 22);
					}
					{
						jLabel3 = new JLabel();
						jPanel1.add(jLabel3);
						jLabel3.setText("Representante Legal");
						jLabel3.setBounds(18, 89, 112, 25);
					}
					{
						jLabel2 = new JLabel();
						jPanel1.add(jLabel2);
						jLabel2.setText("Cpf/Cnpj");
						jLabel2.setBounds(17, 51, 64, 26);
					}
					{
						jLabel4 = new JLabel();
						jPanel1.add(jLabel4);
						jLabel4.setText("Despacho Disponível");
						jLabel4.setBounds(17, 133, 112, 26);
					}
					{
						jTextField1 = new JTextField();
						jPanel1.add(jTextField1);
						jTextField1.setToolTipText("Informe a denominação jurídica da empresa.");
						jTextField1.setBounds(101, 17, 344, 26);
						jTextField1.setSize(344, 23);
					}
					{
						jFormattedTextField1 = new JFormattedTextField();
						jPanel1.add(jFormattedTextField1);
						jFormattedTextField1.setBounds(101, 54, 344, 23);
						jFormattedTextField1.setToolTipText("Informe os números do CPF ou CNPJ. ");
						jFormattedTextField1.setHorizontalAlignment(SwingConstants.CENTER);
					}
					{
						jTextField3 = new JTextField();
						jPanel1.add(jTextField3);
						jTextField3.setToolTipText("Informe o nome do representante legal da empresa.");
						jTextField3.setBounds(126, 89, 319, 26);
						jTextField3.setSize(319, 23);
					}
					{
						ComboBoxModel jComboBox1Model = 
							new DefaultComboBoxModel(
									new String[] { "SIM", "NÃO" });
						jComboBox1 = new JComboBox();
						jPanel1.add(jComboBox1);
						jComboBox1.setModel(jComboBox1Model);
						jComboBox1.setToolTipText("Selecione um dos itens.");
						jComboBox1.setMaximumRowCount(2);
						jComboBox1.setBounds(126, 132, 117, 27);
						jComboBox1.setSize(117, 23);
					}
				}
				{
					jPanel2 = new JPanel();
					GridLayout jPanel2Layout = new GridLayout(1, 1);
					jPanel2Layout.setColumns(1);
					jPanel2Layout.setHgap(5);
					jPanel2Layout.setVgap(5);
					jTabbedPane1.addTab("Endereço", null, jPanel2, null);
					jPanel2.setLayout(jPanel2Layout);
					jPanel2.setBorder(BorderFactory.createTitledBorder(""));
				}
				{
					jPanel3 = new JPanel();
					GridLayout jPanel3Layout = new GridLayout(1, 1);
					jPanel3Layout.setColumns(1);
					jPanel3Layout.setHgap(5);
					jPanel3Layout.setVgap(5);
					jTabbedPane1.addTab("Contatos", null, jPanel3, null);
					jPanel3.setLayout(jPanel3Layout);
					jPanel3.setBorder(BorderFactory.createTitledBorder(""));
				}
				{
					jPanel4 = new JPanel();
					GridLayout jPanel4Layout = new GridLayout(1, 1);
					jPanel4Layout.setColumns(1);
					jPanel4Layout.setHgap(5);
					jPanel4Layout.setVgap(5);
					jTabbedPane1.addTab("Dados Bancários", null, jPanel4, null);
					jPanel4.setLayout(jPanel4Layout);
					jPanel4.setBorder(BorderFactory.createTitledBorder(""));
				}
				{
					jPanel5 = new JPanel();
					GridLayout jPanel5Layout = new GridLayout(4, 2);
					jPanel5Layout.setColumns(2);
					jPanel5Layout.setHgap(5);
					jPanel5Layout.setVgap(5);
					jPanel5Layout.setRows(4);
					jPanel5.setLayout(jPanel5Layout);
					jTabbedPane1.addTab("Acesso Remoto", null, jPanel5, null);
					jPanel5.setBorder(BorderFactory.createTitledBorder(""));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}//Fim da classe
