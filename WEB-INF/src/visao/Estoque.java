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
    private JComboBox jComboBox1;
    private JTextField jTextField5;
    private JTextField jTextField4;
    private JTextField jTextField3;
    private JTextField jTextField2;
    private String cabecalho[]={"ID Perfil","Descrição do Perfil"};
    private String estadoConservacao[]={"","Não Utilizável","Utilizável"};




    public static void main(String[] args) {
            JFrame frame = new JFrame("CADASTRO,CONSULTA E ALTERAÇÃO DO ESTOQUE DE MATERIAIS/EQUIPAMENTOS");
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
                            this.setSize(500,360);
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
                                                    	jLabel2.setText("Descrição");
                                                    }
                                                    {
                                                    	jTextField2 = new JTextField();
                                                    	jPanel3.add(jTextField2);
                                                    	jTextField2.setColumns(250);
                                                    	jTextField2.setToolTipText("Informe a descrição detalhada do Material/Equipamento.");
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
                                                    }
                                                    {
                                                    	jLabel6 = new JLabel();
                                                    	jPanel3.add(jLabel6);
                                                    	jLabel6.setText("Estado Conservação");
                                                    }
                                                    {
                                                    	ComboBoxModel jComboBox1Model = 
                                                    		new DefaultComboBoxModel(estadoConservacao);
                                                    	jComboBox1 = new JComboBox();
                                                    	jPanel3.add(jComboBox1);
                                                    	jComboBox1.setModel(jComboBox1Model);
                                                    	jComboBox1.setToolTipText("Selecione um estado de conservação.");
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
                                                    jScrollPane1.setBounds(17, 17, 431, 134);
                                                    jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                                                    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                                                    jScrollPane1.setBorder(BorderFactory.createTitledBorder(""));
                                                    jScrollPane1.setToolTipText("Selecione um registro para alterar.");
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
                                    		jButton3.setBounds(175, 184, 118, 23);
                                    		jButton3.setToolTipText("Clique para alterar o registro.");
                                    		jButton3.setEnabled(false);
                                    		jButton3.setSize(118, 26);
                                    	}
                                    	{
                                    		jPanel7 = new JPanel();
                                    		jPanel6.add(jPanel7);
                                    		jPanel7.setLayout(null);
                                    		jPanel7.setBounds(12, 12, 441, 160);
                                    		jPanel7.setBorder(BorderFactory.createTitledBorder(""));
                                    	}
                                    }
                            }
                    }
            } catch(Exception e) {
                    e.printStackTrace();
            }
    }//Fim do método init




@SuppressWarnings("unchecked")
private void adicionaColuna(){
    
    coluna=new Vector();
    for(int i=0;i<cabecalho.length;i++){
            
            coluna.addElement(cabecalho[i]);
    }               
    
}//Fim do método void adicionaColuna




@SuppressWarnings("unchecked")
private void adicionaLinha(){
    
    linha=new Vector();
    
}//Fim do método adicionaLinha

}//Fim da classe
