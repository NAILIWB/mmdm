package visao;

import javax.swing.JApplet;
import java.awt.GridLayout;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
public class Perfil extends JApplet {
	
	private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JButton jButton3;
    private JTextField jTextField2;
    private JLabel jLabel2;
    private JPanel jPanel7;
    private JPanel jPanel6;
    private JButton jButton4;
    private JPanel jPanel5;
    private JButton jButton1;
    private JTable jTable1;
    private JButton jButton2;
    private JPanel jPanel4;
    private JTextField jTextField1;
    private JLabel jLabel1;
    private JPanel jPanel3;
    private JPanel jPanel2;
    private JTabbedPane jTabbedPane1;
    @SuppressWarnings("unchecked")
        private Vector linha, coluna;
    private String cabecalho[]={"ID Perfil","Descrição do Perfil"};




    public static void main(String[] args) {
            JFrame frame = new JFrame("PERFIL DE ACESSO");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Perfil appletObject = new Perfil();
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
                                    jTabbedPane1.setBounds(12, 12, 476, 253);
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
                                                    jButton1.setBounds(180, 179, 112, 24);
                                                    jButton1.setToolTipText("Clique para incluir um novo perfil.");
                                                    jButton1.setSize(116, 26);
                                            }
                                            {
                                                    jPanel3 = new JPanel();
                                                    jPanel1.add(jPanel3);
                                                    jPanel3.setLayout(null);
                                                    jPanel3.setBounds(17, 47, 426, 92);
                                                    jPanel3.setBorder(BorderFactory.createTitledBorder(""));
                                                    {
                                                            jLabel1 = new JLabel();
                                                            jPanel3.add(jLabel1);
                                                            jLabel1.setText("Descrição");
                                                            jLabel1.setFont(new java.awt.Font("Tahoma",1,11));
                                                            jLabel1.setBounds(7, 14, 113, 23);
                                                    }
                                                    {
                                                            jTextField1 = new JTextField();
                                                            jPanel3.add(jTextField1);
                                                            jTextField1.setToolTipText("Informe a descrição do perfil com até 06 letras.");
                                                            jTextField1.setColumns(10);
                                                            jTextField1.setBounds(7, 57, 407, 23);
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
                                            {
                                                    jPanel4 = new JPanel();
                                                    jPanel2.add(jPanel4);
                                                    jPanel4.setLayout(null);
                                                    jPanel4.setBounds(176, 178, 118, 26);
                                                    {
                                                            jButton2 = new JButton();
                                                            jPanel4.add(jButton2);
                                                            jButton2.setText("Consultar");
                                                            jButton2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/Consultas.GIF")));
                                                            jButton2.setToolTipText("Clique para consultar os perfis cadastrados.");
                                                            jButton2.setSize(118, 26);
                                                            jButton2.setBounds(0, 0, 118, 26);
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
                                    	}
                                    	{
                                    		jPanel7 = new JPanel();
                                    		jPanel6.add(jPanel7);
                                    		jPanel7.setLayout(null);
                                    		jPanel7.setBounds(12, 38, 441, 89);
                                    		jPanel7.setBorder(BorderFactory.createTitledBorder(""));
                                    		{
                                    			jLabel2 = new JLabel();
                                    			jPanel7.add(jLabel2);
                                    			jLabel2.setText("Descrição");
                                    			jLabel2.setBounds(12, 12, 125, 23);
                                    		}
                                    		{
                                    			jTextField2 = new JTextField();
                                    			jPanel7.add(jTextField2);
                                    			jTextField2.setBounds(12, 47, 417, 23);
                                    			jTextField2.setToolTipText("Altere o perfil que foi selecionado.");
                                    			jTextField2.setColumns(50);
                                    			jTextField2.setEnabled(false);
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
                                    jPanel5.setBounds(195, 291, 118, 26);
                                    {
                                            jButton4 = new JButton();
                                            jPanel5.add(jButton4);
                                            jButton4.setText("Sair");
                                            jButton4.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/Sair.GIF")));
                                            jButton4.setToolTipText("Clique para fechar o formulário.");
                                            jButton4.setPreferredSize(new java.awt.Dimension(113, 31));
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
