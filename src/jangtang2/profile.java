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
	   private String realname;
	   private int age;
	   private int hight;
	   private String group;
	   private String comp;
	   private int year;
	   public profile (String name, String realname, int age, int hight, String group, String comp, int year) {
	      this.name=name;
	      this.realname=realname;
	      this.age=age;
	      this.hight=hight;
	      this.group=group;
	      this.comp=comp;
	      this.year= year;
	   }
	   public String getname() {
		      return name;
		   }
	   public String getrealname() {
	      return realname;
	   }
	   public int getage() {
	      return age;
	   }
	   public int gethight() {
		      return hight;		
		   }
	   public String getgroup() {
		      return group;
		   }
	   public String getcomp() {
		      return comp;
		      }
	   public int getyear() {
		      return year;
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
	   
	   HashMap<String, profile> pb =new HashMap<String, profile>();
	   ArrayList<String> delname = new ArrayList<String>();
	   
	   public MyFrame() {
	      setTitle("������ ������");
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
	      
	      menu.add(view_1);
	      menu.add(search_1);
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
	 

	          pb.put("����", new profile("����", "������", 26, 165, "���ּҳ�", "starship", 2016));
	          pb.put("����", new profile("����", "������", 25, 163, "���ּҳ�", "starship", 2016));
	          pb.put("����", new profile("����", "���ֿ�", 22, 170, "���ּҳ�", "starship", 2016));
	          pb.put("�ź�", new profile("�ź�", "Ȳ����", 22, 166, "����ģ��", "�����", 2015));
	          pb.put("����", new profile("����", "������", 23, 163, "����ģ��", "�����", 2015));
	          pb.put("�ҿ�", new profile("�ҿ�", "�����", 25, 173, "����ģ��", "�����", 2015));
	          pb.put("������", new profile("������", "������", 27, 161, "����", "īī��M", 2008));
	         
	             
	         
	         
	         if(b.getText().equals("�˻�")){
	            scrollpane.setText("");
	                  
	             
	             
	             profile searchname = pb.get(nametxt.getText());
	            
	                	   
	                	  
	             scrollpane.append("�̸�: "+ searchname.getname()+ "\n����: "+searchname.getrealname()+"\n����: "+searchname.getage()+"\nŰ: "+searchname.gethight()+"\n�׷�: "+searchname.getgroup()+"\n�Ҽӻ�: "+searchname.getcomp()+"\n����: "+searchname.getyear()+"\n");
	                   
	                
	             
	             nametxt.setText("");
	            
	             
	         }
	         else if(b.getText().equals("��� ��ȸ")){
	            scrollpane.setText("");
	            
	            Set<String> Keys = pb.keySet();
	            Iterator<String> it = Keys.iterator();
	           
	                          
	            while(it.hasNext()){
	               String name = it.next();
	               profile searchname = pb.get(name);
	               scrollpane.append( searchname.getname()+"\n");
	               }
	            
	            nametxt.setText("");
	          
	         }
	         else if (b.getText().equals("����")) {
	            System.exit(0);
	         }
	     }
	   }
	}
	



	
