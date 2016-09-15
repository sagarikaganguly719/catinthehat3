
package pack2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.*;
public class P1 extends JFrame implements ActionListener
{  JLabel l1;
JButton b1;
    P1()
    {   Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.white, Color.orange);
        l1=new JLabel("hello world");
        b1=new JButton("bye");
        l1.setToolTipText("this is a label");
        l1.setBorder(bd);
        l1.setFont(new Font("Times New Roman",Font.ITALIC,18));
        l1.setForeground(Color.black);
        b1.setBackground(Color.red);
        b1.setToolTipText("press the button");
        b1.addActionListener(this);
        add(l1);
        add(b1);
    }
     @Override
    public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        if(s.equals("bye"))
        b1.setBackground(Color.cyan);
        
    }
    
    public static void main(String args[])
    {
        P1 b=new P1();
        Container c=b.getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.green);
        
        b.setSize(400,400);
        b.setTitle("demo");
        b.setVisible(true);
        
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
}
