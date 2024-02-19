package diane.Form;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.security.PublicKey;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class eventsform implements ActionListener{
	private static Object Public;
	JFrame frame;
	JLabel eventnamelb=new JLabel("EVENTNAME");
	JLabel dateandtimelb=new JLabel("DATEANDTIME");
	JLabel locationlb=new JLabel("LOCATION");
	JLabel descriptionlb=new JLabel("DESCRIPTION");
	JLabel organizerslb=new JLabel("ORGANIZERS");
	JLabel participationlb=new JLabel("PARTICIPATION"); 
	
	JTextField eventnametexTextField =new JTextField();
	JTextField dateandtimetexField =new JTextField();
	JTextField locationtexField =new JTextField();
	JTextField descriptiontexField =new JTextField();
	JTextField organizerstexTextField =new JTextField();
	JTextField participationtexField =new JTextField();
	
	JButton sendButton=new JButton("SEND");
	JButton cancelButton=new JButton("CANCEL");
	private Object eventsnamelb;
	
	
	public eventsform() {
		createwindows();}
	
	
	private void createwindows() {
		frame =new JFrame();
		frame.setTitle("eventsForm");
		frame.setBounds(10,40,400,400);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout( null);
		frame.setResizable(true);
		frame.setVisible(true);
		
		setsizeandlocation();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
private void setsizeandlocation() {
	eventnamelb.setBounds(10,10,200,30);
	dateandtimelb.setBounds(10,50,200,30);
	locationlb.setBounds(10,90,200,30);
	descriptionlb.setBounds(10,130,200,30);
	organizerslb.setBounds(10,170,200,30);
	participationlb.setBounds(10,210,200,30);
	
	
	eventnametexTextField.setBounds(160,10,130,30);
	dateandtimetexField.setBounds(160,50,130,30);
	locationtexField.setBounds(160,90,130,30);
	descriptiontexField.setBounds(160,130,130,30);
	organizerstexTextField.setBounds(160,170,130,30);
	participationtexField.setBounds(160,210,130,30);
	
    sendButton.setBounds(10,250,85,30);
    cancelButton.setBounds(100,250,85,30);
    
     addcomponenttoframe();}
     
     private void addcomponenttoframe() {
    	 
	frame.add(eventnamelb);
	frame.add(dateandtimelb);
	frame.add(locationlb);
	frame.add(descriptionlb);
	frame.add(organizerslb);
	frame.add(participationlb);
	
	
	frame.add(eventnametexTextField);
	frame.add(dateandtimetexField);
	frame.add(locationtexField);
	frame.add(descriptiontexField);
	frame.add(organizerstexTextField);
	frame.add(participationtexField);
	
	
	
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
	
	eventnamelb.setFont(fontii);
	dateandtimelb.setFont(fontii);
	locationlb.setFont(fontii);
	descriptionlb.setFont(fontii);
	organizerslb.setFont(fontii);
	participationlb.setFont(fontii);
	
	
	eventnametexTextField.setFont(fontii);
	dateandtimetexField.setFont(fontii);
	locationtexField.setFont(fontii);
	descriptiontexField.setFont(fontii);
	organizerstexTextField.setFont(fontii);
	participationtexField.setFont(fontii);
	
	sendButton.setFont(fontii);
	cancelButton.setFont(fontii);
	}
public void actionperformed1(ActionEvent e) {
// TODO Auto_generated method stub 
	
	
}


public static void main( String[]args) {
	eventsform eventsf=new eventsform();
}
	


	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		
	}}
	
	
	
	
	





