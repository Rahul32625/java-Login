import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login
{
	public static void main(String[] args)
	{		
		JFrame frm = new JFrame("Login Form");		
		JLabel l1 = new JLabel("User ID:");		
		JLabel l2 = new JLabel("Password:");		
		JTextField t1 = new JTextField();		
		JPasswordField t2 = new JPasswordField();		

		JButton login = new JButton("Login");	
		JButton reset = new JButton("Reset");		

		frm.setLayout(null);		
		l1.setBounds(50, 50, 100, 30);	
		t1.setBounds(150, 50, 150, 30);		
		l2.setBounds(50, 100, 100, 30);		
		t2.setBounds(150, 100, 150, 30);

		login.setBounds(70, 160, 100, 30);
		reset.setBounds(180, 160, 100, 30);		

		frm.add(l1);
		frm.add(t1);
		frm.add(l2);
		frm.add(t2);
		frm.add(login);
		frm.add(reset);		

		login.addActionListener(new ActionListener()
	        {
			public void actionPerformed(ActionEvent e)
			{				
				String id = t1.getText();
				String pass = new String(t2.getPassword());

				if(id.equals("") && pass.equals(""))
				{
	
					JOptionPane.showMessageDialog(frm, "Login Successful");	
		
				}
	
				else
				{
					JOptionPane.showMessageDialog(frm, "Invalid ID or Password");
				}
			}
		});

		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				t1.setText("");
				t2.setText("");
			}
		});

		
		frm.setSize(400, 300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}		