import java.awt.*;
import java.awt.event.*;
class calculator2 extends Frame implements ActionListener
{
	private float a,b,c;
	private int operator;
	Label l1=new Label("Calculator");
	Label l2=new Label();
	Label l18=new Label();
	Label l19=new Label();
	Label l20=new Label();
	Label l21=new Label();
	Button b1=new Button("7");
	Button b2=new Button("8");
	Button b3=new Button("9");
	Button b4=new Button("Del");
	Button b5=new Button("4");
	Button b6=new Button("5");
	Button b7=new Button("6");
	Button b8=new Button("/");
	Button b9=new Button("1");
	Button b10=new Button("2");
	Button b11=new Button("3");
	Button b12=new Button("x");
	Button b13=new Button("-");
	Button b14=new Button("+");
	Button b15=new Button("0");
	Button b16=new Button(".");
	Button b17=new Button("=");
	TextField f=new TextField();
	
	calculator2(String s)
	{
		super(s);
		setLayout(null);
		l1.setBounds(18,30,85,40);
		f.setBounds(14,70,200,40);
		b4.setBounds(218,70,62,40);
		b1.setBounds(14,115,62,45);
		b2.setBounds(82,115,62,45);
		b3.setBounds(150,115,62,45);
		b8.setBounds(218,115,62,45);
		b5.setBounds(14,165,62,45);
		b6.setBounds(82,165,62,45);
		b7.setBounds(150,165,62,45);
		b12.setBounds(218,165,62,45);
		b9.setBounds(14,215,62,45);
		b10.setBounds(82,215,62,45);
		b11.setBounds(150,215,62,45);
		b13.setBounds(218,215,62,45);
		b15.setBounds(14,265,62,45);
		b16.setBounds(82,265,62,45);
		b17.setBounds(150,265,62,45);
		b14.setBounds(218,265,62,45);
		setBackground(Color.cyan);
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		b5.setBackground(Color.white);
		b6.setBackground(Color.white);
		b7.setBackground(Color.white);
		b8.setBackground(Color.white);
		b9.setBackground(Color.white);
		b11.setBackground(Color.white);
		b10.setBackground(Color.white);
		b12.setBackground(Color.white);
		b13.setBackground(Color.white);
		b14.setBackground(Color.white);
		b15.setBackground(Color.white);
		b16.setBackground(Color.white);
		b17.setBackground(Color.white);
		f.setBackground(Color.white);
		setForeground(Color.blue);
		setFont(new Font("Arial",Font.BOLD,16));
		setSize(290,320);
		add(l1);add(l2);add(l18);add(f);add(l19);add(l20);add(l21);add(b4);add(b1);add(b2);add(b3);add(b8);add(b5);add(b6);
		add(b7);add(b12);add(b9);add(b10);add(b11);add(b13);add(b16);add(b15);add(b17);add(b14);
		setVisible(true);
		addWindowListener(new win());
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		f.addKeyListener(new key());
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			f.setText(f.getText().concat("7"));
			
		}
		else if(e.getSource()==b2)
		{
			f.setText(f.getText().concat("8"));
			
		}
		else if(e.getSource()==b3)
		{
			f.setText(f.getText().concat("9"));
			
		}
		else if(e.getSource()==b4)
		{
			f.setText("");
		}
		else if(e.getSource()==b5)
		{
			f.setText(f.getText().concat("4"));
			
		}
		else if(e.getSource()==b6)
		{
			f.setText(f.getText().concat("5"));
		}
		else if(e.getSource()==b7)
		{
			f.setText(f.getText().concat("6"));
			
		}
		else if(e.getSource()==b8)
		{
			a=Float.parseFloat(f.getText());
			operator=4;
			
			f.setText("");
		}
		else if(e.getSource()==b9)
		{
			f.setText(f.getText().concat("1"));
		}else if(e.getSource()==b10)
		{
			f.setText(f.getText().concat("2"));
		}
		else if(e.getSource()==b11)
		{
			f.setText(f.getText().concat("3"));
		}
		else if(e.getSource()==b12)
		{
			a=Float.parseFloat(f.getText());
			operator=3;
			
			f.setText("");
		}else if(e.getSource()==b13)
		{
			a=Float.parseFloat(f.getText());
			operator=2;
			f.setText("");
		}else if(e.getSource()==b14)
		{
			a=Float.parseFloat(f.getText());
			operator=1;
			f.setText("");
		}
		else if(e.getSource()==b15)
		{
			f.setText(f.getText().concat("0"));
		}
		else if(e.getSource()==b16)
		{
			f.setText(f.getText().concat("."));
		}
		else if(e.getSource()==b17)
		{
			b=Float.parseFloat(f.getText());
			switch(operator)
			{
				case 1:
			     c=a+b;
				break;
				case 2:
			     c=a-b;
				break;
				case 3:
			     c=a*b;
				break;
				case 4:
			     c=a/b;
				break;
				default:
				c=0;
			}
			f.setText(String.valueOf(c));
		}
		
	}
	public static void main(String args[])
	{
		new calculator2("Calculator");
	}
	class win extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
	 {
		System.exit(0);
	 }
	}
	class key extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_ADD)
			{
				a=Float.parseFloat(f.getText());
			operator=1;
			f.setText("");
			if(f.getText()=="+")
			f.setText("");
			}
			else if(e.getKeyCode()==KeyEvent.VK_SUBTRACT)
			{
				a=Float.parseFloat(f.getText());
			operator=2;
			f.setText("");
			}
			else if(e.getKeyCode()==KeyEvent.VK_MULTIPLY)
			{
				a=Float.parseFloat(f.getText());
			operator=3;
			f.setText("");
			}
			else if(e.getKeyCode()==KeyEvent.VK_DIVIDE)
			{
				a=Float.parseFloat(f.getText());
			operator=4;
			f.setText("");
			}
			else if(e.getKeyCode()==KeyEvent.VK_ENTER)
			{
				b=Float.parseFloat(f.getText());
			switch(operator)
			{
				case 1:
			     c=a+b;
				break;
				case 2:
			     c=a-b;
				break;
				case 3:
			     c=a*b;
				break;
				case 4:
			     c=a/b;
				break;
				default:
				c=0;
			}
			f.setText(String.valueOf(c));
			}
		}
	}
}
	
	
	