import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class newform extends JFrame implements ActionListener {
	TextField name,fname,mname,pan,aadhar;
	Choice ch,bh;
	CheckboxGroup cbg,ebg;
	Checkbox y,t,d,w;
	Button b1,b2;
	 String nm;
	
	newform()
	{
		setLayout(null);
		Label n=new Label("NAME 	:", Label.RIGHT);
		Label f=new Label("FATHERS NAME 	:", Label.RIGHT);
		Label m=new Label("MOTHERS NAME 	:", Label.RIGHT);
		Label p=new Label("PAN NUMBER 	:", Label.RIGHT);
		Label a=new Label("AADHAR NUMBER 	:", Label.RIGHT);
		Label c=new Label("CATEGORY 	:",Label.RIGHT);
		Label r=new Label("RELIGION 	:",Label.RIGHT);
		Label s=new Label("SENOIR CITIZEN 	:",Label.RIGHT);
		Label e=new Label("EXISTING ACCOUNT 	:",Label.RIGHT);
		name=new TextField(20);
		fname=new TextField(20);
		mname=new TextField(20);
		pan=new TextField(20);
		aadhar=new TextField(20);
		n.setBounds(50,150,200,30);
		n.setFont(new Font("Arial",Font.BOLD,20));
		n.setBackground(Color.LIGHT_GRAY);
		name.setBounds(400,150,300,30);
		f.setBounds(50,200,250,30);
		f.setFont(new Font("Arial",Font.BOLD,20));
		f.setBackground(Color.LIGHT_GRAY);
		fname.setBounds(400,200,300,30);
		m.setBounds(50,250,250,30);
		m.setBackground(Color.LIGHT_GRAY);
		mname.setBounds(400,250,300,30);
		m.setFont(new Font("Arial",Font.BOLD,20));
		p.setBounds(50,300,250,30);
		pan.setBounds(400, 300, 300, 30);
		p.setFont(new Font("Arial",Font.BOLD,20));
		p.setBackground(Color.LIGHT_GRAY);
		a.setBounds(50,350,250,30);
		aadhar.setBounds(400, 350, 300, 30);
		a.setFont(new Font("Arial",Font.BOLD,20));
		a.setBackground(Color.LIGHT_GRAY);
		c.setBounds(50,400,250,30);
		c.setFont(new Font("Arial",Font.BOLD,20));
		c.setBackground(Color.LIGHT_GRAY);
		r.setBounds(50,450,250,30);
		r.setFont(new Font("Arial",Font.BOLD,20));
		r.setBackground(Color.LIGHT_GRAY);
		s.setBounds(50,500,250,30);
		s.setFont(new Font("Arial",Font.BOLD,20));
		s.setBackground(Color.LIGHT_GRAY);
		e.setBounds(50,600,250,30);
		e.setFont(new Font("Arial",Font.BOLD,20));
		e.setBackground(Color.LIGHT_GRAY);
		add(n);
		add(name);
		add(f);
		add(fname);
		add(m);
		add(mname);
		add(p);
		add(pan);
		add(a);
		add(aadhar);
		add(c);
		add(r);
		add(s);
		add(e);
		
		ch=new Choice();
		ch.add("General");
		ch.add("OBC");
		ch.add("SC");
		ch.add("ST");
		ch.add("Other");
		add(ch);
		ch.setBounds(400, 400, 300, 30);
		
		bh=new Choice();
		bh.add("Hindu");
		bh.add("Muslim");
		bh.add("Sikh");
		bh.add("Christian");
		bh.add("Other");
		add(bh);
		bh.setBounds(400,450,300,30);
		
		cbg=new CheckboxGroup();
		y=new Checkbox("Yes",cbg,false);
		t=new Checkbox("No",cbg,false);
		add(y);
		add(t);
		y.setBounds(400, 500, 300, 30);
		y.setBackground(Color.LIGHT_GRAY);
		t.setBounds(400,550,300,30);
		t.setBackground(Color.LIGHT_GRAY);
		
		ebg=new CheckboxGroup();
		d=new Checkbox("Yes",cbg,false);
		w=new Checkbox("No",cbg,false);
		add(d);
		add(w);
		d.setBounds(400, 600, 300, 30);
		d.setBackground(Color.LIGHT_GRAY);
		w.setBounds(400,650,300,30);
		w.setBackground(Color.LIGHT_GRAY);
		
		b1=new Button("SUBMIT");
		add(b1);
		b1.setBounds(700,650,150,30);
		b1.addActionListener(this);
		b1.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
		b1.setBackground(Color.LIGHT_GRAY);
		b2=new Button("CANCEL");
		add(b2);
		b2.setBounds(900,650,150,30);
		b2.addActionListener(this);
		b2.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
		b2.setBackground(Color.LIGHT_GRAY);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String nm=name.getText();
		String fn=fname.getText();
		String mn=mname.getText();
		String aa=aadhar.getText();
		String p=pan.getText();
		if(ae.getSource() == b1)
		{
			Component frame=null;
			JOptionPane.showMessageDialog(frame, "New Account Created Sucessfully");
			
		}
		if(ae.getSource()==b2)
		{
			System.exit(0);
		}
	}
	
     
	public void paint(Graphics g)
	{
		Font f=new Font("Arial",Font.ROMAN_BASELINE,30);
		g.setFont(f);
		g.drawString("ORIENTAL BANK OF COMMERCE", 480,70 );
		//this.setBackground(new Color(200,100,5));
	}
	public static void main(String args[])
	{
		newform f=new newform();
		f.setTitle("NEW ACCOUNT APPLICATION FORM");
		f.setSize(700,800);
		f.setVisible(true);
		f.addWindowListener(new te());
		f.setBackground(Color.LIGHT_GRAY);
	}

}
 class te extends WindowAdapter
 {
	 public void windowClosing(WindowEvent e)
	 {
		 System.exit(0);
	 }


	
	
}
