package lms;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class worktodo {
	
	public static void main(String[] args) {
		
		
		String [][] data= {{"mdadnan@gmail.com","Mohan"},{"rohan@gmail.com","Pankaj"}
		};
		
		String column[]= {"user","task"};
		JTable table=new JTable(data,column);
		JFrame frame=new JFrame("work to do");
		frame.add(new JScrollPane(table));
		
		frame.setSize(500,500);
		frame.setVisible(true);
	}

}
