package visao;

import javax.swing.JApplet;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
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
public class AlteraCliente extends JApplet {

	private JTabbedPane jTabbedPane1;
    private JPanel jPanel1;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField1;
    private JButton jButton2;
    private JButton jButton1;
    private JPanel jPanel6;
    private JFormattedTextField jFormattedTextField7;
    private JFormattedTextField jFormattedTextField6;
    private JTextField jTextField14;
    private JLabel jLabel23;
    private JLabel jLabel21;
    private JComboBox jComboBox5;
    private JComboBox jComboBox4;
    private JComboBox jComboBox3;
    private JLabel jLabel2;
    private JTextField jTextField16;
    private JLabel jLabel1;
    private JComboBox jComboBox2;
    private JComboBox jComboBox1;
    private ButtonGroup buttonGroup1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton1;
    private JPanel jPanel7;
    private JTextField jTextField15;
    private JTextField jTextField11;
    private JLabel jLabel22;
    private JTextField jTextField13;
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
    private JTextField jTextField3;
    private JPanel jPanel5;
    private JPanel jPanel4;
    private JPanel jPanel3;
    private JPanel jPanel2;
    private String status[]={"","Sim","Não"};
    private String estados[]={"","AC-Acre","AL-Alagoas","AP-Amapá","AM-Amazonas","BA-Bahia",
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
            
                            JFrame frame = new JFrame("ALTERA DADOS DO CLIENTE");
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            AlteraCliente alteraCliente = new AlteraCliente();
                            alteraCliente.init();
                            alteraCliente.start();
                            frame.getContentPane().add(alteraCliente);
                            frame.setPreferredSize(alteraCliente.getSize());
                            frame.setVisible(true);
                    }
            
    public void init() {
            try {
                    this.setSize(500,500);
                    getContentPane().setLayout(null);
                    {
                            jTabbedPane1 = new JTabbedPane();
                            getContentPane().add(jTabbedPane1);
                            jTabbedPane1.setBounds(12, 110, 474, 329);
                            jTabbedPane1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
                            {
                            	jPanel1 = new JPanel();
                            	jTabbedPane1.addTab("Cliente", null, jPanel1, null);
                            	jPanel1.setLayout(null);
                            	jPanel1.setBorder(BorderFactory.createTitledBorder(""));
                            	jPanel1.setToolTipText("Informe os dados do cliente");
                            	jPanel1.setBounds(17, 136, 463, 297);
                            	{
                            		jLabel1 = new JLabel();
                            		jPanel1.add(jLabel1);
                            		jLabel1.setText("Razão Social");
                            		jLabel1.setBounds(5, 5, 217, 24);
                            	}
                            	{
                            		jTextField1 = new JTextField();
                            		jPanel1.add(jTextField1);
                            		jTextField1.setToolTipText("Despacho");
                            		jTextField1.setEditable(false);
                            		jTextField1.setHorizontalAlignment(SwingConstants.CENTER);
                            		jTextField1.setColumns(20);
                            		jTextField1.setBounds(234, 5, 224, 24);
                            	}
                            	{
                            		jLabel2 = new JLabel();
                            		jPanel1.add(jLabel2);
                            		jLabel2.setText("CNPJ/CPF");
                            		jLabel2.setBounds(5, 41, 217, 24);
                            	}
                            	{
                            		jTextField3 = new JTextField();
                            		jPanel1.add(jTextField3);
                            		jTextField3.setToolTipText("Nome do representante legal da empresa.");
                            		jTextField3.setBounds(234, 41, 224, 24);
                            		jTextField3.setColumns(100);
                            		
                            		jTextField3.setEditable(false);
                            		jTextField3.setHorizontalAlignment(SwingConstants.CENTER);
                            	}
                            	{
                            		jLabel3 = new JLabel();
                            		jPanel1.add(jLabel3);
                            		jLabel3.setText("Representante Legal");
                            		jLabel3.setBounds(5, 77, 217, 24);
                            	}
                            	{
                            		jTextField16 = new JTextField();
                            		jPanel1.add(jTextField16);
                            		jTextField16.setBounds(234, 77, 224, 24);
                            		jTextField16.setEditable(false);
                            	}
                            	{
                            		jLabel4 = new JLabel();
                            		jPanel1.add(jLabel4);
                            		jLabel4.setText("Despacho Disponível");
                            		jLabel4.setBounds(5, 114, 217, 24);
                            	}
                            	{
                            		ComboBoxModel jComboBox3Model = 
                            			new DefaultComboBoxModel(status);
                            		
                            		jComboBox3 = new JComboBox();
                            		jPanel1.add(jComboBox3);
                            		jComboBox3.setModel(jComboBox3Model);
                            		jComboBox3.setBounds(234, 113, 224, 24);
                            		jComboBox3.setToolTipText("Selecione um dos status.");
                            		jComboBox3.setMaximumRowCount(4);
                            		jComboBox3.setEnabled(false);
                            	}
                            	
                            }
                            {
                                    jPanel2 = new JPanel();
                                    jTabbedPane1.addTab("Endereço", null, jPanel2, null);
                                    jPanel2.setLayout(null);
                                    jPanel2.setBorder(BorderFactory.createTitledBorder(""));
                                    jPanel2.setToolTipText("Informe os dados do endereço.");
                                    jPanel2.setPreferredSize(new java.awt.Dimension(465, 302));
                                    {
                                            jLabel5 = new JLabel();
                                            jPanel2.add(jLabel5);
                                            jLabel5.setText("Logradouro");
                                            jLabel5.setBounds(5, 8, 214, 27);
                                            jLabel5.setSize(214, 24);
                                    }
                                    {
                                    	jTextField2 = new JTextField();
                                    	jPanel2.add(jTextField2);
                                    	jTextField2.setBounds(241, 6, 217, 24);
                                    	jTextField2.setToolTipText("Logradouro");
                                    	jTextField2.setColumns(50);
                                    	jTextField2.setEditable(false);
                                    	jTextField2.setSize(217, 24);
                                    }
                                    {
                                            jLabel6 = new JLabel();
                                            jPanel2.add(jLabel6);
                                            jLabel6.setText("Número");
                                            jLabel6.setBounds(5, 43, 214, 27);
                                            jLabel6.setSize(214, 24);
                                    }
                                    {
                                    	jTextField4 = new JTextField();
                                    	jPanel2.add(jTextField4);
                                    	jTextField4.setBounds(241, 42, 217, 24);
                                    	jTextField4.setColumns(5);
                                    	jTextField4.setToolTipText("Número.");
                                    	jTextField4.setEditable(false);
                                    }
                                    {
                                            jLabel7 = new JLabel();
                                            jPanel2.add(jLabel7);
                                            jLabel7.setText("Complemento");
                                            jLabel7.setBounds(5, 79, 214, 27);
                                            jLabel7.setSize(214, 24);
                                    }
                                    {
                                    	jTextField5 = new JTextField();
                                    	jPanel2.add(jTextField5);
                                    	jTextField5.setBounds(241, 78, 217, 24);
                                    	jTextField5.setToolTipText("Quadra, Lote, Casa, etc.");
                                    	jTextField5.setColumns(50);
                                    	jTextField5.setHorizontalAlignment(SwingConstants.CENTER);
                                    	jTextField5.setEditable(false);
                                    }
                                    {
                                            jLabel8 = new JLabel();
                                            jPanel2.add(jLabel8);
                                            jLabel8.setText("Bairro");
                                            jLabel8.setBounds(5, 116, 214, 27);
                                            jLabel8.setSize(214, 24);
                                    }
                                    {
                                    	jTextField6 = new JTextField();
                                    	jPanel2.add(jTextField6);
                                    	jTextField6.setBounds(241, 114, 217, 24);
                                    	jTextField6.setToolTipText("Bairro do logradouro.");
                                    	jTextField6.setHorizontalAlignment(SwingConstants.CENTER);
                                    	jTextField6.setColumns(50);
                                    	jTextField6.setEditable(false);
                                    }
                                    {
                                    	jLabel12 = new JLabel();
                                    	jPanel2.add(jLabel12);
                                    	jLabel12.setText("C.E.P.");
                                    	jLabel12.setBounds(5, 222, 214, 27);
                                    	jLabel12.setSize(214, 24);
                                    }
                                    {
                                    	jFormattedTextField2 = new JFormattedTextField();
                                    	jPanel2.add(jFormattedTextField2);
                                    	jFormattedTextField2.setBounds(243, 224, 217, 24);
                                    	jFormattedTextField2.setColumns(15);
                                    	jFormattedTextField2.setToolTipText("CEP do logradouro ou da cidade.");
                                    	jFormattedTextField2.setHorizontalAlignment(SwingConstants.CENTER);
                                    	jFormattedTextField2.setEditable(false);
                                    }
                                    {
                                            jLabel9 = new JLabel();
                                            jPanel2.add(jLabel9);
                                            jLabel9.setText("Cidade");
                                            jLabel9.setBounds(5, 152, 214, 27);
                                            jLabel9.setSize(214, 24);
                                    }
                                    {
                                    	jTextField7 = new JTextField();
                                    	jPanel2.add(jTextField7);
                                    	jTextField7.setBounds(241, 150, 217, 24);
                                    	jTextField7.setToolTipText("Iforme a denominação completa da cidade.");
                                    	jTextField7.setHorizontalAlignment(SwingConstants.CENTER);
                                    	jTextField7.setColumns(50);
                                    	jTextField7.setEditable(false);
                                    }
                                    {
                                            jLabel10 = new JLabel();
                                            jPanel2.add(jLabel10);
                                            jLabel10.setText("Estado");
                                            jLabel10.setBounds(5, 186, 214, 27);
                                            jLabel10.setSize(214, 24);
                                    }
                                    {
                                    	ComboBoxModel jComboBox4Model = 
                                    		new DefaultComboBoxModel(estados);
                                    	
                                    	jComboBox4 = new JComboBox();
                                    	jPanel2.add(jComboBox4);
                                    	jComboBox4.setModel(jComboBox4Model);
                                    	jComboBox4.setBounds(243, 188, 215, 24);
                                    	jComboBox4.setSize(217, 24);
                                    	jComboBox4.setToolTipText("Selecione a unidade federativa.");
                                    	jComboBox4.setMaximumRowCount(4);
                                    	jComboBox4.setEnabled(false);
                                    }
                                    {
                                            jLabel11 = new JLabel();
                                            jPanel2.add(jLabel11);
                                            jLabel11.setText("País");
                                            jLabel11.setBounds(5, 263, 214, 27);
                                            jLabel11.setSize(214, 24);
                                    }
                                    {
                                    	jTextField11 = new JTextField();
                                    	jPanel2.add(jTextField11);
                                    	jTextField11.setToolTipText("País de origem.");
                                    	jTextField11.setEditable(false);
                                    	jTextField11.setColumns(50);
                                    	jTextField11.setHorizontalAlignment(SwingConstants.CENTER);
                                    	jTextField11.setBounds(244, 260, 217, 24);
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
                                            jLabel13.setBounds(5, 4, 207, 24);
                                    }
                                    {
                                    	jFormattedTextField3 = new JFormattedTextField();
                                    	jPanel3.add(jFormattedTextField3);
                                    	jFormattedTextField3.setBounds(228, 5, 226, 27);
                                    	jFormattedTextField3.setToolTipText("Número do telefone fico incluindo o código de área.");
                                    	jFormattedTextField3.setHorizontalAlignment(SwingConstants.CENTER);
                                    	jFormattedTextField3.setColumns(20);
                                    	jFormattedTextField3.setSize(217, 24);
                                    	jFormattedTextField3.setEditable(false);
                                    }
                                    {
                                            jLabel14 = new JLabel();
                                            jPanel3.add(jLabel14);
                                            jLabel14.setText("Telefone Celular");
                                            jLabel14.setBounds(5, 41, 207, 24);
                                    }
                                    {
                                    	jFormattedTextField4 = new JFormattedTextField();
                                    	jPanel3.add(jFormattedTextField4);
                                    	jFormattedTextField4.setBounds(228, 42, 226, 27);
                                    	jFormattedTextField4.setToolTipText("Número do telefone celular incluindo o código de área.");
                                    	jFormattedTextField4.setHorizontalAlignment(SwingConstants.CENTER);
                                    	jFormattedTextField4.setColumns(20);
                                    	jFormattedTextField4.setSize(217, 24);
                                    	jFormattedTextField4.setEditable(false);
                                    }
                                    {
                                            jLabel15 = new JLabel();
                                            jPanel3.add(jLabel15);
                                            jLabel15.setText("Telefone Nextel");
                                            jLabel15.setBounds(5, 77, 207, 24);
                                    }
                                    {
                                    	jFormattedTextField5 = new JFormattedTextField();
                                    	jPanel3.add(jFormattedTextField5);
                                    	jFormattedTextField5.setBounds(228, 78, 226, 27);
                                    	jFormattedTextField5.setToolTipText("Número do telefone Nextel incluindo o código de área.");
                                    	jFormattedTextField5.setHorizontalAlignment(SwingConstants.CENTER);
                                    	jFormattedTextField5.setColumns(20);
                                    	jFormattedTextField5.setSize(217, 24);
                                    	jFormattedTextField5.setEditable(false);
                                    }
                                    {
                                            jLabel16 = new JLabel();
                                            jPanel3.add(jLabel16);
                                            jLabel16.setText("Email");
                                            jLabel16.setBounds(5, 116, 207, 24);
                                    }
                                    {
                                    	jTextField9 = new JTextField();
                                    	jPanel3.add(jTextField9);
                                    	jTextField9.setBounds(228, 117, 226, 27);
                                    	jTextField9.setToolTipText("Email principal.");
                                    	jTextField9.setHorizontalAlignment(SwingConstants.CENTER);
                                    	jTextField9.setColumns(20);
                                    	jTextField9.setSize(217, 24);
                                    	jTextField9.setEditable(false);
                                    }
                                    {
                                            jLabel17 = new JLabel();
                                            jPanel3.add(jLabel17);
                                            jLabel17.setText("Chat ");
                                            jLabel17.setBounds(5, 151, 207, 24);
                                    }
                                    {
                                            jTextField10 = new JTextField();
                                            jPanel3.add(jTextField10);
                                            jTextField10.setBounds(228, 153, 226, 27);
                                            jTextField10.setToolTipText("Email do chat preferido.(MSN, Gtalk, Yahoo, etc)");
                                            jTextField10.setHorizontalAlignment(SwingConstants.CENTER);
                                            jTextField10.setColumns(20);
                                            jTextField10.setSize(217, 24);
                                            jTextField10.setEditable(false);
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
                                            jLabel18.setBounds(5, 5, 212, 24);
                                            jLabel18.setSize(212, 24);
                                    }
                                    {
                                    	ComboBoxModel jComboBox5Model = 
                                    		new DefaultComboBoxModel(bancos);
                                    				
                                    	jComboBox5 = new JComboBox();
                                    	jPanel4.add(jComboBox5);
                                    	jComboBox5.setModel(jComboBox5Model);
                                    	jComboBox5.setEnabled(false);
                                    	jComboBox5.setMaximumRowCount(4);
                                    	jComboBox5.setToolTipText("Selecione um banco.");
                                    	jComboBox5.setBounds(241, 5, 216, 24);
                                    }
                                    {
                                            jLabel19 = new JLabel();
                                            jPanel4.add(jLabel19);
                                            jLabel19.setText("Agência");
                                            jLabel19.setBounds(5, 42, 212, 23);
                                    }
                                    {
                                    	jTextField13 = new JTextField();
                                    	jPanel4.add(jTextField13);
                                    	jTextField13.setBounds(241, 41, 216, 24);
                                    	jTextField13.setColumns(20);
                                    	jTextField13.setHorizontalAlignment(SwingConstants.CENTER);
                                    	jTextField13.setToolTipText("Número da agência.");
                                    	jTextField13.setEditable(false);
                                    }
                                    {
                                            jLabel20 = new JLabel();
                                            jPanel4.add(jLabel20);
                                            jLabel20.setText("Conta Corrente");
                                            jLabel20.setBounds(5, 79, 210, 23);
                                    }
                                    {
                                    	jTextField15 = new JTextField();
                                    	jPanel4.add(jTextField15);
                                    	jTextField15.setEditable(false);
                                    	jTextField15.setBounds(241, 80, 215, 24);
                                    }

                                    {
                                    jPanel5 = new JPanel();
                                    jPanel5.setLayout(null);
                                    jTabbedPane1.addTab("Acesso Remoto", null, jPanel5, null);
                                    jPanel5.setBorder(BorderFactory.createTitledBorder(""));
                                    }
                                    {
                                            jLabel21 = new JLabel();
                                            jPanel5.add(jLabel21);
                                            jLabel21.setText("Tipo Acesso");
                                            jLabel21.setBounds(5, 6, 201, 26);
                                    }
                                    {
                                    	jTextField14 = new JTextField();
                                    	jPanel5.add(jTextField14);
                                    	jTextField14.setBounds(241, 5, 217, 24);
                                    	jTextField14.setToolTipText("Informe o tipo de acesso remoto.");
                                    	jTextField14.setHorizontalAlignment(SwingConstants.CENTER);
                                    	jTextField14.setColumns(50);
                                    	jTextField14.setEditable(false);
                                    }
                                    {
                                            jLabel22 = new JLabel();
                                            jPanel5.add(jLabel22);
                                            jLabel22.setText("IP Acesso");
                                            jLabel22.setBounds(5, 44, 200, 23);
                                    }
                                    {
                                    	jFormattedTextField6 = new JFormattedTextField();
                                    	jPanel5.add(jFormattedTextField6);
                                    	jFormattedTextField6.setBounds(241, 45, 217, 24);
                                    	jFormattedTextField6.setToolTipText("Informe o IP de acesso ao sistema.");
                                    	jFormattedTextField6.setHorizontalAlignment(SwingConstants.CENTER);
                                    	jFormattedTextField6.setColumns(50);
                                    	jFormattedTextField6.setEditable(false);
                                    }
                                    {
                                            jLabel23 = new JLabel();
                                            jPanel5.add(jLabel23);
                                            jLabel23.setText("IP Equipamento");
                                            jLabel23.setBounds(5, 84, 199, 22);
                                    }
                                    {
                                            jFormattedTextField7 = new JFormattedTextField();
                                            jPanel5.add(jFormattedTextField7);
                                            jFormattedTextField7.setBounds(241, 84, 217, 24);
                                            jFormattedTextField7.setHorizontalAlignment(SwingConstants.CENTER);
                                            jFormattedTextField7.setColumns(50);
                                            jFormattedTextField7.setToolTipText("Informe o número do IP do equipamento.");
                                            jFormattedTextField7.setEditable(false);
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
                            jPanel6.setBounds(133, 450, 251, 38);
                            jPanel6.setBorder(BorderFactory.createTitledBorder(""));
                            {
                                    jButton1 = new JButton();
                                    jPanel6.add(jButton1);
                                    jButton1.setText("Consultar");
                                    jButton1.setToolTipText("Clique para consultar os dados.");
                                    jButton1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/Consultas.GIF")));
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
                    {
                    	jPanel7 = new JPanel();
                    	GridLayout jPanel7Layout = new GridLayout(2, 2);
                    	jPanel7Layout.setColumns(2);
                    	jPanel7Layout.setHgap(5);
                    	jPanel7Layout.setVgap(5);
                    	jPanel7Layout.setRows(2);
                    	getContentPane().add(jPanel7);
                    	jPanel7.setLayout(jPanel7Layout);
                    	jPanel7.setBounds(12, 12, 475, 86);
                    	jPanel7.setBorder(BorderFactory.createTitledBorder("Parâmetros"));
                    	{
                    		jRadioButton1 = new JRadioButton();
                    		jPanel7.add(jRadioButton1);
                    		jRadioButton1.setText("C.N.P.J.");
                    		jRadioButton1.setToolTipText("Consultar pelo CNPJ.");
                    		getButtonGroup1().add(jRadioButton1);
                    	}
                    	{
                    		jComboBox1 = new JComboBox();
                    		jPanel7.add(jComboBox1);
                    		jComboBox1.setToolTipText("Selecione um CNPJ.");

                    	}
                    	{
                    		jRadioButton2 = new JRadioButton();
                    		jPanel7.add(jRadioButton2);
                    		jRadioButton2.setText("Razão Social");
                    		getButtonGroup1().add(jRadioButton2);
                    	}
                    	{
                    		
                    		jComboBox2 = new JComboBox();
                    		jPanel7.add(jComboBox2);
                    		jComboBox2.setToolTipText("Selecione uma razão social.");

                    	}
                    }
            } catch (Exception e) {
                    e.printStackTrace();
            }
    }
    
    private ButtonGroup getButtonGroup1() {
    	if(buttonGroup1 == null) {
    		buttonGroup1 = new ButtonGroup();
    	}
    	return buttonGroup1;
    }

}//Fim da classe
