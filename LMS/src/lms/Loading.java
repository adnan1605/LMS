package lms;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;


public class Loading  extends JFrame implements Runnable{
	
	private JPanel contentPane;
	private JProgressBar progressBar;
	Connection conn;
	int s=0;
	Thread th;
	
	public void setUpLoading() {
		setVisible(false);
		th.start();
	}
	
	public void run() {
		try {
			for(int i=0;i<200;i++) {
				s++;
				int m=progressBar.getMaximum();
				int v=progressBar.getValue();
				//System.out.println(progressBar.getMaximum());
				if(v<m) {
					progressBar.setValue(progressBar.getValue()+1);
				}
				else {
					i=201;
					setVisible(false);
					new user_home().setVisible(true);
				}
				Thread.sleep(50);
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Loading() {
		super("Loading");
		th=new Thread((Runnable)this);
		
		
		setBounds(600, 250, 606, 406);
		contentPane=new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.black);
		
		
		JLabel lblm=new JLabel("TASKS");
		lblm.setForeground(Color.DARK_GRAY);
		lblm.setFont(new Font("Trebuchet Hs",Font.BOLD,45));
		lblm.setBounds(130,46,500,35);
		contentPane.add(lblm);
		
		JLabel label=new JLabel("Please Wait while we are Loading");
		label.setFont(new Font("Yu Gothic UI SemiBold",Font.BOLD,20));
		label.setForeground(new Color(160,72,45));
		label.setBounds(125,165,400,40);
		contentPane.add(label);
		
		
		progressBar=new JProgressBar();
		progressBar.setFont(new Font("Tahoma",Font.BOLD,12));
		progressBar.setStringPainted(true);
		progressBar.setBounds(130,135,300,25);
		contentPane.add(progressBar);
		
		
		
		JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setBounds(0, 0, 590, 390);
        contentPane.add(panel);
		
		setUpLoading();
		
		
	}
	
	public static void main(String[] args) {
		new Loading().setVisible(true);
	}
	
	

}
