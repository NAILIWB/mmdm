package visao;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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
@SuppressWarnings("serial")
public class ConsultaFuncionario extends JApplet {
	private JPanel jPanel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel7;    
	private JTextField jTextField6;
	private JButton jButton2;
	private JPanel jPanel4;
	private JTextField jTextField16;
	private JLabel jLabel16;
	private JButton jButton1;
	private JTextField jTextField15;
	private JLabel jLabel15;
	private JTextField jTextField14;
	private JLabel jLabel14;
	private JTextField jTextField13;
	private JLabel jLabel13;
	private JTextField jTextField12;
	private JLabel jLabel12;
	private JTextField jTextField11;
	private JLabel jLabel11;
	private JTextField jTextField10;
	private JLabel jLabel10;
	private JTextField jTextField9;
	private JLabel jLabel9;
	private JTextField jTextField8;
	private JLabel jLabel8;
	private JTextField jTextField7;
	private JLabel jLabel6;
	private JTextField jTextField5;
	private JTextField jTextField4;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private JLabel jLabel1;
	private JTextField jTextField1;
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
	private JTabbedPane jTabbedPane1;
	
	public static void main(String[] args) {
		
				JFrame frame = new JFrame("CONSULTA FUNCIONÁRIO");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ConsultaFuncionario consultaFuncionario = new ConsultaFuncionario();
				consultaFuncionario.init();
				consultaFuncionario.start();				
				frame.getContentPane().add(consultaFuncionario);
				frame.setPreferredSize(consultaFuncionario.getSize());
				frame.setVisible(true);
			}
		
	public void init() {
		try{
			this.setSize(485, 465);
			getContentPane().setLayout(null);
			
			{
				jPanel1 = new JPanel();
				GridLayout jPanel1Layout = new GridLayout(1, 2);
				jPanel1Layout.setHgap(5);
				jPanel1Layout.setVgap(5);
				jPanel1Layout.setColumns(2);
				getContentPane().add(jPanel1);
				getContentPane().add(getJTabbedPane1());
				{
					jPanel4 = new JPanel();
					GridLayout jPanel4Layout = new GridLayout(1, 2);
					jPanel4Layout.setColumns(2);
					jPanel4Layout.setHgap(5);
					jPanel4Layout.setVgap(5);
					getContentPane().add(jPanel4);
					jPanel4.setLayout(jPanel4Layout);
					jPanel4.setBorder(BorderFactory.createTitledBorder(""));
					jPanel4.setBounds(129, 413, 229, 38);
					{
						jButton1 = new JButton();
						jPanel4.add(jButton1);
						jButton1.setText("Consultar");
						jButton1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/Consultas.GIF")));
						jButton1.setToolTipText("Clique para consultar os dados do Funcionário.");
						jButton1.setBounds(187, 413, 118, 26);
						jButton1.setPreferredSize(new java.awt.Dimension(95, 27));
						jButton1.setSize(116, 28);
					}
					{
						jButton2 = new JButton();
						jPanel4.add(jButton2);
						jButton2.setText("Sair");
						jButton2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/Sair.GIF")));
						jButton2.setToolTipText("Clique para fechar o formulário.");
						jButton2.setSize(116, 28);
					}
				}
				jPanel1.setLayout(jPanel1Layout);
				jPanel1.setBounds(12, 12, 460, 91);
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
						jRadioButton1.setText("CPF");
						jRadioButton1.setBounds(5, 19, 212, 19);
						getButtonGroup1().add(jRadioButton1);
					}
					{
						jRadioButton2 = new JRadioButton();
						jPanel2.add(jRadioButton2);
						jRadioButton2.setText("Nome Funcionário");
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
						jComboBox1.setToolTipText("Selecione o CPF do funcionário.");

					}
					{
						jComboBox2 = new JComboBox();
						jPanel3.add(jComboBox2);
						jComboBox2.setMaximumRowCount(4);
						jComboBox2.setEnabled(false);
						jComboBox2.setToolTipText("Selecione o nome do funcionário");

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
			jTabbedPane1.setBounds(12, 122, 460, 276);
			jTabbedPane1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			jTabbedPane1.addTab("Endereço", null, getJPanel5(), null);
			jTabbedPane1.addTab("Contatos", null, getJPanel6(), null);
			jTabbedPane1.addTab("Dados Bancários", null, getJPanel7(), null);
		}
		return jTabbedPane1;
	}

	private JPanel getJPanel5() {
		if(jPanel5 == null) {
			jPanel5 = new JPanel();
			GridLayout jPanel5Layout = new GridLayout(8, 2);
			jPanel5Layout.setColumns(2);
			jPanel5Layout.setHgap(5);
			jPanel5Layout.setVgap(5);
			jPanel5Layout.setRows(8);
			jPanel5.setLayout(jPanel5Layout);
			jPanel5.setBorder(BorderFactory.createTitledBorder(""));
			{
				jLabel1 = new JLabel();
				jPanel5.add(jLabel1);
				jLabel1.setText("Logradouro");
			}
			{
				jTextField1 = new JTextField();
				jPanel5.add(jTextField1);
				jTextField1.setColumns(100);
				jTextField1.setSize(217, 24);
				jTextField1.setEditable(false);
			}
			{
				jLabel2 = new JLabel();
				jPanel5.add(jLabel2);
				jLabel2.setText("Número");
			}
			{
				jTextField2 = new JTextField();
				jPanel5.add(jTextField2);
				jTextField2.setColumns(5);
				jTextField2.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField2.setEditable(false);
			}
			{
				jLabel8 = new JLabel();
				jPanel5.add(jLabel8);
				jLabel8.setText("C.E.P.");
			}
			{
				jTextField8 = new JTextField();
				jPanel5.add(jTextField8);
				jTextField8.setColumns(15);
				jTextField8.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField8.setEditable(false);
			}
			{
				jLabel3 = new JLabel();
				jPanel5.add(jLabel3);
				jLabel3.setText("Complemento");
			}
			
			{
				jTextField3 = new JTextField();
				jPanel5.add(jTextField3);
				jTextField3.setColumns(50);
				jTextField3.setEditable(false);
			}
			{
				jLabel4 = new JLabel();
				jPanel5.add(jLabel4);
				jLabel4.setText("Bairro");
			}
			{
				jTextField4 = new JTextField();
				jPanel5.add(jTextField4);
				jTextField4.setColumns(50);
				jTextField4.setEditable(false);
			}
			{
				jLabel5 = new JLabel();
				jPanel5.add(jLabel5);
				jLabel5.setText("Cidade");
			}
			{
				jTextField5 = new JTextField();
				jPanel5.add(jTextField5);
				jTextField5.setColumns(50);
				jTextField5.setEditable(false);
			}
			{
				jLabel6 = new JLabel();
				jPanel5.add(jLabel6);
				jLabel6.setText("Unidade Federativa");
			}
			{
				jTextField6 = new JTextField();
				jPanel5.add(jTextField6);
				jTextField6.setColumns(20);
				jTextField6.setEditable(false);
			}
			{
				jLabel7 = new JLabel();
				jPanel5.add(jLabel7);
				jLabel7.setText("País");
			}
			{
				jTextField7 = new JTextField();
				jPanel5.add(jTextField7);
				jTextField7.setColumns(50);
				jTextField7.setEditable(false);
			}
		}
		return jPanel5;
	}
	
	private JPanel getJPanel6() {
		if(jPanel6 == null) {
			jPanel6 = new JPanel();
			jPanel6.setLayout(null);
			jPanel6.setBorder(BorderFactory.createTitledBorder(""));
			{
				jLabel9 = new JLabel();
				jPanel6.add(jLabel9);
				jLabel9.setText("Telefone Fixo");
				jLabel9.setBounds(5, 5, 217, 24);
				jLabel9.setSize(217, 24);
			}
			{
				jTextField9 = new JTextField();
				jPanel6.add(jTextField9);
				jTextField9.setEditable(false);
				jTextField9.setColumns(20);
				jTextField9.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField9.setBounds(227, 5, 217, 24);
				jTextField9.setSize(217, 24);
			}
			{
				jLabel10 = new JLabel();
				jPanel6.add(jLabel10);
				jLabel10.setText("Telefone Celular");
				jLabel10.setBounds(5, 52, 217, 26);
				jLabel10.setSize(217, 24);
			}
			{
				jTextField10 = new JTextField();
				jPanel6.add(jTextField10);
				jTextField10.setEditable(false);
				jTextField10.setColumns(20);
				jTextField10.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField10.setBounds(227, 52, 217, 26);
				jTextField10.setSize(217, 24);
			}
			{
				jLabel16 = new JLabel();
				jPanel6.add(jLabel16);
				jLabel16.setText("Telefone Nextel");
				jLabel16.setBounds(5, 99, 217, 27);
				jLabel16.setSize(217, 24);
			}
			{
				jTextField16 = new JTextField();
				jPanel6.add(jTextField16);
				jTextField16.setEditable(false);
				jTextField16.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField16.setColumns(20);
				jTextField16.setBounds(227, 99, 217, 27);
				jTextField16.setSize(217, 24);
			}
			{
				jLabel11 = new JLabel();
				jPanel6.add(jLabel11);
				jLabel11.setText("Email");
				jLabel11.setBounds(5, 146, 217, 26);
				jLabel11.setSize(217, 24);
			}
			{
				jTextField11 = new JTextField();
				jPanel6.add(jTextField11);
				jTextField11.setEditable(false);
				jTextField11.setColumns(20);
				jTextField11.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField11.setBounds(227, 146, 217, 26);
				jTextField11.setSize(217, 24);
			}
			{
				jLabel12 = new JLabel();
				jPanel6.add(jLabel12);
				jLabel12.setText("Messenger");
				jLabel12.setBounds(5, 146, 217, 42);
				jLabel12.setSize(217, 24);
			}
			{
				jTextField12 = new JTextField();
				jPanel6.add(jTextField12);
				jTextField12.setEditable(false);
				jTextField12.setColumns(20);
				jTextField12.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField12.setBounds(227, 146, 217, 42);
				jTextField12.setSize(217, 24);
			}
		}
		return jPanel6;
	}
	
	private JPanel getJPanel7() {
		if(jPanel7 == null) {
			jPanel7 = new JPanel();
			jPanel7.setLayout(null);
			jPanel7.setBorder(BorderFactory.createTitledBorder(""));
			{
				jLabel13 = new JLabel();
				jPanel7.add(jLabel13);
				jLabel13.setText("Banco");
				jLabel13.setBounds(5, 5, 217, 74);
				jLabel13.setSize(217, 24);
			}
			{
				jTextField13 = new JTextField();
				jPanel7.add(jTextField13);
				jTextField13.setEditable(false);
				jTextField13.setColumns(20);
				jTextField13.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField13.setBounds(227, 5, 217, 74);
				jTextField13.setSize(217, 24);
			}
			{
				jLabel14 = new JLabel();
				jPanel7.add(jLabel14);
				jLabel14.setText("Agência");
				jLabel14.setBounds(5, 84, 217, 74);
				jLabel14.setSize(217, 24);
			}
			{
				jTextField14 = new JTextField();
				jPanel7.add(jTextField14);
				jTextField14.setEditable(false);
				jTextField14.setColumns(20);
				jTextField14.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField14.setBounds(227, 84, 217, 74);
				jTextField14.setSize(217, 24);
			}
			{
				jLabel15 = new JLabel();
				jPanel7.add(jLabel15);
				jLabel15.setText("Conta Corrente");
				jLabel15.setBounds(5, 163, 217, 74);
				jLabel15.setSize(217, 24);
			}
			{
				jTextField15 = new JTextField();
				jPanel7.add(jTextField15);
				jTextField15.setEditable(false);
				jTextField15.setColumns(20);
				jTextField15.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField15.setBounds(227, 163, 217, 74);
				jTextField15.setSize(217, 24);
			}
		}
		return jPanel7;
	}

}//Fim da classe
