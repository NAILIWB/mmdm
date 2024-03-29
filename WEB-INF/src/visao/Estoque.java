package visao;

import javax.swing.JApplet;
import java.awt.GridLayout;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
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
public class Estoque extends JApplet {
	
	private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JTextField jTextField1;
    private JLabel jLabel6;
    private JLabel jLabel3;
    private JLabel jLabel2;
    private JLabel jLabel1;
    private JButton jButton3;
    private JPanel jPanel7;
    private JPanel jPanel6;
    private JButton jButton1;
    private JTable jTable1;
    private JPanel jPanel3;
    private JPanel jPanel2;
    private JTabbedPane jTabbedPane1;
    @SuppressWarnings("unchecked")
    private Vector linha, coluna;
    private JComboBox jComboBox2;
    private JTextField jTextField10;
    private JTextField jTextField9;
    private JTextField jTextField8;
    private JTextField jTextField7;
    private JTextField jTextField6;
    private JLabel jLabel12;
    private JLabel jLabel11;
    private JLabel jLabel10;
    private JLabel jLabel9;
    private JLabel jLabel8;
    private JLabel jLabel7;
    private JButton jButton2;
    private JComboBox jComboBox1;
    private JTextField jTextField5;
    private JTextField jTextField4;
    private JTextField jTextField3;
    private JTextField jTextField2;
    private String cabecalho[]={"ID","Nome","Descri��o","Bloco",
    		"Part Number","Serial Number","Estado Conserva��o"};
    private String estadoConservacao[]={"","N�o Utiliz�vel","Utiliz�vel"};




    public static void main(String[] args) {
            JFrame frame = new JFrame("CADASTRO,CONSULTA E ALTERA��O DO ESTOQUE DE MATERIAIS/EQUIPAMENTOS");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Estoque appletObject = new Estoque();
            appletObject.init();
            appletObject.start();
            frame.getContentPane().add(appletObject);
            frame.setSize(appletObject.getSize());
            frame.setVisible(true);
    }




    
public void init() {
            try {
                    {
                            this.setSize(500, 310);
                            getContentPane().setLayout(null);
                            {
                                    jTabbedPane1 = new JTabbedPane();
                                    getContentPane().add(jTabbedPane1);
                                    jTabbedPane1.setBounds(12, 12, 476, 278);
                                    jTabbedPane1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
                                    {
                                            jPanel1 = new JPanel();
                                            jTabbedPane1.addTab("Cadastro", null, jPanel1, null);
                                            jPanel1.setBorder(BorderFactory.createTitledBorder(""));
                                            jPanel1.setLayout(null);
                                            jPanel1.setFont(new java.awt.Font("Dialog",0,12));
                                            jPanel1.setPreferredSize(new java.awt.Dimension(465, 247));
                                            {
                                                    jButton1 = new JButton();
                                                    jPanel1.add(jButton1);
                                                    jButton1.setText("Incluir");
                                                    jButton1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/07_Incluir.GIF")));
                                                    jButton1.setBounds(175, 205, 118, 26);
                                                    jButton1.setToolTipText("Clique para incluir um Material/Equipamento");
                                            }
                                            {
                                                    jPanel3 = new JPanel();
                                                    GridLayout jPanel3Layout = new GridLayout(6, 2);
                                                    jPanel3Layout.setColumns(2);
                                                    jPanel3Layout.setHgap(5);
                                                    jPanel3Layout.setVgap(5);
                                                    jPanel3Layout.setRows(6);
                                                    jPanel1.add(jPanel3);
                                                    jPanel3.setLayout(jPanel3Layout);
                                                    jPanel3.setBounds(17, 17, 443, 176);
                                                    jPanel3.setBorder(BorderFactory.createTitledBorder(""));
                                                    {
                                                    	jLabel1 = new JLabel();
                                                    	jPanel3.add(jLabel1);
                                                    	jLabel1.setText("Nome");
                                                    }
                                                    {
                                                    	jTextField1 = new JTextField();
                                                    	jPanel3.add(jTextField1);
                                                    	jTextField1.setToolTipText("Informe o nome do Material/Equipamento");
                                                    	jTextField1.setColumns(50);
                                                    }
                                                    {
                                                    	jLabel2 = new JLabel();
                                                    	jPanel3.add(jLabel2);
                                                    	jLabel2.setText("Descri��o");
                                                    }
                                                    {
                                                    	jTextField2 = new JTextField();
                                                    	jPanel3.add(jTextField2);
                                                    	jTextField2.setColumns(250);
                                                    	jTextField2.setToolTipText("Informe a descri��o detalhada do Material/Equipamento.");
                                                    }
                                                    {
                                                    	jLabel3 = new JLabel();
                                                    	jPanel3.add(jLabel3);
                                                    	jLabel3.setText("Bloco");
                                                    }
                                                    {
                                                    	jTextField3 = new JTextField();
                                                    	jPanel3.add(jTextField3);
                                                    	jTextField3.setColumns(20);
                                                    	jTextField3.setHorizontalAlignment(SwingConstants.CENTER);
                                                    }
                                                    {
                                                    	jLabel4 = new JLabel();
                                                    	jPanel3.add(jLabel4);
                                                    	jLabel4.setText("Part Number");
                                                    }
                                                    {
                                                    	jTextField4 = new JTextField();
                                                    	jPanel3.add(jTextField4);
                                                    	jTextField4.setColumns(50);
                                                    	jTextField4.setToolTipText("Informe o Part Number do Material/Equipamento.");
                                                    	jTextField4.setHorizontalAlignment(SwingConstants.CENTER);
                                                    }
                                                    {
                                                    	jLabel5 = new JLabel();
                                                    	jPanel3.add(jLabel5);
                                                    	jLabel5.setText("Serial Number");
                                                    }
                                                    {
                                                    	jTextField5 = new JTextField();
                                                    	jPanel3.add(jTextField5);
                                                    	jTextField5.setColumns(50);
                                                    	jTextField5.setToolTipText("Informe o Serial Number no Material/Equipamento.");
                                                    	jTextField5.setHorizontalAlignment(SwingConstants.CENTER);
                                                    }
                                                    {
                                                    	jLabel6 = new JLabel();
                                                    	jPanel3.add(jLabel6);
                                                    	jLabel6.setText("Estado Conserva��o");
                                                    }
                                                    {
                                                    	ComboBoxModel jComboBox1Model = 
                                                    		new DefaultComboBoxModel(estadoConservacao);
                                                    	jComboBox1 = new JComboBox();
                                                    	jPanel3.add(jComboBox1);
                                                    	jComboBox1.setModel(jComboBox1Model);
                                                    	jComboBox1.setToolTipText("Selecione um estado de conserva��o.");
                                                    	jComboBox1.setMaximumRowCount(4);
                                                    }
                                            }
                                    }
                                    {
                                    jPanel2 = new JPanel();
                                            jTabbedPane1.addTab("Consulta", null, jPanel2, null);
                                            jPanel2.setLayout(null);
                                            jPanel2.setBorder(BorderFactory.createTitledBorder(""));
                                            {
                                                    jScrollPane1 = new JScrollPane();
                                                    jPanel2.add(jScrollPane1);
                                                    jScrollPane1.setBounds(17, 17, 431, 167);
                                                    jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                                                    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                                                    jScrollPane1.setBorder(BorderFactory.createTitledBorder(""));
                                                    jScrollPane1.setToolTipText("Selecione um registro para alterar.");
                                                    jScrollPane1.setSize(443, 176);
                                                    {
                                                            adicionaColuna();
                                                            adicionaLinha();                                                                
                                                            jTable1 = new JTable(linha,coluna);
                                                            jScrollPane1.setViewportView(jTable1);
                                                            jTable1.setPreferredSize(new java.awt.Dimension(409, 112));
                                                            jTable1.getTableHeader().setEnabled(false);
                                                            jTable1.getTableHeader().setFont(new java.awt.Font("Microsoft Sans Serif",1,11));
                                                            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);




                                                    }
                                            }
                                            {
                                            	jButton2 = new JButton();
                                            	jPanel2.add(jButton2);
                                            	jButton2.setText("Consultar");
                                            	jButton2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/Consultas.GIF")));
                                            	jButton2.setBounds(178, 204, 118, 25);
                                            	jButton2.setToolTipText("Clique para consultar os �tens de estoque.");
                                            	jButton2.setSize(118, 26);
                                            }
                                                                                    }
                                    {
                                    	jPanel6 = new JPanel();
                                    	jTabbedPane1.addTab("Alterar", null, jPanel6, null);
                                    	jPanel6.setLayout(null);
                                    	
                                    	{
                                    		jButton3 = new JButton();
                                    		jPanel6.add(jButton3);
                                    		jButton3.setText("Alterar");
                                    		jButton3.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/TipoVeiculo.GIF")));
                                    		jButton3.setBounds(165, 209, 118, 25);
                                    		jButton3.setToolTipText("Clique para alterar o registro.");
                                    		jButton3.setSize(118, 26);
                                    	}
                                    	{
                                    		jPanel7 = new JPanel();
                                    		GridLayout jPanel7Layout = new GridLayout(6, 2);
                                    		jPanel7Layout.setHgap(5);
                                    		jPanel7Layout.setVgap(5);
                                    		jPanel7Layout.setColumns(2);
                                    		jPanel7Layout.setRows(6);
                                    		jPanel6.add(jPanel7);
                                    		jPanel7.setLayout(jPanel7Layout);
                                    		jPanel7.setBounds(12, 12, 441, 160);
                                    		jPanel7.setBorder(BorderFactory.createTitledBorder(""));
                                    		jPanel7.setSize(443, 176);
                                    		{
                                    			jLabel7 = new JLabel();
                                    			jPanel7.add(jLabel7);
                                    			jLabel7.setText("Nome");
                                    		}
                                    		{
                                    			jTextField6 = new JTextField();
                                    			jPanel7.add(jTextField6);
                                    			jTextField6.setEditable(false);
                                    			jTextField6.setToolTipText("Altere o nome do material/equipamento.");
                                    		}
                                    		{
                                    			jLabel8 = new JLabel();
                                    			jPanel7.add(jLabel8);
                                    			jLabel8.setText("Descri��o");
                                    		}
                                    		{
                                    			jTextField7 = new JTextField();
                                    			jPanel7.add(jTextField7);
                                    			jTextField7.setEditable(false);
                                    			jTextField7.setToolTipText("Altere a descri��o do material/equipamento");
                                    		}
                                    		{
                                    			jLabel9 = new JLabel();
                                    			jPanel7.add(jLabel9);
                                    			jLabel9.setText("Bloco");
                                    		}
                                    		{
                                    			jTextField8 = new JTextField();
                                    			jPanel7.add(jTextField8);
                                    			jTextField8.setEditable(false);
                                    			jTextField8.setToolTipText("Altere o bloco do material/equipamento.");
                                    			jTextField8.setHorizontalAlignment(SwingConstants.CENTER);
                                    		}
                                    		{
                                    			jLabel10 = new JLabel();
                                    			jPanel7.add(jLabel10);
                                    			jLabel10.setText("Part Number");
                                    		}
                                    		{
                                    			jTextField9 = new JTextField();
                                    			jPanel7.add(jTextField9);
                                    			jTextField9.setEditable(false);
                                    			jTextField9.setToolTipText("Altere o Part Number do material/equipamento.");
                                    			jTextField9.setHorizontalAlignment(SwingConstants.CENTER);
                                    		}
                                    		{
                                    			jLabel11 = new JLabel();
                                    			jPanel7.add(jLabel11);
                                    			jLabel11.setText("Serial Number");
                                    		}
                                    		{
                                    			jTextField10 = new JTextField();
                                    			jPanel7.add(jTextField10);
                                    			jTextField10.setEditable(false);
                                    			jTextField10.setToolTipText("Altere o serial number do material/equipamento.");
                                    			jTextField10.setHorizontalAlignment(SwingConstants.CENTER);
                                    		}
                                    		{
                                    			jLabel12 = new JLabel();
                                    			jPanel7.add(jLabel12);
                                    			jLabel12.setText("Estado Conserva��o");
                                    		}
                                    		{
                                    			ComboBoxModel jComboBox2Model = 
                                    				new DefaultComboBoxModel(estadoConservacao);
                                    			jComboBox2 = new JComboBox();
                                    			jPanel7.add(jComboBox2);
                                    			jComboBox2.setModel(jComboBox2Model);
                                    			jComboBox2.setToolTipText("Altere o estado de conserva��o do material/equipamento.");
                                    			jComboBox2.setEnabled(false);
                                    		}
                                    	}
                                    }
                            }
                    }
            } catch(Exception e) {
                    e.printStackTrace();
            }
    }//Fim do m�todo init




@SuppressWarnings("unchecked")
private void adicionaColuna(){
    
    coluna=new Vector();
    for(int i=0;i<cabecalho.length;i++){
            
            coluna.addElement(cabecalho[i]);
    }               
    
}//Fim do m�todo void adicionaColuna




@SuppressWarnings("unchecked")
private void adicionaLinha(){
    
    linha=new Vector();
    
}//Fim do m�todo adicionaLinha

}//Fim da classe
