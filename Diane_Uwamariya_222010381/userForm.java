package diane.Form;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.security.PublicKey;


import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class userForm implements ActionListener {
	private static Object Public;
	JFrame frame;
	JLabel idlb=new JLabel("ID");
	JLabel usernamelb1=new JLabel("USERNAME");
	JLabel passwordlb=new JLabel("PASSWORD");
	JLabel rolelb=new JLabel("ROLE");
	
	JTextField idtexTextField =new JTextField();
	JTextField usernametexField =new JTextField();
	JTextField passwordtexField =new JTextField();
	JTextField roletexField =new JTextField();
	
	JButton sendButton=new JButton("SEND");
	JButton cancelButton=new JButton("CANCEL");
	
	
	
	private Object username;
	private JComponent usernamelb;
	
	public userForm() {
		createwindows();}
	
	
	private void createwindows() {
		frame =new JFrame();
		frame.setTitle("userForm");
		frame.setBounds(10,40,450,300);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout( null);
		frame.setResizable(true);
		frame.setVisible(true);
		
		setsizeandlocation();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
private void setsizeandlocation() {
	idlb.setBounds(10,10,200,30);
	usernamelb1.setBounds(10,50,200,30);
	passwordlb.setBounds(10,90,200,30);
	rolelb.setBounds(10,130,200,30);
	
	
	
	idtexTextField.setBounds(160,10,130,30);
	usernametexField.setBounds(160,50,130,30);
	passwordtexField.setBounds(160,90,130,30);
	roletexField.setBounds(160,130,130,30);
	
    sendButton.setBounds(10,150,85,30);
    sendButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		try {
			
		} catch (Exception e2) {
		
		}	
		}
	});
    cancelButton.setBounds(100,150,85,30);
    
    
    addcomponenttoframe();}

private void addcomponenttoframe() {
	 
frame.add(idlb);
frame.add(usernamelb1);
frame.add(passwordlb);
frame.add(rolelb);

frame.add(idtexTextField);
frame.add(usernametexField);
frame.add(passwordtexField);
frame.add(roletexField);

frame.add(sendButton);
frame.add(cancelButton);


ActionEvent1();

}
private void ActionEvent1() {
	
	sendButton.addActionListener(this);
	cancelButton.addActionListener(this);
	
	
	}
private void setallfont() {
	Font  fontii=new Font( " gergia",Font.ITALIC,18);
	
	idlb.setFont(fontii);
	usernamelb1.setFont(fontii);
	passwordlb.setFont(fontii);
	rolelb.setFont(fontii);
	
	
	idtexTextField.setFont(fontii);
	usernametexField.setFont(fontii);
	passwordtexField.setFont(fontii);
	roletexField.setFont(fontii);
	sendButton.setFont(fontii);
	cancelButton.setFont(fontii);
	
	}

public void actionperformed1(ActionEvent e) {
	// TODO Auto_generated method stub 
		
		
	}


	public static void main( String[]args) {
		userForm uf=new userForm();
	}
		


		@Override
		public void actionPerformed(java.awt.event.ActionEvent e) {
			// TODO Auto-generated method stub
			
		}}
		
		
		
		
		
     
	

