package jangtang2;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.JTextComponent;

import jangtang2.MyFrame;


public class profile {
	private String name;
	   private String address;
	   private String phoneNumber;
	   public profile (String name, String address, String phoneNumber) {
	      this.name=name;
	      this.address=address;
	      this.phoneNumber=phoneNumber;
	   }
	   public String getname() {
		      return name;
		   }
	   public String getaddress() {
	      return address;
	   }
	   public String getphoneNumber() {
	      return phoneNumber;
	   }
	}
	 
	class MyFrame extends JFrame{
	   Container contentPane = getContentPane();
	   JTextArea scrollpane = new JTextArea();
	   JPanel menu = new JPanel();
	   JButton search_1 = new JButton("�˻�");
	   JButton view_1 = new JButton("��� ��ȸ");
	   JButton exit_1 = new JButton("����");
	   
	   JPanel name_phone_addr = new JPanel();
	   JButton name = new JButton("�̸�");
	   
	   
	   JPanel txt = new JPanel();
	   JTextField nametxt = new JTextField("");
	   JTextField phonetxt = new JTextField("");
	   JTextField addrtxt = new JTextField("");
	   
	   HashMap<String, profile> pb =new HashMap<String, profile>();
	   ArrayList<String> delname = new ArrayList<String>();
	   
	   public MyFrame() {
	      setTitle("�ּҷ�");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	    
	      contentPane.setBackground(Color.lightGray);
	      contentPane.setLayout(null);
	      
	      JScrollPane scroll = new JScrollPane(scrollpane);
	      scroll.setLocation(40,40);
	      scroll.setSize(300,300);
	      contentPane.add(scroll);
	      
	      
	      search_1.addActionListener(new MyActionListener());
	      view_1.addActionListener(new MyActionListener());
	      exit_1.addActionListener(new MyActionListener());
	           
	      menu.setLayout(new GridLayout(1,4,0,0));
	      
	      menu.add(search_1);
	      menu.add(view_1);
	      menu.add(exit_1);
	 
	      menu.setLocation(400,50);
	      menu.setSize(440,40);
	      contentPane.add(menu);
	      
	      name_phone_addr.setLayout(new GridLayout(3,1,5,5));
	      name_phone_addr.setBackground(Color.lightGray);
	      name_phone_addr.add(name);
	   
	      
	      name_phone_addr.setLocation(400,120);
	      name_phone_addr.setSize(100,200);
	      contentPane.add(name_phone_addr);
	      
	      txt.setLayout(new GridLayout(3,1,5,5));
	      txt.setBackground(Color.lightGray);
	      txt.add(nametxt);
	      
	      
	      txt.setLocation(520,120);
	      txt.setSize(320,200);
	      contentPane.add(txt);
	      
	      setSize(900,430);
	      setVisible(true);
	      
	   }
	   private class MyActionListener implements ActionListener{
	      public void actionPerformed(ActionEvent e) {
	         JButton b = (JButton)e.getSource();
	         int count=0;

	          pb.put("������", new profile("������", "010123456", "�ּ� ����"));
	          pb.put("������", new profile("������", "010123456", "�ּ� ����"));
	          pb.put("�Ӵٿ�", new profile("�Ӵٿ�", "010123456", "�ּ� ����"));
	             
	         
	             
	         
	         
	         if(b.getText().equals("�˻�")){
	            scrollpane.setText("");
	            Set<String> Keys = pb.keySet();
	             Iterator<String> it = Keys.iterator();
	             int n = pb.size();
	             
	             profile searchname = pb.get(nametxt.getText());
	            
	                	   
	                	  
	             scrollpane.append("�̸�: "+ searchname.getname()+ "\n�ּ�: "+searchname.getaddress()+"\n��ȭ��ȣ: "+searchname.getphoneNumber()+"\n");
	                   
	                
	             
	             
	             nametxt.setText("");
	            
	             
	         }
	         else if(b.getText().equals("��� ��ȸ")){
	            scrollpane.setText("");
	            
	            Set<String> Keys = pb.keySet();
	            Iterator<String> it = Keys.iterator();
	            int n = pb.size();
	                          
	            while(it.hasNext()){
	               String name = it.next();
	               profile searchname = pb.get(name);
	               scrollpane.append("�̸�: " + searchname.getname()+"\n�ּ�: "+searchname.getaddress()+"\n��ȭ��ȣ: "+searchname.getphoneNumber()+"\n");
	               }
	            
	            nametxt.setText("");
	          
	         }
	         else if (b.getText().equals("����")) {
	            System.exit(0);
	         }
	     }
	   }
	}
	



	
