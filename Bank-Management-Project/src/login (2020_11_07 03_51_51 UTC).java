import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class login extends JFrame implements ActionListener{
	JTextField log,pass;
	JButton b1,b2;
	Component frame=null;
	private ImageIcon image;	
	private JLabel label2;
	JCheckBox cb;
	 
	login()
	{
		Container c=getContentPane();
		c.setLayout(null);
		image=new ImageIcon("obc.jpg");
	    label2=new JLabel(image);
	    c.add(label2);
	    label2.setBounds(10,70,150,30);
		Label l=new Label("LOGIN ID 	:", Label.RIGHT);
		Label p=new Label("PASSWORD 	:", Label.RIGHT);
		log=new JTextField();
		log.setToolTipText("ENTER ID");
		pass=new JTextField();
		pass.setToolTipText("ENTER PASSWORD");
		
		l.setBounds(200,200,200,30);
		l.setFont(new Font("Arial",Font.BOLD,20));
		l.setBackground(Color.LIGHT_GRAY);
		log.setBounds(400,200,300,30);
		
		p.setBounds(200,300,200,30);
		p.setFont(new Font("Arial",Font.BOLD,20));
		pass.setBounds(400,300,300,30);
		p.setBackground(Color.LIGHT_GRAY);
		
		c.add(l);
		c.add(log);
		c.add(p);
		c.add(pass);
		log.addActionListener(this);
		pass.addActionListener(this);
		b1=new JButton("LOGIN");
		c.add(b1);
		b1.setBounds(500,400,150,30);
		b1.addActionListener(this);
		b1.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
		b1.setMnemonic('s');
		b1.setBackground(Color.LIGHT_GRAY);
		b2=new JButton("CANCEL");
		c.add(b2);
		b2.setBounds(750,400,150,30);
		b2.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
		b2.addActionListener(this);
		b2.setMnemonic('C');
		b2.setBackground(Color.LIGHT_GRAY);
        cb=new JCheckBox("Show Password");
        add(cb);
        cb.setBounds(750,300,150, 30);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
		{
			System.exit(0);
		}
		
		String uid=log.getText();
		String pad=pass.getText();
		
		if(uid.equals("Tushar08") && pad.equals("123456"))
		{
			//Component frame=null;
			JOptionPane.showMessageDialog(frame, "YOU ARE SUCESSFULLY LOGINED");
			services service=new services();
			service.setVisible(true);
			
		}
		else
		{
			JOptionPane.showMessageDialog(frame, "INVALID USER ID AND PASSWORD");
		}
		//	if(cb.isSelected());
			//{
				//pad.setEchoChar((char)0);
			//}
			//else
}
	
	
	public void paint(Graphics g)
	{
		Font f=new Font("Arial",Font.PLAIN,30);
		g.setFont(f);
		g.drawString("ORIENTAL BANK OF COMMERCE", 480,70 );
		//g.drawString("WELCOME TO BANKING APPLICATION", 100, 150);
	   
	}
	
	public static void main(String args[])
	{
		login f=new login();
		f.setTitle("BANKING APPLICATON");
		f.setSize(700,800);
		f.setVisible(true);
		f.addWindowListener(new three());
		f.setBackground(Color.LIGHT_GRAY);
	}

}
 class three extends WindowAdapter
 {
	 public void windowClosing(WindowEvent e)
	 {
		 System.exit(0);
	 }
 }


