import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class securityalerts extends JFrame implements ActionListener{

	 Button b1,b2,b3,b4,b5,b6;
	securityalerts()
	{
		setLayout(null);
		Label n=new Label("Advisory Alerts on I-Bank 	:", Label.RIGHT);
		Label t=new Label("Advisory Alerts on ATM 	:", Label.RIGHT);
		Label m=new Label("Advisory Alerts on Micro ATMs 	:", Label.RIGHT);
		Label p=new Label("Advisory on Phishing Attacks 	:", Label.RIGHT);
		Label l=new Label("Advisory on Mobile Transactions:", Label.RIGHT);
		Label r=new Label("Advisory on  Fake Mobile Apps",Label.RIGHT);
		add(n);
		add(t);
		add(m);
		add(p);
		add(l);
		add(r);
		n.setBounds(100,100,500,30);
		n.setFont(new Font("Arial",Font.BOLD,20));
		n.setBackground(Color.LIGHT_GRAY);
		b1=new Button("CLICK HERE");
		b1.addActionListener(this);
		add(b1);
        b1.setBounds(650,100,150,30);
        t.setBounds(100,200,500,30);
		t.setFont(new Font("Arial",Font.BOLD,20));
		t.setBackground(Color.LIGHT_GRAY);
		b2=new Button("CLICK HERE");
		b2.addActionListener(this);
		add(b2);
        b2.setBounds(650,200,150,30);
        m.setBounds(100,300,500,30);
		m.setFont(new Font("Arial",Font.BOLD,20));
		m.setBackground(Color.LIGHT_GRAY);
		b3=new Button("CLICK HERE");
		b3.addActionListener(this);
		add(b3);
        b3.setBounds(650,300,150,30);
        p.setBounds(100,400,500,30);
		p.setFont(new Font("Arial",Font.BOLD,20));
		p.setBackground(Color.LIGHT_GRAY);
		b4=new Button("CLICK HERE");
		b4.addActionListener(this);
		add(b4);
        b4.setBounds(650,400,150,30);
        l.setBounds(100,500,500,30);
		l.setFont(new Font("Arial",Font.BOLD,20));
		l.setBackground(Color.LIGHT_GRAY);
		b5=new Button("CLICK HERE");
		b5.addActionListener(this);
		add(b5);
        b5.setBounds(650,500,150,30);
        r.setBounds(100,600,500,30);
		r.setFont(new Font("Arial",Font.BOLD,20));
		r.setBackground(Color.LIGHT_GRAY);
		b6=new Button("CLICK HERE");
		b6.addActionListener(this);
		add(b6);
        b6.setBounds(650,600,150,30);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			try
			{
			Desktop.getDesktop().open(new java.io.File("File/b1.txt"));
		}catch(Exception e)
			{
			e.printStackTrace();
			}
		}
		
		if(ae.getSource()==b2)
		{
			try
			{
			Desktop.getDesktop().open(new java.io.File("File/b2.txt"));
		}catch(Exception e)
			{
			e.printStackTrace();
			}
		}
		
		if(ae.getSource()==b3)
		{
			try
			{
			Desktop.getDesktop().open(new java.io.File("File/b3.txt"));
		}catch(Exception e)
			{
			e.printStackTrace();
			}
		}
		
		if(ae.getSource()==b4)
		{
			try
			{
			Desktop.getDesktop().open(new java.io.File("File/b4.txt"));
		}catch(Exception e)
			{
			e.printStackTrace();
			}
		}
		
		if(ae.getSource()==b5)
		{
			try
			{
			Desktop.getDesktop().open(new java.io.File("File/b5.txt"));
		}catch(Exception e)
			{
			e.printStackTrace();
			}
		}
		if(ae.getSource()==b6)
		{
			try
			{
			Desktop.getDesktop().open(new java.io.File("File/b6.txt"));
		}catch(Exception e)
			{
			e.printStackTrace();
			}
		}
	}
	
	
	public void paint(Graphics g)
	{
		Font f=new Font("Arial",Font.ROMAN_BASELINE,30);
		g.setFont(f);
		g.drawString("ORIENTAL BANK OF COMMERCE", 480,70 );
		//this.setBackground(new Color(200,100,5));
		//((Frame)).setBackground(Color.LIGHT_GRAY);
	}
	public static void main(String args[])
	{
		securityalerts f=new securityalerts();
		f.setTitle("SECURITY ALERTS");
		f.setSize(700,800);
		f.setVisible(true);
		f.addWindowListener(new td());
		f.setBackground(Color.LIGHT_GRAY);
	}

}
 class td extends WindowAdapter
 {
	 public void windowClosing(WindowEvent e)
	 {
		 System.exit(0);
	 }

	
	
}
