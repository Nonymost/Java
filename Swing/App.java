import javax.swing.*;
import java.awt.event.*;

class App{
    public static void main(String[]args){
        JTextField tf = new JTextField();
        JTextField tf1 = new JTextField();
        JButton b1 = new JButton("+");
        JButton b2 = new JButton("-");
        JFrame f = new JFrame("App");

        tf.setBounds(10,10,50,30);
        tf1.setBounds(70,10,50,30);

        b1.setBounds(10,60,50,30);
        b2.setBounds(70,60,50,30);

        
        f.add(tf);
        f.add(tf1);
        f.add(b1);
        f.add(b2);

        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
        

    }
}