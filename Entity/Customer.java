package Entity;
import java.lang.*;
import java.io.*;
import javax.swing.*;
public class Customer 
{
	private String s1,s2,s3,s4,s5,s6,s7;
	
	private File file;
	private FileWriter fwriter;
	
	public Customer() { }
	public Customer(String s1,String s2,String s3,String s4,String s5,String s6,String s7)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		this.s6 = s6;
		this.s7 = s7;
	}
	
	public void insertInfo()
	{
		try
		{
			file = new File("./Data/userdata.txt");
			
			if(!file.exists())
			{
				file.getParentFile().mkdirs();
				file.createNewFile();
		    }
			
			fwriter = new FileWriter(file,true);
			fwriter.write("---------------------------------------");
			fwriter.write("\nName: "+s1+"\n");
			fwriter.write("Premium code: "+s2+"\n");
			fwriter.write("Sleeve: "+s3+"\n");
			fwriter.write("Order Elements: "+s4+"\n");
			fwriter.write("Set: "+s5+"\n");
			fwriter.write("Address: "+s6+"\n");
			fwriter.write("Phone No: "+s7+"\n");
			fwriter.write("----------------------------------------");
			
			fwriter.flush();
			fwriter.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(null,"Error occurs");
		}
	}
}
	