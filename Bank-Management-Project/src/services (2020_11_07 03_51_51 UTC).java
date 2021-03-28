import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class services  extends  JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6;
	services()
	{
		setLayout(null);
		b1=new JButton("1. NEW ACCOUNT APPLICTAION ");
		b1.setToolTipText("NEW ACOOUNT APPLICATION FORM");
		b1.addActionListener(this);
		b1.setBackground(Color.LIGHT_GRAY);
		b2=new JButton("2. USER GUIDELINES");
		b2.addActionListener(this);
		b2.setToolTipText("USER GUIDELINES");
		b2.setBackground(Color.LIGHT_GRAY);
		b3=new JButton("3. SECURITY ALERTS");
		b3.setToolTipText("SECURITY ALERTS");
		b3.addActionListener(this);
		b3.setBackground(Color.LIGHT_GRAY);
		b4=new JButton("SUBMIT");
		b4.setMnemonic('s');
		b4.setBackground(Color.LIGHT_GRAY);
		b5=new JButton("CANCEL");
		b5.setMnemonic('c');
		b5.setBackground(Color.LIGHT_GRAY);
		b6=new JButton("4. BARCODE GENERATION");
		b6.setToolTipText("BARCODE GENERATION");
		b6.addActionListener(this);
		b6.setBackground(Color.LIGHT_GRAY);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		b1.setBounds(200,200,200,50);
		//b1.setSize(200, 50);
		b2.setBounds(700,200,200,50);
		b3.setBounds(200,400,200,50);
		b4.setBounds(450,600,200,50);
		b5.setBounds(700,600,200,50);
		b6.setBounds(700, 400, 200, 50);
		b5.addActionListener(this);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
public void paint(Graphics g)
{
	Font f=new Font("Arial",Font.PLAIN,30);
	g.setFont(f);
	g.drawString("ORIENTAL BANK OF COMMERCE", 480,70 );
	//this.setBackground(new Color(200,100,5));
}
public void actionPerformed(ActionEvent ae)
{
	
	if(ae.getSource() == b1)
	{
		newform newfo=new newform();
		newfo.setVisible(true);
	}
	if(ae.getSource()==b2)
	{
		try
		{
		Desktop.getDesktop().open(new java.io.File("File/obc.userguideline.pdf"));
	}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	if(ae.getSource()==b3)
	{
		securityalerts sa=new securityalerts();
		sa.setVisible(true);
	}
	if(ae.getSource()==b5)
	{
		System.exit(0);
	}
	if(ae.getSource() == b6)
	{
		barcode bar=new barcode();
		bar.setVisible(true);
	}
	
}



public static void main(String args[])
{
	services f=new services();
	f.setTitle("BANKING APPLICATON");
	f.setSize(700,800);
	f.setVisible(true);
	f.addWindowListener(new two());
	f.setBackground(Color.LIGHT_GRAY);
}

}
class two extends WindowAdapter
{
 public void windowClosing(WindowEvent e)
 {
	 System.exit(0);
 }
}


