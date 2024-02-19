package diane.Form;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class facultyform  implements ActionListener{
	private static Object Public;
	JFrame frame;
	JLabel idlb=new JLabel("ID");
	JLabel facultynamelb1=new JLabel("FACULTYNAME");
	JLabel contactinformationlb=new JLabel("CONTACTINFORMATION");
	JLabel departmenttitlelb=new JLabel("DEPARTMENTTITLE");
	JLabel coursetaughtlb=new JLabel("COURSETAUGHT");
	JLabel researchinterestslb=new JLabel("RESEARCHINTERESTS");
	
	JTextField idtexTextField =new JTextField();
	JTextField facultynametexField =new JTextField();
	JTextField contantinformationtexField =new JTextField();
	JTextField departmenttitletexField =new JTextField();
	JTextField coursetaughtexField =new JTextField();
	JTextField researchintereststexField =new JTextField();
	
	JButton sendButton=new JButton("SEND");
	JButton cancelButton=new JButton("CANCEL");
	private Object facultyname;
	private JComponent facultynamelb;
	
	public facultyform() {
		createwindows();}
	
	
	private void createwindows() {
		frame =new JFrame();
		frame.setTitle("facultyform");
		frame.setBounds(10,40,400,350);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout( null);
		frame.setResizable(true);
		frame.setVisible(true);
		
		setsizeandlocation();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
private void setsizeandlocation() {
	idlb.setBounds(10,10,200,30);
	facultynamelb1.setBounds(10,50,200,30);
	contactinformationlb.setBounds(10,90,200,30);
	departmenttitlelb.setBounds(10,130,200,30);
	coursetaughtlb.setBounds(10,170,200,30);
	researchinterestslb.setBounds(10,200,200,30);
	
	idtexTextField.setBounds(160,10,130,30);
	facultynametexField.setBounds(160,50,130,30);
	contantinformationtexField.setBounds(160,90,130,30);
	departmenttitletexField.setBounds(160,130,130,30);
	coursetaughtexField.setBounds(160,170,130,30);
	researchintereststexField.setBounds(160,210,130,30);
	
    sendButton.setBounds(10,250,85,30);
    cancelButton.setBounds(100,250,85,30);
    
    addcomponenttoframe();}
private void addcomponenttoframe() {
	 
frame.add(idlb);
frame.add(facultynamelb1);
frame.add(contactinformationlb);
frame.add(departmenttitlelb);
frame.add(coursetaughtlb);
frame.add(researchinterestslb);

frame.add(idtexTextField);
frame.add(facultynametexField);
frame.add(contantinformationtexField);
frame.add(departmenttitletexField);
frame.add(coursetaughtexField);
frame.add(researchintereststexField);

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
	facultynamelb1.setFont(fontii);
	contactinformationlb.setFont(fontii);
	departmenttitlelb.setFont(fontii);
	coursetaughtlb.setFont(fontii);
	researchinterestslb.setFont(fontii);
	
	idtexTextField.setFont(fontii);
	facultynametexField.setFont(fontii);
	contantinformationtexField.setFont(fontii);
	departmenttitletexField.setFont(fontii);
	coursetaughtexField.setFont(fontii);
	researchintereststexField.setFont(fontii);
	
	sendButton.setFont(fontii);
	cancelButton.setFont(fontii);
	}


public void actionperformed1(ActionEvent e) {
	// TODO Auto_generated method stub 
		
		
	}


	public static void main( String[]args) {
		facultyform ff=new facultyform();
	}
		


		@Override
		public void actionPerformed(java.awt.event.ActionEvent e) {
			// TODO Auto-generated method stub
			
		}}
		