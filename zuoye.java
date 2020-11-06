package dl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class zuoye extends JFrame{
	private static final long serialVersionUID = 1L;
	JPanel pnlMain;
     JLabel lblUserName,lblUserPwd;
     JTextField txtUserName,txtPassword;
     JButton btnEnsure,btnCancel;
     JTextArea txt;
    public zuoye() {
        pnlMain=new JPanel(null);
        lblUserName=new JLabel("账号:");
        txtUserName=new JTextField();
        lblUserPwd=new JLabel("密码:");
        txtPassword=new JTextField();
        btnEnsure=new JButton("确认");
        btnCancel=new JButton("取消");
        txt=new JTextArea();
package dl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class zuoye extends JFrame{
	private static final long serialVersionUID = 1L;
	JPanel pnlMain;
     JLabel lblUserName,lblUserPwd;
     JTextField txtUserName,txtPassword;
     JButton btnEnsure,btnCancel;
     JTextArea txt;
    public zuoye() {
        pnlMain=new JPanel(null);
        lblUserName=new JLabel("账号:");
        txtUserName=new JTextField();
        lblUserPwd=new JLabel("密码:");
        txtPassword=new JTextField();
        btnEnsure=new JButton("确认");
        btnCancel=new JButton("取消");
        txt=new JTextArea();
        init();
    }
    private void init() {
        this.setBounds(550,200,270,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Enter");
        this.setResizable(false); 
        lblUserName.setBounds(20,20,75,22);
        lblUserPwd.setBounds(20,60,75,22);
        txtUserName.setBounds(90,20,120,22);
        txtPassword.setBounds(90,60,120,22);
        btnEnsure.setBounds(50,200,75,22);
        btnCancel.setBounds(150,200,75,22); 
        txt.setBounds(70,240,140,90);
        txt.setVisible(false);
        pnlMain.add(lblUserName);
        pnlMain.add(lblUserPwd);
        pnlMain.add(txtUserName);
        pnlMain.add(txtPassword);
        pnlMain.add(btnEnsure);
        pnlMain.add(btnCancel);
        pnlMain.add(txt);
        this.add(pnlMain);
        this.setVisible(true);
        btnEnsure.addActionListener(new zuoye2(this));
        
        btnCancel.addActionListener(new zuoye3());
    }
    class zuoye3 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            txt.setVisible(false);
        }
    }    
    public static void main(String[] args) {
        new zuoye();
    }    
}
