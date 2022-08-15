package lms;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.TableView.TableCell;

//import com.mysql.cj.xdevapi.Table;

import timeconversion.Home;

public abstract class AssignedTaskDetails extends JFrame implements ActionListener{
	public static void main(String[] args) {
		try {
            conn con = new conn();
            String sql = "select * from task_matcher";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            //JTable.setModel(DbUtils.resultSetToTableModel(rs));
            System.out.println("user"+" "+"task");
            while(rs.next()) {
            	System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
            	
            
            rs.close();
            st.close();
            con.c.close();
		}
	 catch (Exception e) {
	}
}
}