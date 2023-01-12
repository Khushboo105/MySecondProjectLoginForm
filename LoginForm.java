import javax.swing.*;
import java.awt.*;
public class LoginForm 
{
	JFrame fr=new JFrame("Login Form");
	JLabel la1=new JLabel("Enetr user id:");
	JLabel la2=new JLabel("Enetr passward:");
	JTextField tb1=new JTextField();
	JPasswordField tb2=new JPasswordField();
	JButton bt=new JButton("Login");
	public LoginForm()
	{
		fr.setSize(460,400);
		fr.setLocationRelativeTo(null);

		fr.setResizable(false);
		fr.setDefaultCloseOperation(3);
		addComponents();
		fr.setVisible(true);
	}
	private void addComponents()
	{
		//Font fo=new Font("arial",3,20);
		Font  fo=new Font("lucida calligraphy",0,18);
		fr.setLayout(null);
		la1.setBounds(20,70,150,30);
		la1.setFont(fo);
		fr.add(la1);
		la2.setBounds(20,150,170,30);
		la2.setFont(fo);
		fr.add(la2);
		tb1.setBounds(200,70,230,30);
		fr.add(tb1);
		tb2.setBounds(200,150,230,30);
		fr.add(tb2);
		bt.setBounds(200,240,100,30);
		fr.add(bt);
	}
	public static void main(String[] args) 
	{
		new LoginForm();

	}

}
