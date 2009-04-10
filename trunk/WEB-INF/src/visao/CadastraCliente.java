package visao;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
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
	private JLabel jLabel5;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JButton jButton2;
	private JButton jButton1;
	private JPanel jPanel6;
	private JFormattedTextField jFormattedTextField7;
	private JFormattedTextField jFormattedTextField6;
	private JTextField jTextField14;
	private JLabel jLabel23;
	private JLabel jLabel21;
	private JLabel jLabel22;
	private JTextField jTextField13;
	private JTextField jTextField12;
	private JTextField jTextField11;
	private JLabel jLabel20;
	private JLabel jLabel19;
	private JLabel jLabel18;
	private JTextField jTextField10;
	private JTextField jTextField9;
	private JLabel jLabel17;
	private JLabel jLabel16;
	private JFormattedTextField jFormattedTextField5;
	private JFormattedTextField jFormattedTextField4;
	private JFormattedTextField jFormattedTextField3;
	private JLabel jLabel15;
	private JLabel jLabel14;
	private JLabel jLabel13;
	private JTextField jTextField8;
	private JComboBox jComboBox2;
	private JTextField jTextField7;
	private JFormattedTextField jFormattedTextField2;
	private JLabel jLabel12;
	private JTextField jTextField4;
	private JTextField jTextField2;
	private JLabel jLabel11;
	private JLabel jLabel10;
	private JLabel jLabel9;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JLabel jLabel6;
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
			this.setSize(500,320);
			getContentPane().setLayout(null);
			{
				jTabbedPane1 = new JTabbedPane();
				getContentPane().add(jTabbedPane1);
				jTabbedPane1.setBounds(12, 12, 476, 222);
				jTabbedPane1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				{
					jPanel1 = new JPanel();
					jTabbedPane1.addTab("Cliente", null, jPanel1, null);
					jPanel1.setLayout(null);
					jPanel1.setBorder(BorderFactory.createTitledBorder(""));
					jPanel1.setPreferredSize(new java.awt.Dimension(465, 178));
					jPanel1.setToolTipText("Informe os dados do cliente");
					{
						jLabel1 = new JLabel();
						jPanel1.add(jLabel1);
						jLabel1.setText("Razão Social");
						jLabel1.setBounds(17, 17, 89, 22);
						jLabel1.setSize(89, 25);
					}
					{
						jLabel3 = new JLabel();
						jPanel1.add(jLabel3);
						jLabel3.setText("Representante Legal");
						jLabel3.setBounds(18, 89, 118, 25);
					}
					{
						jLabel2 = new JLabel();
						jPanel1.add(jLabel2);
						jLabel2.setText("Cpf/Cnpj");
						jLabel2.setBounds(17, 51, 64, 26);
						jLabel2.setSize(63, 25);
					}
					{
						jLabel4 = new JLabel();
						jPanel1.add(jLabel4);
						jLabel4.setText("Despacho Disponível");
						jLabel4.setBounds(17, 133, 118, 26);
					}
					{
						jTextField1 = new JTextField();
						jPanel1.add(jTextField1);
						jTextField1.setToolTipText("Informe a denominação jurídica da empresa.");
						jTextField1.setBounds(148, 17, 297, 23);
						jTextField1.setColumns(100);
					}
					{
						jFormattedTextField1 = new JFormattedTextField();
						jPanel1.add(jFormattedTextField1);
						jFormattedTextField1.setBounds(148, 54, 297, 23);
						jFormattedTextField1.setToolTipText("Informe os números do CPF ou CNPJ. ");
						jFormattedTextField1.setHorizontalAlignment(SwingConstants.CENTER);
						jFormattedTextField1.setColumns(14);
					}
					{
						jTextField3 = new JTextField();
						jPanel1.add(jTextField3);
						jTextField3.setToolTipText("Informe o nome do representante legal da empresa.");
						jTextField3.setBounds(148, 89, 297, 23);
						jTextField3.setColumns(100);
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
						jComboBox1.setBounds(147, 135, 96, 23);
					}
				}
				{
					jPanel2 = new JPanel();
					jTabbedPane1.addTab("Endereço", null, jPanel2, null);
					jPanel2.setLayout(null);
					jPanel2.setBorder(BorderFactory.createTitledBorder(""));
					jPanel2.setToolTipText("Informe os dados do endereço.");
					{
						jLabel5 = new JLabel();
						jPanel2.add(jLabel5);
						jLabel5.setText("Logradouro");
						jLabel5.setBounds(17, 17, 82, 25);
					}
					{
						jLabel6 = new JLabel();
						jPanel2.add(jLabel6);
						jLabel6.setText("Número");
						jLabel6.setBounds(17, 48, 54, 16);
						jLabel6.setSize(63, 25);
					}
					{
						jLabel7 = new JLabel();
						jPanel2.add(jLabel7);
						jLabel7.setText("Complemento");
						jLabel7.setBounds(17, 79, 82, 22);
						jLabel7.setSize(82, 25);
					}
					{
						jLabel8 = new JLabel();
						jPanel2.add(jLabel8);
						jLabel8.setText("Bairro");
						jLabel8.setBounds(17, 110, 59, 27);
						jLabel8.setSize(63, 25);
					}
					{
						jLabel9 = new JLabel();
						jPanel2.add(jLabel9);
						jLabel9.setText("Cidade");
						jLabel9.setBounds(253, 114, 63, 25);
						jLabel9.setHorizontalAlignment(SwingConstants.RIGHT);
					}
					{
						jLabel10 = new JLabel();
						jPanel2.add(jLabel10);
						jLabel10.setText("Estado");
						jLabel10.setBounds(17, 147, 63, 25);
					}
					{
						jLabel11 = new JLabel();
						jPanel2.add(jLabel11);
						jLabel11.setText("País");
						jLabel11.setBounds(253, 147, 52, 25);
						jLabel11.setHorizontalAlignment(SwingConstants.RIGHT);
					}
					{
						jLabel12 = new JLabel();
						jPanel2.add(jLabel12);
						jLabel12.setText("C.E.P.");
						jLabel12.setBounds(253, 48, 63, 26);
						jLabel12.setHorizontalAlignment(SwingConstants.RIGHT);
					}
					{
						ComboBoxModel jComboBox2Model = new DefaultComboBoxModel(
								new String[] {"","AC-Acre","AL-Alagoas","AP-Amapá","AM-Amazonas","BA-Bahia",
										"CE-Ceará","ES-Espírito Santo","GO-Goiás","MA-Maranhão",
										"MT-Mato Grosso","MS-Mato Grosso do Sul","MG-Minas Gerais",
										"PA-Pará","PB-Paraíba","PR-Paraná","PE-Pernambuco","PI-Piauí",
										"RJ-Rio de Janeiro","RN-Rio Grande do Norte",
										"RG-Rio Grande do Sul","RO-Rondônia","RR-Roraima",
										"SC-Santa Catarina","SP-São Paulo","SE-Sergipe","TO-Tocantins"});
						jComboBox2 = new JComboBox();
						jPanel2.add(jComboBox2);
						jComboBox2.setModel(jComboBox2Model);
						jComboBox2.setBounds(111, 150, 124, 26);
						jComboBox2.setSize(124, 23);
						jComboBox2.setMaximumRowCount(4);
						jComboBox2.setToolTipText("Selecione o Estado que pertence a Cidade.");
					}
					{
						jTextField2 = new JTextField();
						jPanel2.add(jTextField2);
						jTextField2.setBounds(111, 80, 337, 23);
						jTextField2.setToolTipText("Informe Quadra, Lote, Casa, etc");
						jTextField2.setColumns(50);
					}
					{
						jTextField4 = new JTextField();
						jPanel2.add(jTextField4);
						jTextField4.setBounds(111, 18, 337, 22);
						jTextField4.setColumns(100);
						jTextField4.setToolTipText("Informe a Rua, Avenida, Praça, Estrada, etc.");
					}
					{
						jTextField5 = new JTextField();
						jPanel2.add(jTextField5);
						jTextField5.setBounds(111, 49, 124, 23);
						jTextField5.setToolTipText("Informe o número do endereço.");
						jTextField5.setColumns(5);
						jTextField5.setHorizontalAlignment(SwingConstants.CENTER);
					}
					{
						jFormattedTextField2 = new JFormattedTextField();
						jPanel2.add(jFormattedTextField2);
						jFormattedTextField2.setBounds(323, 49, 125, 23);
						jFormattedTextField2.setColumns(15);
						jFormattedTextField2.setToolTipText("Informe o CEP do logradouro ou da cidade.");
						jFormattedTextField2.setHorizontalAlignment(SwingConstants.CENTER);
					}
					{
						jTextField6 = new JTextField();
						jPanel2.add(jTextField6);
						jTextField6.setBounds(111, 115, 125, 20);
						jTextField6.setToolTipText("Informe o Bairro do logradouro.");
						jTextField6.setHorizontalAlignment(SwingConstants.CENTER);
						jTextField6.setSize(125, 23);
						jTextField6.setColumns(50);
					}
					{
						jTextField7 = new JTextField();
						jPanel2.add(jTextField7);
						jTextField7.setBounds(323, 115, 125, 24);
						jTextField7.setToolTipText("Iforme a denominação completa da cidade.");
						jTextField7.setSize(125, 23);
						jTextField7.setHorizontalAlignment(SwingConstants.CENTER);
						jTextField7.setColumns(50);
					}
					{
						jTextField8 = new JTextField();
						jPanel2.add(jTextField8);
						jTextField8.setBounds(323, 153, 125, 22);
						jTextField8.setSize(125, 23);
						jTextField8.setHorizontalAlignment(SwingConstants.CENTER);
						jTextField8.setToolTipText("Informe o País de origem.");
						jTextField8.setColumns(50);
					}
				}
				{
					jPanel3 = new JPanel();
					jTabbedPane1.addTab("Contatos", null, jPanel3, null);
					jPanel3.setLayout(null);
					jPanel3.setBorder(BorderFactory.createTitledBorder(""));
					{
						jLabel13 = new JLabel();
						jPanel3.add(jLabel13);
						jLabel13.setText("Telefone Fixo");
						jLabel13.setBounds(17, 17, 94, 25);
					}
					{
						jLabel14 = new JLabel();
						jPanel3.add(jLabel14);
						jLabel14.setText("Telefone Celular");
						jLabel14.setBounds(17, 54, 95, 23);
					}
					{
						jLabel15 = new JLabel();
						jPanel3.add(jLabel15);
						jLabel15.setText("Telefone Nextel");
						jLabel15.setBounds(17, 89, 95, 23);
					}
					{
						jLabel16 = new JLabel();
						jPanel3.add(jLabel16);
						jLabel16.setText("Email");
						jLabel16.setBounds(247, 16, 57, 23);
						jLabel16.setHorizontalAlignment(SwingConstants.RIGHT);
					}
					{
						jLabel17 = new JLabel();
						jPanel3.add(jLabel17);
						jLabel17.setText("Chat ");
						jLabel17.setBounds(248, 53, 56, 26);
						jLabel17.setHorizontalAlignment(SwingConstants.RIGHT);
					}
					{
						jFormattedTextField3 = new JFormattedTextField();
						jPanel3.add(jFormattedTextField3);
						jFormattedTextField3.setBounds(129, 17, 106, 23);
						jFormattedTextField3.setToolTipText("Informe somente o número incluindo o código de área.");
						jFormattedTextField3.setHorizontalAlignment(SwingConstants.CENTER);
						jFormattedTextField3.setColumns(20);
						jFormattedTextField3.setSize(135, 23);
					}
					{
						jFormattedTextField4 = new JFormattedTextField();
						jPanel3.add(jFormattedTextField4);
						jFormattedTextField4.setBounds(130, 54, 106, 26);
						jFormattedTextField4.setToolTipText("Informe somente o número incluindo o código de área.");
						jFormattedTextField4.setSize(135, 23);
						jFormattedTextField4.setHorizontalAlignment(SwingConstants.CENTER);
						jFormattedTextField4.setColumns(20);
					}
					{
						jFormattedTextField5 = new JFormattedTextField();
						jPanel3.add(jFormattedTextField5);
						jFormattedTextField5.setBounds(130, 91, 105, 23);
						jFormattedTextField5.setToolTipText("Informe somente o número incluindo o código de área.");
						jFormattedTextField5.setHorizontalAlignment(SwingConstants.CENTER);
						jFormattedTextField5.setColumns(20);
						jFormattedTextField5.setSize(135, 23);
					}
					{
						jTextField9 = new JTextField();
						jPanel3.add(jTextField9);
						jTextField9.setBounds(313, 16, 135, 23);
						jTextField9.setToolTipText("Informe o email principal.");
						jTextField9.setHorizontalAlignment(SwingConstants.CENTER);
						jTextField9.setColumns(20);
					}
					{
						jTextField10 = new JTextField();
						jPanel3.add(jTextField10);
						jTextField10.setBounds(313, 55, 135, 24);
						jTextField10.setToolTipText("Informe o email do chat preferido.(MSN, Gtalk, Yahoo, etc)");
						jTextField10.setHorizontalAlignment(SwingConstants.CENTER);
						jTextField10.setColumns(20);
						jTextField10.setSize(135, 23);
					}
				}
				{
					jPanel4 = new JPanel();
					jTabbedPane1.addTab("Dados Bancários", null, jPanel4, null);
					jPanel4.setLayout(null);
					jPanel4.setBorder(BorderFactory.createTitledBorder(""));
					{
						jLabel18 = new JLabel();
						jPanel4.add(jLabel18);
						jLabel18.setText("Banco");
						jLabel18.setBounds(17, 17, 70, 26);
						jLabel18.setSize(65, 26);
					}
					{
						jLabel19 = new JLabel();
						jPanel4.add(jLabel19);
						jLabel19.setText("Agência");
						jLabel19.setBounds(17, 55, 68, 25);
					}
					{
						jLabel20 = new JLabel();
						jPanel4.add(jLabel20);
						jLabel20.setText("Conta Corrente");
						jLabel20.setBounds(17, 92, 88, 27);
					}
					{
						jTextField11 = new JTextField();
						jPanel4.add(jTextField11);
						jTextField11.setBounds(115, 19, 143, 20);
						jTextField11.setColumns(20);
						jTextField11.setHorizontalAlignment(SwingConstants.CENTER);
						jTextField11.setSize(150, 23);
					}
					{
						jTextField12 = new JTextField();
						jPanel4.add(jTextField12);
						jTextField12.setBounds(115, 56, 143, 23);
						jTextField12.setColumns(20);
						jTextField12.setHorizontalAlignment(SwingConstants.CENTER);
						jTextField12.setToolTipText("Informe o número da agência.");
						jTextField12.setSize(150, 23);
					}
					{
						jTextField13 = new JTextField();
						jPanel4.add(jTextField13);
						jTextField13.setBounds(117, 94, 143, 23);
						jTextField13.setColumns(20);
						jTextField13.setHorizontalAlignment(SwingConstants.CENTER);
						jTextField13.setToolTipText("Informe o número da conta corrente.");
						jTextField13.setSize(150, 23);
					}
				}
				{
					jPanel5 = new JPanel();
					jPanel5.setLayout(null);
					jTabbedPane1.addTab("Acesso Remoto", null, jPanel5, null);
					jPanel5.setBorder(BorderFactory.createTitledBorder(""));
					{
						jLabel21 = new JLabel();
						jPanel5.add(jLabel21);
						jLabel21.setText("Tipo Acesso");
						jLabel21.setBounds(17, 17, 73, 29);
					}
					{
						jLabel22 = new JLabel();
						jPanel5.add(jLabel22);
						jLabel22.setText("IP Acesso");
						jLabel22.setBounds(17, 58, 68, 26);
					}
					{
						jLabel23 = new JLabel();
						jPanel5.add(jLabel23);
						jLabel23.setText("IP Equipamento");
						jLabel23.setBounds(17, 96, 97, 27);
					}
					{
						jTextField14 = new JTextField();
						jPanel5.add(jTextField14);
						jTextField14.setBounds(115, 20, 154, 23);
						jTextField14.setToolTipText("Informe o tipo de acesso remoto.");
						jTextField14.setHorizontalAlignment(SwingConstants.CENTER);
						jTextField14.setColumns(50);
						jTextField14.setSize(150, 23);
					}
					{
						jFormattedTextField6 = new JFormattedTextField();
						jPanel5.add(jFormattedTextField6);
						jFormattedTextField6.setBounds(114, 59, 151, 23);
						jFormattedTextField6.setToolTipText("Informe o IP de acesso ao sistema.");
						jFormattedTextField6.setHorizontalAlignment(SwingConstants.CENTER);
						jFormattedTextField6.setColumns(50);
						jFormattedTextField6.setSize(150, 23);
					}
					{
						jFormattedTextField7 = new JFormattedTextField();
						jPanel5.add(jFormattedTextField7);
						jFormattedTextField7.setBounds(114, 98, 154, 23);
						jFormattedTextField7.setHorizontalAlignment(SwingConstants.CENTER);
						jFormattedTextField7.setColumns(50);
						jFormattedTextField7.setToolTipText("Informe o número do IP do equipamento.");
						jFormattedTextField7.setSize(150, 23);
					}
				}
			}
			{
				jPanel6 = new JPanel();
				GridLayout jPanel6Layout = new GridLayout(1, 2);
				jPanel6Layout.setHgap(5);
				jPanel6Layout.setVgap(5);
				jPanel6Layout.setColumns(2);
				getContentPane().add(jPanel6);
				jPanel6.setLayout(jPanel6Layout);
				jPanel6.setBounds(119, 259, 251, 42);
				jPanel6.setBorder(BorderFactory.createTitledBorder(""));
				{
					jButton1 = new JButton();
					jPanel6.add(jButton1);
					jButton1.setText("Incluir");
					jButton1.setToolTipText("Clique para gravar os dados.");
					jButton1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/07_Incluir.GIF")));
					jButton1.setSize(118, 26);
				}
				{
					jButton2 = new JButton();
					jPanel6.add(jButton2);
					jButton2.setText("Sair");
					jButton2.setToolTipText("Clique para fechar o formulário.");
					jButton2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/Sair.GIF")));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}//Fim da classe
