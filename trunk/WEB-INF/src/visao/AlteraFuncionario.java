package visao;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
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
public class AlteraFuncionario extends JApplet {
	private JPanel jPanel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel7;
	private JFormattedTextField jFormattedTextField1;
	private JLabel jLabel17;
	private JTextField jTextField16;
	private JLabel jLabel16;
	private JPanel jPanel4;
	private JTextField jTextField15;
	private JLabel jLabel15;
	private JTextField jTextField14;
	private JLabel jLabel14;
	private JLabel jLabel13;
	private JTextField jTextField12;
	private JLabel jLabel12;
	private JTextField jTextField11;
	private JLabel jLabel11;
	private JLabel jLabel10;
	private JLabel jLabel9;
	private JTextField jTextField8;
	private JLabel jLabel8;
	private JTextField jTextField7;
	private JLabel jLabel6;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JComboBox jComboBox4;
	private JLabel jLabel21;
	private JTextField jTextField10;
	private JTextField jTextField9;
	private JLabel jLabel20;
	private JLabel jLabel19;
	private JButton jButton2;
	private JButton jButton1;
	private JPanel jPanel8;
	private JFormattedTextField jFormattedTextField4;
	private JLabel jLabel18;
	private JFormattedTextField jFormattedTextField3;
	private JFormattedTextField jFormattedTextField2;
	private JComboBox jComboBox3;
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
	private String uF[]={"","AC-Acre","AL-Alagoas","AP-Amapá","AM-Amazonas","BA-Bahia",
            "CE-Ceará","ES-Espírito Santo","GO-Goiás","MA-Maranhão",
            "MT-Mato Grosso","MS-Mato Grosso do Sul","MG-Minas Gerais",
            "PA-Pará","PB-Paraíba","PR-Paraná","PE-Pernambuco","PI-Piauí",
            "RJ-Rio de Janeiro","RN-Rio Grande do Norte",
            "RG-Rio Grande do Sul","RO-Rondônia","RR-Roraima",
            "SC-Santa Catarina","SP-São Paulo","SE-Sergipe","TO-Tocantins"};
	private String bancos[]={"",
            "BANCO ABN AMRO REAL S.A - 356",
            "BANCO BANERJ S.A - 029",
            "BANCO BANESTADO S.A - 038",
            "BANCO BEG S.A - 031",
            "BANCO BMC S.A - 394",
            "BANCO BMG S.A - 318",
            "BANCO BRADESCO S.A - 237",
            "BANCO CACIQUE S.A - 263",
            "BANCO CITIBANK S.A - 745",
            "BANCO COMERCIAL E DE INVESTIMENTO SUDAMERIS S.A - 215",
            "BANCO COOPERATIVO DO BRASIL S.A - 756",
            "BANCO COOPERATIVO SICREDI S.A - 748",
            "BANCO CRUZEIRO DO SUL S.A - 229",
            "BANCO DA AMAZÔNIA S.A - 003",
            "BANCO DE PERNAMBUCO S.A - 024",
            "BANCO DO BRASIL S.A - 001",
            "BANCO DO ESTADO DE SANTA CATARINA S.A - 027",
            "BANCO DO ESTADO DE SÃO PAULO S.A - 033",
            "BANCO DO ESTADO DE SERGIPE S.A - 047",
            "BANCO DO ESTADO DO PARÁ S.A - 037",
            "BANCO DO ESTADO DO PIAUÍ S.A - 039",
            "BANCO DO ESTADO DO RIO GRANDE DO SUL S.A - 041",
            "BANCO DO NORDESTE DO BRASIL S.A - 004",
            "BANCO FINASA S.A - 175",
            "BANCO FININVEST S.A - 252",
            "BANCO IBI S.A - 063",
            "BANCO ITAÚ S.A - 341",
            "BANCO MERCANTIL DE SÃO PAULO S.A - 392",
            "BANCO MERCANTIL DO BRASIL S.A - 389",
            "BANCO NOSSA CAIXA S.A - 151",
            "BANCO PANAMERICANO S.A - 623",
            "BANCO RURAL S.A - 453",
            "BANCO SAFRA S.A",
            "BANCO SANTANDER BRASIL S.A - 353",
            "BANCO SANTANDER MERIDIONAL S.A - 008",
            "BANCO SANTANDER S.A - 351",
            "BANCO SUDAMERIS BRASIL S.A - 347",
            "BANCO DO ESTADO DO ESPÍRITO SANTO S.A - 021",
            "BANKBOSTON BANCO MÚLTIPLO S.A - 479",
            "BANCO DE BRASÍLIA S.A - 070",
            "CAIXA ECONÔMICA FEDERAL - 104",
            "HSBC BANK BRASIL S.A - 399",
            "PARANÁ BANCO S.A - 254",
            "UNIBANCO - UNIÃO DE BANCOS BRASILEIROS S.A - 499",
            "UNICARD BANCO MÚLTIPLO S.A - 230"};
	
	public static void main(String[] args) {
		
				JFrame frame = new JFrame("ALTERA FUNCIONÁRIO");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				AlteraFuncionario alteraFuncionario = new AlteraFuncionario();
				alteraFuncionario.init();
				alteraFuncionario.start();				
				frame.getContentPane().add(alteraFuncionario);
				frame.setPreferredSize(alteraFuncionario.getSize());
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
	jPanel8 = new JPanel();
					GridLayout jPanel8Layout = new GridLayout(1, 2);
					jPanel8Layout.setColumns(2);
					jPanel8Layout.setHgap(5);
					jPanel8Layout.setVgap(5);
					jPanel8.setLayout(jPanel8Layout);
					getContentPane().add(jPanel8);
			jPanel8.setBounds(151, 410, 203, 37);
			jPanel8.setBorder(BorderFactory.createTitledBorder(""));
			{
				jButton1 = new JButton();
				jPanel8.add(jButton1);
				jButton1.setText("Alterar");
				jButton1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/TipoVeiculo.GIF")));
				jButton1.setToolTipText("Clique para alterar os dados do funcionário.");
				jButton1.setSize(116, 28);
			}
			{
				jButton2 = new JButton();
				jPanel8.add(jButton2);
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
						jComboBox1.setSize(212, 24);

					}
					{
						jComboBox2 = new JComboBox();
						jPanel3.add(jComboBox2);
						jComboBox2.setMaximumRowCount(4);
						jComboBox2.setEnabled(false);
						jComboBox2.setToolTipText("Selecione o nome do funcionário");
						jComboBox2.setSize(212, 24);

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
			{
				jPanel4 = new JPanel();
				jTabbedPane1.addTab("Funcionário", null, jPanel4, null);
				jPanel4.setLayout(null);
				jPanel4.setBorder(BorderFactory.createTitledBorder(""));
				{
					jLabel16 = new JLabel();
					jPanel4.add(jLabel16);
					jLabel16.setText("Nome Funcionário");
					jLabel16.setBounds(5, 5, 217, 24);
				}
				{
					jTextField16 = new JTextField();
					jPanel4.add(jTextField16);
					jTextField16.setBounds(227, 5, 217, 114);
					jTextField16.setSize(217, 24);
					jTextField16.setToolTipText("Informe o nome do funcionário");
					jTextField16.setEditable(false);
					jTextField16.setColumns(100);
				}
				{
					jLabel17 = new JLabel();
					jPanel4.add(jLabel17);
					jLabel17.setText("C.P.F.");
					jLabel17.setBounds(5, 81, 217, 24);
				}
				{
					jFormattedTextField1 = new JFormattedTextField();
					jPanel4.add(jFormattedTextField1);
					jFormattedTextField1.setBounds(227, 42, 218, 26);
					jFormattedTextField1.setToolTipText("Informe o CPF do funcionário.");
					jFormattedTextField1.setEditable(false);
					jFormattedTextField1.setHorizontalAlignment(SwingConstants.CENTER);
					jFormattedTextField1.setColumns(14);
					jFormattedTextField1.setSize(218, 24);
				}
				{
					jLabel19 = new JLabel();
					jPanel4.add(jLabel19);
					jLabel19.setText("Identidade");
					jLabel19.setBounds(5, 41, 215, 24);
				}
				{
					jTextField6 = new JTextField();
					jPanel4.add(jTextField6);
					jTextField6.setToolTipText("Informe o número da identidade do funcionário.");
					jTextField6.setEditable(false);
					jTextField6.setHorizontalAlignment(SwingConstants.CENTER);
					jTextField6.setBounds(227, 82, 218, 26);
					jTextField6.setSize(218, 24);
				}
				{
					jLabel20 = new JLabel();
					jPanel4.add(jLabel20);
					jLabel20.setText("Nº C.T.P.S.");
					jLabel20.setBounds(5, 117, 213, 24);
				}
				{
					jTextField9 = new JTextField();
					jPanel4.add(jTextField9);
					jTextField9.setToolTipText("Informe o número da carteira de trabalho do funcionário.");
					jTextField9.setEditable(false);
					jTextField9.setHorizontalAlignment(SwingConstants.CENTER);
					jTextField9.setBounds(227, 118, 218, 23);
				}
				{
					jLabel21 = new JLabel();
					jPanel4.add(jLabel21);
					jLabel21.setText("N° Plano de Saúde");
					jLabel21.setBounds(5, 159, 221, 24);
				}
				{
					jTextField10 = new JTextField();
					jPanel4.add(jTextField10);
					jTextField10.setBounds(226, 160, 221, 26);
					jTextField10.setToolTipText("Informe o número de identificação do plano de saúde.");
					jTextField10.setEditable(false);
					jTextField10.setHorizontalAlignment(SwingConstants.CENTER);
					jTextField10.setSize(221, 24);
				}
			}
			jTabbedPane1.addTab("Endereço", null, getJPanel5(), null);
			jTabbedPane1.addTab("Contatos", null, getJPanel6(), null);
			jTabbedPane1.addTab("Dados Bancários", null, getJPanel7(), null);
		}
		return jTabbedPane1;
	}

	private JPanel getJPanel5() {
		if(jPanel5 == null) {
			jPanel5 = new JPanel();
			jPanel5.setLayout(null);
			jPanel5.setBorder(BorderFactory.createTitledBorder(""));
			{
				jLabel1 = new JLabel();
				jPanel5.add(jLabel1);
				jLabel1.setText("Logradouro");
				jLabel1.setBounds(5, 5, 217, 24);
			}
			{
				jTextField1 = new JTextField();
				jPanel5.add(jTextField1);
				jTextField1.setEditable(false);
				jTextField1.setColumns(100);
				jTextField1.setSize(217, 24);
				jTextField1.setToolTipText("Informe o logradouro(Avenida, Rua, Praça, etc) do endereço.");
				jTextField1.setBounds(227, 5, 217, 24);
			}
			{
				jLabel2 = new JLabel();
				jPanel5.add(jLabel2);
				jLabel2.setText("Número");
				jLabel2.setBounds(5, 34, 217, 24);
			}
			{
				jTextField2 = new JTextField();
				jPanel5.add(jTextField2);
				jTextField2.setEditable(false);
				jTextField2.setColumns(5);
				jTextField2.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField2.setToolTipText("Informe o número do imóvel.Se não tiver, informe zeros.");
				jTextField2.setText("00000");
				jTextField2.setBounds(227, 34, 217, 24);
			}
			{
				jLabel8 = new JLabel();
				jPanel5.add(jLabel8);
				jLabel8.setText("C.E.P.");
				jLabel8.setBounds(5, 63, 217, 24);
			}
			{
				jTextField8 = new JTextField();
				jPanel5.add(jTextField8);
				jTextField8.setEditable(false);
				jTextField8.setColumns(15);
				jTextField8.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField8.setToolTipText("Informe o CEP do logradouro.");
				jTextField8.setBounds(227, 63, 217, 24);
			}
			{
				jLabel3 = new JLabel();
				jPanel5.add(jLabel3);
				jLabel3.setText("Complemento");
				jLabel3.setBounds(5, 92, 217, 24);
			}
			
			{
				jTextField3 = new JTextField();
				jPanel5.add(jTextField3);
				jTextField3.setEditable(false);
				jTextField3.setColumns(50);
				jTextField3.setToolTipText("Informe todos os dados complementares referentes ao logradouro(Quadra, Lote, etc).");
				jTextField3.setBounds(227, 92, 217, 24);
			}
			{
				jLabel4 = new JLabel();
				jPanel5.add(jLabel4);
				jLabel4.setText("Bairro");
				jLabel4.setBounds(5, 121, 217, 24);
			}
			{
				jTextField4 = new JTextField();
				jPanel5.add(jTextField4);
				jTextField4.setEditable(false);
				jTextField4.setColumns(50);
				jTextField4.setToolTipText("Informe o Bairro que está localizado o fornecedor.");
				jTextField4.setBounds(227, 121, 217, 24);
			}
			{
				jLabel5 = new JLabel();
				jPanel5.add(jLabel5);
				jLabel5.setText("Cidade");
				jLabel5.setBounds(5, 150, 217, 24);
			}
			{
				jTextField5 = new JTextField();
				jPanel5.add(jTextField5);
				jTextField5.setEditable(false);
				jTextField5.setColumns(50);
				jTextField5.setBounds(227, 150, 217, 24);
			}
			{
				jLabel6 = new JLabel();
				jPanel5.add(jLabel6);
				jLabel6.setText("Unidade Federativa");
				jLabel6.setBounds(5, 179, 217, 24);
			}
			{
				ComboBoxModel jComboBox3Model = 
					new DefaultComboBoxModel(uF);
				jComboBox3 = new JComboBox();
				jPanel5.add(jComboBox3);
				jComboBox3.setModel(jComboBox3Model);
				jComboBox3.setToolTipText("Selecione a Unidade Federativa do Fornecedor.");
				jComboBox3.setEnabled(false);
				jComboBox3.setMaximumRowCount(4);
				jComboBox3.setBounds(227, 179, 217, 24);
			}
			{
				jLabel7 = new JLabel();
				jPanel5.add(jLabel7);
				jLabel7.setText("País");
				jLabel7.setBounds(5, 208, 217, 24);
			}
			{
				jTextField7 = new JTextField();
				jPanel5.add(jTextField7);
				jTextField7.setEditable(false);
				jTextField7.setColumns(50);
				jTextField7.setToolTipText("Informe o País que está sediado o Fornecedor.");
				jTextField7.setBounds(227, 208, 217, 24);
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
				jLabel9.setBounds(5, 5, 217, 42);
				jLabel9.setSize(217, 24);
			}
			{
				jFormattedTextField2 = new JFormattedTextField();
				jPanel6.add(jFormattedTextField2);
				jFormattedTextField2.setEditable(false);
				jFormattedTextField2.setColumns(20);
				jFormattedTextField2.setHorizontalAlignment(SwingConstants.CENTER);
				jFormattedTextField2.setToolTipText("Informe o número do telefone fixo do fornecedor.");
				jFormattedTextField2.setBounds(227, 5, 217, 42);
				jFormattedTextField2.setSize(217, 24);
			}
			{
				jLabel10 = new JLabel();
				jPanel6.add(jLabel10);
				jLabel10.setText("Telefone Celular");
				jLabel10.setBounds(5, 41, 216, 27);
				jLabel10.setSize(216, 24);
			}
			{
				jFormattedTextField3 = new JFormattedTextField();
				jPanel6.add(jFormattedTextField3);
				jFormattedTextField3.setEditable(false);
				jFormattedTextField3.setColumns(20);
				jFormattedTextField3.setHorizontalAlignment(SwingConstants.CENTER);
				jFormattedTextField3.setToolTipText("Informe o número telefone celular do fornecedor.");
				jFormattedTextField3.setBounds(227, 44, 217, 28);
				jFormattedTextField3.setSize(217, 24);
			}
			{
				jLabel18 = new JLabel();
				jPanel6.add(jLabel18);
				jLabel18.setText("Telefone Nextel");
				jLabel18.setBounds(5, 80, 217, 27);
				jLabel18.setSize(217, 24);
			}
			{
				jFormattedTextField4 = new JFormattedTextField();
				jPanel6.add(jFormattedTextField4);
				jFormattedTextField4.setEditable(false);
				jFormattedTextField4.setHorizontalAlignment(SwingConstants.CENTER);
				jFormattedTextField4.setColumns(20);
				jFormattedTextField4.setToolTipText("Informe o número do telefone móvel da operadora Nextel.");
				jFormattedTextField4.setBounds(227, 84, 218, 28);
				jFormattedTextField4.setSize(218, 24);
			}
			{
				jLabel11 = new JLabel();
				jPanel6.add(jLabel11);
				jLabel11.setText("Email");
				jLabel11.setBounds(5, 122, 216, 26);
				jLabel11.setSize(216, 24);
			}
			{
				jTextField11 = new JTextField();
				jPanel6.add(jTextField11);
				jTextField11.setEditable(false);
				jTextField11.setColumns(20);
				jTextField11.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField11.setBounds(227, 124, 217, 27);
				jTextField11.setToolTipText("Informe um email válido.");
				jTextField11.setSize(217, 24);
			}
			{
				jLabel12 = new JLabel();
				jPanel6.add(jLabel12);
				jLabel12.setText("Messenger");
				jLabel12.setBounds(5, 160, 217, 26);
				jLabel12.setSize(217, 24);
			}
			{
				jTextField12 = new JTextField();
				jPanel6.add(jTextField12);
				jTextField12.setEditable(false);
				jTextField12.setColumns(20);
				jTextField12.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField12.setBounds(227, 163, 218, 28);
				jTextField12.setToolTipText("Informe a designação de usuário do Messenger preferido do Fornecedor.");
				jTextField12.setSize(218, 24);
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
				jLabel13.setBounds(5, 5, 217, 30);
				jLabel13.setSize(217, 24);
			}
			{
				ComboBoxModel jComboBox4Model = 
					new DefaultComboBoxModel(bancos);							
				jComboBox4 = new JComboBox();
				jPanel7.add(jComboBox4);
				jComboBox4.setModel(jComboBox4Model);
				jComboBox4.setBounds(227, 5, 217, 74);
				jComboBox4.setSize(217, 24);
				jComboBox4.setToolTipText("Selecione um banco da lista.");
				jComboBox4.setMaximumRowCount(4);
				jComboBox4.setEnabled(false);
			}
			{
				jLabel14 = new JLabel();
				jPanel7.add(jLabel14);
				jLabel14.setText("Agência");
				jLabel14.setBounds(5, 41, 217, 23);
			}
			{
				jTextField14 = new JTextField();
				jPanel7.add(jTextField14);
				jTextField14.setEditable(false);
				jTextField14.setColumns(20);
				jTextField14.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField14.setBounds(227, 41, 217, 26);
				jTextField14.setToolTipText("Informe o número da Agência que o Fornecedor mantém conta corrente.");
				jTextField14.setSize(217, 24);
			}
			{
				jLabel15 = new JLabel();
				jPanel7.add(jLabel15);
				jLabel15.setText("Conta Corrente");
				jLabel15.setBounds(5, 83, 219, 24);
			}
			{
				jTextField15 = new JTextField();
				jPanel7.add(jTextField15);
				jTextField15.setEditable(false);
				jTextField15.setColumns(20);
				jTextField15.setHorizontalAlignment(SwingConstants.CENTER);
				jTextField15.setBounds(227, 81, 217, 26);
				jTextField15.setToolTipText("Informe o número da conta corrente do Fornecedor.");
				jTextField15.setSize(217, 24);
			}
		}
		return jPanel7;
	}

}//Fim da classe
