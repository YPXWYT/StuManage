package stuInformation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class myNullLayout extends JFrame {
    JLabel 用户名,密码;
    JTextField user,passwd;
    int x=0,y=0,w,h;
    Container cp=getContentPane();
    public myNullLayout(){
        setLayout(null);
        用户名=new JLabel("用户名：",JLabel.CENTER);
        密码=new JLabel("密码:",JLabel.CENTER);
        user=new JTextField();
        passwd=new JTextField();
        x=80;y=60;
        w=100;h=30;

       用户名.setBounds(0,y,w,h);user.setBounds(x,y,w,h);
        密码.setBounds(0,2*y,w,h);passwd.setBounds(x,2*y,w,h);
        cp.add(用户名);
        cp.add(密码);
        cp.add(user);
        cp.add(passwd);
        setSize(400,300);
        setTitle("学生管理系统");
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

   /* public void actionPerformed(ActionEvent e){
        String user ="admin";
        int passwd=123456;
        if(e.getSource())
    }*/
}