package dl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class zuoye2 implements ActionListener{
    zuoye zy;
    String gender="";
    String hobby="";
    public zuoye2(zuoye zy) {
        this.zy = zy;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        zy.txt.setVisible(true);
        zy.txt.setLineWrap(true);
        zy.txt.setText("账号:"+zy.txtUserName.getText()+'\n');
        zy.txt.append("密码:"+zy.txtPassword.getText()+'\n');
        }
}