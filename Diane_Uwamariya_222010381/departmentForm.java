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


public class departmentForm implements ActionListener{
	
	private static Object Public;
	JFrame frame;
	JLabel departmentcodelb=new JLabel("departmentcode:");
	JLabel departmentnamelb=new JLabel("departmentname:");
	JLabel departmentchairlb=new JLabel("departmentchair");
	 
	JTextField departmentcodetexTextField =new JTextField();
	JTextField departmentnametexField =new JTextField();
	JTextField departmentchairtexField =new JTextField();
	
	JButton sendButton=new JButton("SEND");
	JButton cancelButton=new JButton("CANCEL");
	private Object eventsnamelb;
	
	
	public departmentForm() {
		createwindows();}
	
	
	private void createwindows() {
		frame =new JFrame();
		frame.setTitle("departments Form");
		frame.setBounds(10,40,350,300);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout( null);
		frame.setResizable(true);
		frame.setVisible(true);
		
		setsizeandlocation();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
private void setsizeandlocation() {
	departmentcodelb.setBounds(10,10,200,30);
	departmentnamelb.setBounds(10,50,200,30);
	departmentchairlb.setBounds(10,90,200,30);
	
	departmentcodetexTextField.setBounds(160,10,130,30);
	departmentnametexField.setBounds(160,50,130,30);
	departmentchairtexField.setBounds(160,90,130,30);
	
    sendButton.setBounds(10,170,85,30);
    cancelButton.setBounds(100,170,85,30);
    
     addcomponenttoframe();}
     
     private void addcomponenttoframe() {
    	 
	frame.add(departmentcodelb);
	frame.add(departmentnamelb);
	frame.add(departmentchairlb);
	
	frame.add(departmentcodetexTextField);
	frame.add(departmentnametexField);
	frame.add(departmentchairtexField);
	
	
	
	frame.add(sendButton);
	frame.add(cancelButton);
	
	ActionEvent();
	
     }
	
	
	
private void ActionEvent() {
	
	sendButton.addActionListener(this);
	cancelButton.addActionListener(this);
		
	}
private void setallfont() {
	Font  fontii=new Font( " gergia",Font.ITALIC,18);
	
	departmentcodelb.setFont(fontii);
	departmentnamelb.setFont(fontii);
	departmentchairlb.setFont(fontii);
	
	departmentcodetexTextField.setFont(fontii);
	departmentnametexField.setFont(fontii);
	departmentchairtexField.setFont(fontii);
	
	
	sendButton.setFont(fontii);
	cancelButton.setFont(fontii);
	}
public void actionperformed1(ActionEvent e) {
// TODO Auto_generated method stub 
	
	
}


public static void main( String[]args) {
	departmentForm df=new departmentForm();
}
	


	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		
	}}
	
	
	
	
	





