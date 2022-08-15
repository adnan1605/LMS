package lms;

import javax.swing.*;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
	

public  class user extends JFrame implements ActionListener {
	private JPanel panel;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton b1,b2,b3;
	private JFrame frame;
	private JComboBox comboBox;
	
	
	
	public user() {
		
		setLayout(null);
		setBackground(new Color(169,169,169));
		setBounds(600, 250, 606, 406);
		
		
		
		panel=new JPanel();
		panel.setBackground(Color.lightGray);
		
		setContentPane(panel);
		
		panel.setLayout(null);
		
		
		JLabel l1=new JLabel("Username : ");
		l1.setBounds(124,89,95,24);
		panel.add(l1);
		
		
		JLabel l2=new JLabel("Password : ");
		l2.setBounds(124,124,80,24);
		panel.add(l2);
		
		
		
		 
		
	       
	        
	        
	        
	        
		 
		
	        //comboBox.addActionListener(this);
		
		
		textField=new JTextField();
		textField.setBounds(210,93,157,20);
		panel.add(textField);
		
		
		passwordField =new JPasswordField();
		passwordField.setBounds(210,128,157,20);
		panel.add(passwordField);
		
		
		b1=new JButton("Login");
		b1.addActionListener(this);
		
		
		b1.setForeground(Color.red);
		b1.setBounds(149,181,113,39);
		b1.setBackground(new Color(250,250,250));
		panel.add(b1);
		
		
		b2=new JButton("SignUp");
		b2.addActionListener(this);
		
		b2.setForeground(Color.red);
		b2.setBounds(289,181,113,39);
		b2.setBackground(Color.white);
		panel.add(b2);
		
		b3=new JButton("Forgot Password");
		b3.addActionListener(this);
		
		b3.setForeground(Color.red);
		b3.setBounds(210,250,150,39);
		b3.setBackground(new Color(253,245,230));
		panel.add(b3);
		
		
		JLabel l3=new JLabel("Trouble in Login");
		l3.setFont(new Font("Tahoma",Font.PLAIN,15));
		l3.setForeground(Color.BLACK);
		l3.setBounds(70,240,130,20);
		panel.add(l3);
		
		
	}
	
	
	
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent ae) {
		
		
			
		
		
		
		
		
		
		
		
		
		if(ae.getSource()==b1 ) {
			Boolean status =false;
			try {
				conn con=new conn();
				String sql="select * from account where username=?  and password=?" ;
				PreparedStatement st=con.c.prepareStatement(sql);
				
				
				st.setString(1, textField.getText());
				st.setString(2, passwordField.getText());
				
				ResultSet rs=st.executeQuery();
				if(rs.next()) {
					this.setVisible(false);
					new Loading().setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid credential");
				}
				
			}
			catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		if(ae.getSource()==b2) {
			setVisible(false);
			SignUp su=new SignUp();
			su.setVisible(true);
		}
		
		
		
		if(ae.getSource()==b3) {
			this.setVisible(false);
			Forgot forgot=new Forgot();
			forgot.setVisible(true);
		}
		
		

	}	
		
	
	
	public static void main(String[] args) {
		new user().setVisible(true);
	}

















	

}
