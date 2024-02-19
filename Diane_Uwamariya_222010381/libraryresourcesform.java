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
public class libraryresourcesform implements ActionListener{
	JFrame frame;
	JLabel idlb=new JLabel("ID");
	JLabel bookslb=new JLabel("BOOKS");
	JLabel journalslb=new JLabel("JOURNALS");
	JLabel digitalresourceslb=new JLabel("DIGITALRESOURCES");
	JLabel borrowingrecordslb=new JLabel("BORROWINGRECORDS");
	JLabel duedateslb=new JLabel("DUEDATES");
	
	JTextField idtexTextField =new JTextField();
	JTextField bookstexTextField =new JTextField();
	JTextField journalstexField =new JTextField();
	JTextField digitalresourcestexField =new JTextField();
	JTextField borrowingrecordstexField =new JTextField();
	JTextField  duedatestexField=new JTextField();
	
	
	JButton sendButton=new JButton("SEND");
	JButton cancelButton=new JButton("CANCEL");
	private Object libraryresoursesbookslb;
	
	
	public libraryresourcesform() {
		createwindows();}
	
	
	private void createwindows() {
		frame =new JFrame();
		frame.setTitle("libraryresourcesform");
		frame.setBounds(10,40,380,330);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout( null);
		frame.setResizable(true);
		frame.setVisible(true);
		
		setsizeandlocation();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void setsizeandlocation() {
		idlb.setBounds(10,10,200,30);
		bookslb.setBounds(10,50,200,30);
		journalslb.setBounds(10,90,200,30);
		digitalresourceslb.setBounds(10,130,200,30);
		borrowingrecordslb.setBounds(10,170,200,30);
		duedateslb.setBounds(10,270,200,30);
		
		idtexTextField.setBounds(160,10,130,30);
		bookstexTextField.setBounds(160,50,130,30);
		journalstexField.setBounds(160,90,130,30);
		digitalresourcestexField.setBounds(160,130,130,30);
		borrowingrecordstexField.setBounds(160,170,130,30);
		duedatestexField.setBounds(160,210,130,30);
				
	    sendButton.setBounds(10,220,85,30);
	    cancelButton.setBounds(100,220,85,30);
	    
	     addcomponenttoframe();}
	     
	     private void addcomponenttoframe() {
	    frame.add(idlb);
		frame.add(bookslb);
		frame.add(journalslb);
		frame.add(digitalresourceslb);
		frame.add(borrowingrecordslb);
		frame.add(duedateslb);
		
		frame.add(idtexTextField);
		frame.add(bookstexTextField);
		frame.add(journalstexField);
		frame.add(digitalresourcestexField);
		frame.add(borrowingrecordstexField);
		frame.add(duedatestexField);
	
		
		frame.add(sendButton);
		frame.add(cancelButton);
		
		ActionEvent();
		
	     }
		
		
		
	private void ActionEvent() {
		
		sendButton.addActionListener(this);
		sendButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
				Class.forName("com.mysql.jc.jdbc.driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/urhuye","root","");
				String query="INSERT INTO libraryresource VALUES(?,?,?,?,?,?)";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setInt(1, Integer.parseInt(idtexTextField.getText()));
				ps.setString(2, journalstexField.getText());
				ps.setString(3, journalstexField.getText());
				ps.setString(4, digitalresourcestexField.getText());
				ps.setString(5, borrowingrecordstexField.getText());
				ps.setString(6, duedatestexField.getText());
				ps.executeUpdate();
				JOptionPane.showMessageDialog(sendButton,"sucessfully");
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
				
			}
		});
		cancelButton.addActionListener(this);
		
			
		}
	private void setallfont() {
		Font  fontii=new Font( " gergia",Font.ITALIC,18);
		
		bookslb.setFont(fontii);
		journalslb.setFont(fontii);
		digitalresourceslb.setFont(fontii);
		borrowingrecordslb.setFont(fontii);
		duedateslb.setFont(fontii);
		
		
		bookstexTextField.setFont(fontii);
		journalstexField.setFont(fontii);
		digitalresourcestexField.setFont(fontii);
		borrowingrecordstexField.setFont(fontii);
		duedatestexField.setFont(fontii);
		
		sendButton.setFont(fontii);
		cancelButton.setFont(fontii);
		}
	public void actionperformed1(ActionEvent e) {
	// TODO Auto_generated method stub 
		
		
	}


	public static void main( String[]args) {
		libraryresourcesform libraryresourcesf=new libraryresourcesform();
	}
		


		@Override
		public void actionPerformed(java.awt.event.ActionEvent e) {
			// TODO Auto-generated method stub
			
		}}
		
		
		
		
		






