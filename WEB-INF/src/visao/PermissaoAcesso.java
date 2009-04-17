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
public class PermissaoAcesso extends JApplet {
	
	private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JPanel jPanel6;
    private JComboBox jComboBox4;
    private JComboBox jComboBox3;
    private JComboBox jComboBox2;
    private JComboBox jComboBox1;
    private JLabel jLabel4;
    private JLabel jLabel3;
    private JLabel jLabel2;
    private JLabel jLabel1;
    private JButton jButton4;
    private JPanel jPanel5;
    private JButton jButton1;
    private JTable jTable1;
    private JButton jButton3;
    private JButton jButton2;
    private JPanel jPanel4;
    private JPanel jPanel3;
    private JPanel jPanel2;
    private JTabbedPane jTabbedPane1;
    @SuppressWarnings("unchecked")
    private Vector linha, coluna;
    private JComboBox jComboBox5;
    private JLabel jLabel5;
    private String cabecalho[]={"ID PERMISSÃO","PERMISSÃ0","ATIVO"};




    public static void main(String[] args) {
            JFrame frame = new JFrame("PERMISSÃO DE ACESSO");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            PermissaoAcesso appletObject = new PermissaoAcesso();
            appletObject.init();
            appletObject.start();
            frame.getContentPane().add(appletObject);
            frame.setSize(appletObject.getSize());
            frame.setVisible(true);
    }




    
public void init() {
            try {
                    {
                            this.setSize(500, 340);
                            getContentPane().setLayout(null);
                            {
                                    jTabbedPane1 = new JTabbedPane();
                                    getContentPane().add(jTabbedPane1);
                                    jTabbedPane1.setBounds(12, 12, 476, 264);
                                    jTabbedPane1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
                                    {
                                            jPanel1 = new JPanel();
                                            jTabbedPane1.addTab("Cadastro", null, jPanel1, null);
                                            jPanel1.setBorder(BorderFactory.createTitledBorder(""));
                                            jPanel1.setLayout(null);
                                            jPanel1.setFont(new java.awt.Font("Dialog",0,12));
                                            {
                                                    jButton1 = new JButton();
                                                    jPanel1.add(jButton1);
                                                    jButton1.setText("Incluir");
                                                    jButton1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/07_Incluir.GIF")));
                                                    jButton1.setBounds(177, 174, 112, 29);
                                                    jButton1.setToolTipText("Clique para incluir");
                                                    jButton1.setSize(116,28);
                                            }
                                            {
                                                    jPanel3 = new JPanel();
                                                    GridLayout jPanel3Layout = new GridLayout(4, 2);
                                                    jPanel3Layout.setColumns(2);
                                                    jPanel3Layout.setHgap(5);
                                                    jPanel3Layout.setVgap(5);
                                                    jPanel3Layout.setRows(4);
                                                    jPanel1.add(jPanel3);
                                                    jPanel3.setLayout(jPanel3Layout);
                                                    jPanel3.setBounds(17, 17, 431, 131);
                                                    jPanel3.setBorder(BorderFactory.createTitledBorder(""));
                                                    {
                                                    	jLabel1 = new JLabel();
                                                    	jPanel3.add(jLabel1);
                                                    	jLabel1.setText("Perfil");
                                                    }
                                                    {
                                                    	jComboBox1 = new JComboBox();
                                                    	jPanel3.add(jComboBox1);
                                                    	jComboBox1.setToolTipText("Selecione o perfil.");
                                                    	jComboBox1.setMaximumRowCount(4);

                                                    }
                                                    {
                                                    	jLabel2 = new JLabel();
                                                    	jPanel3.add(jLabel2);
                                                    	jLabel2.setText("Permissão");
                                                    }
                                                    {
                                                    	ComboBoxModel jComboBox2Model = 
                                                    		new DefaultComboBoxModel(
                                                    				new String[] {"CADASTRAR","CONSULTAR","ALTERAR","RELATÓRIO"});
                                                    	jComboBox2 = new JComboBox();
                                                    	jPanel3.add(jComboBox2);
                                                    	jComboBox2.setModel(jComboBox2Model);
                                                    	jComboBox2.setMaximumRowCount(4);
                                                    	jComboBox2.setToolTipText("Selecione uma permissão.");
                                                    }
                                                    {
                                                    	jLabel3 = new JLabel();
                                                    	jPanel3.add(jLabel3);
                                                    	jLabel3.setText("Módulo");
                                                    }
                                                    {
                                                    	ComboBoxModel jComboBox3Model = 
                                                    		new DefaultComboBoxModel(
                                                    				new String[] {"CLIENTE","DESPACHO","DEVOLUÇÃO MATERIAL",
                                                    						"ESTOQUE","FORNECEDOR","ORDEM SERVIÇO","PERFIL ACESSO",
                                                    						"PERMISSÃO ACESSO","REQUISIÇÃO MATERIAL",
                                                    						"STATUS ORDEM SERVIÇO","STATUS REQUISIÇÃO MATERIAL",
                                                    						"VENDA"});
                                                    	jComboBox3 = new JComboBox();
                                                    	jPanel3.add(jComboBox3);
                                                    	jComboBox3.setModel(jComboBox3Model);
                                                    	jComboBox3.setMaximumRowCount(4);
                                                    }
                                                    {
                                                    	jLabel4 = new JLabel();
                                                    	jPanel3.add(jLabel4);
                                                    	jLabel4.setText("Ativo");
                                                    }
                                                    {
                                                    	ComboBoxModel jComboBox4Model = 
                                                    		new DefaultComboBoxModel(
                                                    				new String[] {"SIM","NÃO"});
                                                    	jComboBox4 = new JComboBox();
                                                    	jPanel3.add(jComboBox4);
                                                    	jComboBox4.setModel(jComboBox4Model);
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
                                                    jScrollPane1.setBounds(17, 58, 431, 117);
                                                    jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                                                    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                                                    jScrollPane1.setBorder(BorderFactory.createTitledBorder(""));
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
                                                    jPanel4 = new JPanel();
                                                    GridLayout jPanel4Layout = new GridLayout(1, 2);
                                                    jPanel4Layout.setColumns(2);
                                                    jPanel4Layout.setHgap(5);
                                                    jPanel4Layout.setVgap(5);
                                                    jPanel2.add(jPanel4);
                                                    jPanel4.setLayout(jPanel4Layout);
                                                    jPanel4.setBounds(120, 189, 241, 24);
                                                    jPanel4.setSize(241, 28);
                                                    {
                                                            jButton2 = new JButton();
                                                            jPanel4.add(jButton2);
                                                            jButton2.setText("Consultar");
                                                            jButton2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/Consultas.GIF")));
                                                            jButton2.setToolTipText("Clique para consultar as permissões.");
                                                            jButton2.setSize(116,28);
                                                    }
                                                    {
                                                            jButton3 = new JButton();
                                                            jPanel4.add(jButton3);
                                                            jButton3.setText("Alterar");
                                                            jButton3.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/TipoVeiculo.GIF")));
                                                            jButton3.setToolTipText("Clique para alterar a permissão selecionada.");
                                                            jButton3.setSize(116,28);
                                                    }
                                            }
                                            {
                                            	jPanel6 = new JPanel();
                                            	GridLayout jPanel6Layout = new GridLayout(1, 2);
                                            	jPanel6Layout.setColumns(2);
                                            	jPanel6Layout.setHgap(5);
                                            	jPanel6Layout.setVgap(5);
                                            	jPanel2.add(jPanel6);
                                            	jPanel6.setLayout(jPanel6Layout);
                                            	jPanel6.setBounds(17, 5, 431, 36);
                                            	jPanel6.setBorder(BorderFactory.createTitledBorder(""));
                                            	{
                                            		jLabel5 = new JLabel();
                                            		jPanel6.add(jLabel5);
                                            		jLabel5.setText("Perfil");
                                            	}
                                            	{
                                            		jComboBox5 = new JComboBox();
                                            		jPanel6.add(jComboBox5);
                                            		jComboBox5.setToolTipText("Selecione o perfil para consulta.");
                                            		jComboBox5.setMaximumRowCount(4);

                                            	}
                                            }
                                                                                    }
                            }
                            {
                                    jPanel5 = new JPanel();
                                    GridLayout jPanel5Layout = new GridLayout(1, 1);
                                    jPanel5Layout.setColumns(1);
                                    jPanel5Layout.setHgap(5);
                                    jPanel5Layout.setVgap(5);
                                    getContentPane().add(jPanel5);
                                    jPanel5.setLayout(jPanel5Layout);
                                    jPanel5.setBounds(195, 288, 110, 29);
                                    {
                                            jButton4 = new JButton();
                                            jPanel5.add(jButton4);
                                            jButton4.setText("Sair");
                                            jButton4.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/Sair.GIF")));
                                            jButton4.setToolTipText("Clique para fechar o formulário.");
                                            jButton4.setPreferredSize(new java.awt.Dimension(109, 29));
                                            jButton4.setSize(118, 26);
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
