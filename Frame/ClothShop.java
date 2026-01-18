package Frame;
import Entity.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class ClothShop extends JFrame implements ActionListener, MouseListener
{
	private JPanel panel;
	private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
	private JTextField tf1,tf2;
	private JTextArea ta1;
	private JPasswordField pf1;
	private Font f1,f2,f3;
	private JButton bt1,bt2,bt3;
	private JRadioButton rb1,rb2;
	private JCheckBox cb1,cb2,cb3,cb4;
	private JComboBox jb;
	private ImageIcon img;
	private ButtonGroup bg;
	
    private Color c1;
	
	private JTable jt;
	
	public ClothShop()
    {
    super("Group 10 GUI Project");
    super.setBounds(200,125,1210,800);
    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    panel = new JPanel();
    panel.setLayout(null);
	c1 = new Color(178, 190, 181);
	panel.setBackground(c1);

    f1 = new Font("Cambria", Font.BOLD, 20);
	f2 = new Font("Lucida Calligraphy", Font.BOLD, 35);
	f3 = new Font("Arial Black", Font.BOLD, 13);

    label1 = new JLabel("Jersey Freak");
    label1.setBounds(465,0,300,60);
	label1.setFont(f2);
	label1.setForeground(Color.BLACK);
    panel.add(label1);
	label1.addMouseListener(this);

    label2 = new JLabel("Your Name ");
    label2.setBounds(10,60,150,40);
	label2.setFont(f1);
    panel.add(label2);
	
	
	tf1 = new JTextField();
	tf1.setBounds(175,65,200,40);
	tf1.setFont(f1);
	panel.add(tf1);	
	
	label3 = new JLabel("Premium Code ");
	label3.setBounds(10,100,200,80);
	label3.setFont(f1);
    panel.add(label3);	
	
	
	pf1 = new JPasswordField();
	pf1.setBounds(175,120,200,40);
	pf1.setFont(f1);
	pf1.setEchoChar('*');
	pf1.addActionListener(this);
	panel.add(pf1);
	
	
	bt1 = new JButton("Show");
	bt1.setBounds(400,120,80,40);
	bt1.setFont(f3);
	panel.add(bt1);
	bt1.addActionListener(this);
	
	label4 = new JLabel("Jersey Sleeve ");
	label4.setBounds(10,140,150,120);
	label4.setFont(f1);
	panel.add(label4);
	
	rb1 = new JRadioButton("Half");
	rb1.setBounds(175,187,80,20);
	rb1.setFont(f1);
	rb1.setOpaque(false);
	panel.add(rb1);
	
	rb2 = new JRadioButton("Full");
	rb2.setBounds(260,187,80,20);
	rb2.setFont(f1);
	rb2.setOpaque(false);
	panel.add(rb2);
	
	bg = new ButtonGroup();
	bg.add(rb1);
	bg.add(rb2);
	
	label5 = new JLabel("Order Elements ");
	label5.setBounds(10,180,200,160);
	label5.setFont(f1);
	panel.add(label5);
	
	cb1 = new JCheckBox("Jersey");
	cb1.setBounds(175,250,100,20);
	cb1.setFont(f1);
	cb1.setOpaque(false);
	panel.add(cb1);

	cb2 = new JCheckBox("Shorts");
	cb2.setBounds(175,290,100,20);
	cb2.setFont(f1);
	cb2.setOpaque(false);
	panel.add(cb2);
	
	cb3 = new JCheckBox("Boot");
	cb3.setBounds(300,250,100,20);
	cb3.setFont(f1);
	cb3.setOpaque(false);
	panel.add(cb3);	
	
	cb4 = new JCheckBox("Gloves");
	cb4.setBounds(300,290,100,20);
	cb4.setFont(f1);
	cb4.setOpaque(false);
	panel.add(cb4);
	
	label6 = new JLabel("Set ");
	label6.setBounds(10,250,100,200);
	label6.setFont(f1);
	panel.add(label6);
	label6.addMouseListener(this);
	
	String jersey[] = new String[] {"Select", "Man United", "Barcelona", "Real Madrid", "Aresenal FC", "Man City", "Liverpool"};
    jb = new JComboBox(jersey);
    jb.setBounds(175,335,150,30);
    jb.setFont(f1);
    panel.add(jb);
	
	label7 = new JLabel("Delivery Address ");
	label7.setBounds(10,370,200,240);
	label7.setFont(f1);
	panel.add(label7);
	
	ta1 = new JTextArea();
	ta1.setBounds(175,475,250,100);
	ta1.setFont(f1);
	panel.add(ta1);
	
	label8 = new JLabel("Details ");
	label8.setBounds(440,270,100,250);
	label8.setFont(f1);
	panel.add(label8);
	
	bt2 = new JButton("Submit");
    bt2.setBounds(200,600,150,30); 
	bt2.setFont(f3);
	bt2.addActionListener(this);
	bt2.addMouseListener(this);
	panel.add(bt2);
		
	bt3 = new JButton("Exit");
	bt3.setBounds(200,650,150,30); 
	bt3.setFont(f3);
	bt3.addActionListener(this);
	bt3.addMouseListener(this);
	panel.add(bt3);
	
		
	img = new ImageIcon("Picture\\JerseyLogo.png");
	label9 = new JLabel(img);
	label9.setBounds(770,45,300,300);
	panel.add(label9);
	
	label10 = new JLabel("Phone No ");
	label10.setBounds(10,370,100,90);
	label10.setFont(f1);
	panel.add(label10);
	
	tf2 = new JTextField();
	tf2.setBounds(175,395,160,40);
	tf2.setFont(f1);
	panel.add(tf2);
	

	
	super.add(panel);
    }
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == bt1)
		{
			pf1.setEchoChar((char)0);
		}
		else if(ae.getSource() == bt3)
		{
			System.exit(0);
		}
		else if(ae.getSource() == bt2)
		{
			String s1,s2,s3,s4,s5,s6,s7;
			s1 = tf1.getText();
			s2 = pf1.getText();
			
			if(rb1.isSelected())
			{
				s3 = rb1.getText();
			}
			else if(rb2.isSelected())
			{
				s3 = rb2.getText();
			}
			else
			{
				s3 = "Others";
			}
			
			if(cb1.isSelected() && cb2.isSelected() && cb3.isSelected() && cb4.isSelected())
			{
				s4 = cb1.getText()+" "+cb2.getText()+" "+cb3.getText()+" "+cb4.getText();
			}
			else if(cb1.isSelected() && cb2.isSelected() && cb3.isSelected())
			{
				s4 = cb1.getText()+" "+cb2.getText()+" "+cb3.getText();
			}
			else if(cb2.isSelected() && cb3.isSelected() && cb4.isSelected())
			{
				s4 = cb2.getText()+" "+cb3.getText()+" "+cb4.getText();
			}
			else if(cb1.isSelected() && cb3.isSelected() && cb4.isSelected())
			{
				s4 = cb1.getText()+" "+cb3.getText()+" "+cb4.getText();
			}
			else if(cb1.isSelected() && cb2.isSelected())
			{
				s4 = cb1.getText()+" "+cb2.getText();
			}
			else if(cb1.isSelected() && cb3.isSelected())
			{
				s4 = cb1.getText()+" "+cb3.getText();
			}
			else if(cb1.isSelected() && cb4.isSelected())
			{
				s4 = cb1.getText()+" "+cb4.getText();
			}
			else if(cb2.isSelected() && cb3.isSelected())
			{
				s4 = cb2.getText()+" "+cb3.getText();
			}
			else if(cb2.isSelected() && cb4.isSelected())
			{
				s4 = cb2.getText()+" "+cb4.getText();
			}
			else if(cb3.isSelected() && cb4.isSelected())
			{
				s4 = cb3.getText()+" "+cb4.getText();
			}
			else if(cb1.isSelected())
			{
				s4 = cb1.getText();
			}
			else if(cb2.isSelected())
			{
				s4 = cb2.getText();
			}
			else if(cb3.isSelected())
			{
				s4 = cb3.getText();
			}		
			else if(cb4.isSelected())
			{
				s4 = cb4.getText();
			}
			else
			{
				s4 = " ";
			}
			
			s5 = jb.getSelectedItem().toString();
			s6 = ta1.getText();
			s7 = tf2.getText();
			
		    if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() || s6.isEmpty() || s7.isEmpty())
		        {
			        JOptionPane.showMessageDialog(this,"Please fill up all the information");
				}
			else
				{
				    Customer c1 = new Customer(s1,s2,s3,s4,s5,s6,s7);
					c1.insertInfo();
					JOptionPane.showMessageDialog(this,"Thanks for fill up the information.");
					showInfo();
				}
			String [] columns = {"Name", "Premium code", "Sleeve", "Order elements", "Set", "Phone no", "Delivery Address"};
	        String [][] data = {
	        {s1,s2,s3,s4,s5,s7,s6}
	        };
	        jt = new JTable(data,columns);
			JScrollPane sp = new JScrollPane(jt);
	        sp.setBounds(440,420,750,100);
	        panel.add(sp);
		}   
	}
	
	public void mouseClicked(MouseEvent me)
	{
		if(me.getSource() == label6)
		{
			label6.setText("Club Name");
		}
	}
	
	public void mousePressed(MouseEvent me)
	{
		if(me.getSource() == label1)
		{
			label1.setText("Shop Name");
		}
	}
	
	public void mouseReleased(MouseEvent me)
	{
		if(me.getSource() == label1)
		{
			label1.setText("Jersey Freak");
		}
	}
	
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == bt2)
		{
			bt2.setBackground(Color.GREEN);
			bt2.setForeground(Color.BLACK);
		}
			   
		if(me.getSource() == bt3)
		{
			bt3.setBackground(Color.RED);
			bt3.setForeground(Color.WHITE);
		}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == bt2)
		{
			bt2.setBackground(Color.WHITE);
			bt2.setForeground(Color.BLACK);
		}
		
		if(me.getSource() == bt3)
		{
			bt3.setBackground(Color.WHITE);
			bt3.setForeground(Color.BLACK);
		}
	}	
	
	private void showInfo()
	{
		try
		{
			File file = new File("./Data/userdata.txt");
			if(file.exists())
			{
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
		 ;	    
				String line; 
				while((line = br.readLine()) != null)
				{
					
				}
				br.close();
			}
		}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
				JOptionPane.showMessageDialog(this,"Error Occurs");
			}
	    }
    }