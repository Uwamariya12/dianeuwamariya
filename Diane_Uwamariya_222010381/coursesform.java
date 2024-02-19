package diane.Form;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class coursesform implements ActionListener{
	private static Object Public;
	JFrame frame;
	JLabel coursecodelb=new JLabel("COURSECODE");
	JLabel coursetitlelb=new JLabel("COURSETITLE");
	JLabel descriptionlb=new JLabel("DESCRIPTION");
	JLabel credithourslb=new JLabel("CREDITHOURS");
	
	JTextField coursecodetexTextField =new JTextField();
	JTextField coursetitletexField =new JTextField();
	JTextField descriptiontexField =new JTextField();
	JTextField credithourstexField =new JTextField();
	
	
	JButton sendButton=new JButton("SEND");
	JButton cancelButton=new JButton("CANCEL");
	private Object coursesnamelb;
	
	
	public coursesform() {
		createwindows();}
	
	
	private void createwindows() {
		frame =new JFrame();
		frame.setTitle("coursesForm");
		frame.setBounds(10,40,350,300);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout( null);
		frame.setResizable(true);
		frame.setVisible(true);
		
		setsizeandlocation();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
private void setsizeandlocation() {
	coursecodelb.setBounds(10,10,200,30);
	coursetitlelb.setBounds(10,50,200,30);
	descriptionlb.setBounds(10,90,200,30);
	credithourslb.setBounds(10,130,200,30);
	
	coursecodetexTextField.setBounds(160,10,130,30);
	coursetitletexField.setBounds(160,50,130,30);
	descriptiontexField.setBounds(160,90,130,30);
	credithourstexField.setBounds(160,130,130,30);
	
	
    sendButton.setBounds(10,170,85,30);
    cancelButton.setBounds(100,170,85,30);
    
     addcomponenttoframe();}
     
     private void addcomponenttoframe() {
    	 
	frame.add(coursecodelb);
	frame.add(coursetitlelb);
	frame.add(descriptionlb);
	frame.add(credithourslb);
	
	frame.add(coursecodetexTextField);
	frame.add(coursetitletexField);
	frame.add(descriptiontexField);
	frame.add(credithourstexField);
	
	
	
	
	frame.add(sendButton);
	frame.add(cancelButton);
	
	ActionEvent();
	
     }
	
	
	
private void ActionEvent() {
	
	sendButton.addActionListener(this);
	sendButton.addActionListener(new ActionListener() {
		
		public void actionPerformed(java.awt.event.ActionEvent e) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");	
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/urhuye","root","");
				String query="INSERT INTO course VALUES(?,?,?,?)";
				PreparedStatement pStatement=connection.prepareStatement(query);
				pStatement.setInt(1,Integer.parseInt(coursecodetexTextField.getText()));
				pStatement.setString(2,coursetitletexField.getText());
				pStatement.setString(3,descriptiontexField.getText());
				pStatement.setString(4, credithourstexField .getText());
				pStatement.executeUpdate();
				JOptionPane.showMessageDialog(sendButton, "data inserted well");
				pStatement.close();
				connection.close();	
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
			
		}
	});	
	
	cancelButton.addActionListener(this);
		
	}
private void setallfont() {
	Font  fontii=new Font( " gergia",Font.ITALIC,18);
	
	coursecodelb.setFont(fontii);
	coursetitlelb.setFont(fontii);
	descriptionlb.setFont(fontii);
	credithourslb.setFont(fontii);
	
	coursecodetexTextField.setFont(fontii);
	coursetitletexField.setFont(fontii);
	descriptiontexField.setFont(fontii);
	credithourstexField.setFont(fontii);
	
	sendButton.setFont(fontii);
	cancelButton.setFont(fontii);
	}
public void actionperformed1(ActionEvent e) {
// TODO Auto_generated method stub 
	
	
}


public static void main( String[]args) {
     coursesform coursesf=new coursesform();
}
	


	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		
	}}
	
	
	
	
	







	
