package visao;

import javax.swing.JApplet;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JApplet{
	
	private static final long serialVersionUID = 1L;
    private JPanel jPanel1;
    private JButton jButton1;
    private JPasswordField jPasswordField1;
    private JPanel jPanel2;
    private JTextField jTextField1;
    private JLabel jLabel2;
    private JLabel jLabel1;


    public static void main(String[] args) {
            JFrame frame = new JFrame("ACESSO AO BRADMIN");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Login login= new Login();
            login.init();
            login.start();
            frame.getContentPane().add(login);
            frame.setSize(login.getSize());
            frame.setVisible(true);
    }
    public void init() {
            try {
                    getContentPane().setLayout(null);
                    this.setSize(370,180);
                    {
                            jPanel1 = new JPanel();
                            GridLayout jPanel1Layout = new GridLayout(2, 2);
                            jPanel1Layout.setColumns(2);
                            jPanel1Layout.setRows(2);
                            jPanel1Layout.setHgap(5);
                            jPanel1Layout.setVgap(5);
                            getContentPane().add(jPanel1);
                            jPanel1.setLayout(jPanel1Layout);
                            jPanel1.setBounds(21, 37, 322, 59);
                            jPanel1.setBorder(BorderFactory.createTitledBorder(""));
                            {
                                    jLabel1 = new JLabel();
                                    jPanel1.add(jLabel1);
                                    jLabel1.setText("Usuário");
                                    jLabel1.setFont(new java.awt.Font("Tahoma",1,11));
                                    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
                                    
                            }
                            {
                                    jTextField1 = new JTextField();
                                    jPanel1.add(jTextField1);
                                    jTextField1.setHorizontalAlignment(SwingConstants.CENTER);
                                    jTextField1.setToolTipText("Informe o nome do usuário");
                                    
                            }
                            {
                                    jLabel2 = new JLabel();
                                    jPanel1.add(jLabel2);
                                    jLabel2.setText("Senha");
                                    jLabel2.setFont(new java.awt.Font("Tahoma",1,11));
                                    jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
                                    
                            }
                            {
                                    jPasswordField1 = new JPasswordField();
                                    jPanel1.add(jPasswordField1);
                                    jPasswordField1.setToolTipText("Informe a senha de acesso");
                                    jPasswordField1.setHorizontalAlignment(SwingConstants.CENTER);
                            }
                    }
                    {
                            jPanel2 = new JPanel();
                            GridLayout jPanel2Layout = new GridLayout(1, 1);
                            jPanel2Layout.setHgap(5);
                            jPanel2Layout.setVgap(5);
                            jPanel2Layout.setColumns(1);
                            getContentPane().add(jPanel2);
                            jPanel2.setLayout(jPanel2Layout);
                            jPanel2.setBounds(128, 119, 115, 38);
                            jPanel2.setBorder(BorderFactory.createTitledBorder(""));
                            jPanel2.setOpaque(false);
                            {
                                    jButton1 = new JButton();
                                    jPanel2.add(jButton1);
                                    jButton1.setText("Entrar");
                                    jButton1.setSize(100, 30);
                                    jButton1.setToolTipText("Clique no botão para acessar o sistema");
                                    jButton1.setPreferredSize(new java.awt.Dimension(111, 44));
                                    jButton1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icones/Entrar.GIF")));
                            }
                    }
            } catch (Exception e) {
                    e.printStackTrace();
            }
    }

}//Fim da classe
