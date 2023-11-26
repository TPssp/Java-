package SEVEN;
import javax.swing.*;
import java.awt.*;

public class JFrameDem1 {
    JFrame frame;
    JButton button;
    JPanel contentPane;

    public void init(){
        frame=new JFrame("My JFrame");
        button=new JButton("Press me");
        contentPane=new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(button,BorderLayout.CENTER);
        frame.setContentPane(contentPane);
        frame.setVisible(true);
        frame.setSize(300,200);
    }

    public static void main(String[] args){
        JFrameDem1 frameDem=new JFrameDem1();
        frameDem.init();
    }
}