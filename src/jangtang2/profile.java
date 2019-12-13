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
	   
	   JButton search_1 = new JButton("검색");
	   JButton view_1 = new JButton("모두 조회");
	   JButton exit_1 = new JButton("종료");
	   
	   JPanel name_phone_addr = new JPanel();
	   JButton name = new JButton("이름");
	   
	   
	   JPanel txt = new JPanel();
	   JTextField nametxt = new JTextField("");
	   
	   HashMap<String, profile> pb =new HashMap<String, profile>();
	   ArrayList<String> delname = new ArrayList<String>();
	   
	   public MyFrame() {
	      setTitle("예명가수 프로필");
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
	 

	          pb.put("설아", new profile("설아", "김현정", 26, 165, "우주소녀", "starship", 2016));
	          pb.put("보나", new profile("보나", "김지연", 25, 163, "우주소녀", "starship", 2016));
	          pb.put("은서", new profile("은서", "손주연", 22, 170, "우주소녀", "starship", 2016));
	          pb.put("신비", new profile("신비", "황은비", 22, 166, "여자친구", "쏘스뮤직", 2015));
	          pb.put("은하", new profile("은하", "정은비", 23, 163, "여자친구", "쏘스뮤직", 2015));
	          pb.put("소원", new profile("소원", "김소정", 25, 173, "여자친구", "쏘스뮤직", 2015));
	          pb.put("아이유", new profile("아이유", "이지은", 27, 161, "없음", "카카오M", 2008));
	         
	             
	         
	         
	         if(b.getText().equals("검색")){
	            scrollpane.setText("");
	                  
	             
	             
	             profile searchname = pb.get(nametxt.getText());
	            
	                	   
	                	  
	             scrollpane.append("이름: "+ searchname.getname()+ "\n본명: "+searchname.getrealname()+"\n나이: "+searchname.getage()+"\n키: "+searchname.gethight()+"\n그룹: "+searchname.getgroup()+"\n소속사: "+searchname.getcomp()+"\n데뷔: "+searchname.getyear()+"\n");
	                   
	                
	             
	             nametxt.setText("");
	            
	             
	         }
	         else if(b.getText().equals("모두 조회")){
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
	         else if (b.getText().equals("종료")) {
	            System.exit(0);
	         }
	     }
	   }
	}
	



	
