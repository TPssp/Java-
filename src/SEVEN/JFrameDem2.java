package SEVEN;

import javax.swing.*;
import java.awt.*;

public class JFrameDem2 {
    JFrame frame;
    JButton button;
    public void init(){
        frame=new JFrame("MY ");
        button=new JButton("123");
        //Container contentPane=frame.getContentPane();
        //contentPane.add(button,BorderLayout.CENTER);
        //frame.setContentPane(contentPane);
        //frame.getContentPane().add(button,BorderLayout.CENTER);
        Container container=frame.getContentPane();
        container.setLayout(new BorderLayout());
        container.add(button,BorderLayout.CENTER);


        frame.setSize(300,200);
        frame.setVisible(true);
    }



    public static void main(String[] args){
        JFrameDem2 Ddem=new JFrameDem2();
        Ddem.init();
    }
}
