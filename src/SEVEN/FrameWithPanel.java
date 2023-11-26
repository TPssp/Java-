package SEVEN;

import javax.swing.*;
import java.awt.*;

public class FrameWithPanel {
    JFrame frame;
    JPanel panel;
    JButton button;
    public void init(){
        frame=new JFrame("Frame with Panel");
        panel=new JPanel();
        button=new JButton("DAD");
        Container contentPane=frame.getContentPane();
        contentPane.setBackground(Color.CYAN);
        panel.setBackground(Color.yellow);
        panel.add(button);
        contentPane.add(panel,BorderLayout.SOUTH);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        FrameWithPanel frame=new FrameWithPanel();
        frame.init();
    }
}
