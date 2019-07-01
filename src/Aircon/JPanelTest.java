package Aircon;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Aircon.JPanel01.MyActionListener;

//�����ư �����, 
//�µ��� ��ĭ�� �ø��� ������. (��ư����), 
//ī�巹�̾ƿ��� �Ἥ ��带 ����.���󺯰澲  (��ǳ, �ù�, ����, ���� ���  ī�巹�̾ƿ� ��ư������ �ٲ��), ����ڼ���(�����1, 2, 3),  

class JPanel00 extends JPanel implements ActionListener{
	JButton jButton1,jButton2;
	Button b1, b2, b3;
	Panel p, p1, p2, p3;
	CardLayout card;
	JPanelTest win;

	   public JPanel00(JPanelTest win) {
		   this.win = win;
//		   setLayout(null);

		      jButton1 = new JButton("Ȯ��");
		      jButton1.setSize(70, 20);
		      jButton1.setLocation(50, 210);
		      add(jButton1);
		      
		      jButton2 = new JButton("����");
		      jButton2.setSize(70, 20);
		      jButton2.setLocation(150, 210);
		      add(jButton2);
		   
		      jButton1.addActionListener(new MyActionListener());
		      jButton2.addActionListener(new MyActionListener1());
		      
		      
		   
		   
		   
		   
		   
//		      super("ī�巹�̾ƿ�");
			p1 = new Panel();
			p1.setBackground(Color.blue);
			p2 = new Panel();
			p2.setBackground(Color.red);
			p3 = new Panel();
			p3.setBackground(new Color(100, 200, 100));

			b1 = new Button("����1");
			b2 = new Button("����2");
			b3 = new Button("����3");

			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);

			p3.add(b3);
			p2.add(b2);
			p1.add(b1);

			card = new CardLayout(10, 10);
			setLayout(card);

			add(p3, "a3");
			add(p2, "a2");
			add(p1, "a1");
		   
		   
		   
		   
		   
	   }

//	   @Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("Ȯ��");
//			String str = e.getActionCommand();
//			if (str.equals("����1")) {
//				card.show(this, "a3");
//			} else if (str.equals("����2")) {
//				card.show(this, "a1");
//			} else if (str.equals("����3")) {
//				card.show(this, "a2");
//			}
//		}

	   class MyActionListener implements ActionListener {
		      @Override
		      public void actionPerformed(ActionEvent e) {
		         win.change("panel01");
		      }
		   }
		   class MyActionListener1 implements ActionListener {
			      @Override
			      public void actionPerformed(ActionEvent e) {
			          System.exit(0);//��������
			      }
			   }
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	   
	}

class JPanel01 extends JPanel {

   private JButton jButton1, jButton2;
   private JScrollPane jScrollPane1;
   private JTextArea jTextArea1;
   private JPanelTest win;

   public JPanel01(JPanelTest win) {
      this.win = win;
      setLayout(null);

      jButton1 = new JButton("Ȯ��");
      jButton1.setSize(70, 20);
      jButton1.setLocation(50, 210);
      add(jButton1);
      
      jButton2 = new JButton("����");
      jButton2.setSize(70, 20);
      jButton2.setLocation(150, 210);
      add(jButton2);
      
      
      
      jTextArea1 = new JTextArea("\n\n\n      ������ �µ��� �����Ͻ÷���, \n        'Ȯ��' ��ư�� �����ּ���.");

      jScrollPane1 = new JScrollPane(jTextArea1);
      jScrollPane1.setSize(200, 150);
      jScrollPane1.setLocation(40, 40);
      add(jScrollPane1);

      jButton1.addActionListener(new MyActionListener());
      jButton2.addActionListener(new MyActionListener1());
   }

   class MyActionListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         win.change("panel02");
      }
   }
   class MyActionListener1 implements ActionListener {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	          System.exit(0);//��������
	      }
	   }
}


class JPanel02 extends JPanel {

   private JTextField textField;
   private JPasswordField passwordField;
   private JPanelTest win;
   private JComboBox cb;
   private String []temp= {
         "             30��","             29��", "             28��", "             27��", "             26��", "             25��", "             24��","             23��","             22��","             21��","             20��","             19��","             18��"};
   
   public JPanel02(JPanelTest win) {
      setLayout(null);
      this.win=win;
      JLabel lblLbl=new JLabel("����µ�:");
      lblLbl.setBounds(31, 40, 67, 15);
      add(lblLbl);
      
      textField=new JTextField("             28��");
      textField.setBounds(123, 40, 116, 21);
      add(textField);
      textField.setColumns(10);
      
      JLabel lblLbl_1=new JLabel("����µ�:");
      lblLbl_1.setBounds(31, 84, 67, 15);
      add(lblLbl_1);
      
      cb=new JComboBox(temp);
      cb.setBounds(123, 84, 116, 21);
      add(cb);
      
      //�޺��ڽ� �� ��������
      String d= (String) cb.getSelectedItem();
        
      
//      passwordField=new JPasswordField();
//      passwordField.setBounds(123, 84, 116, 21);
//      add(passwordField);
      
      JButton btn=new JButton("����");
      btn.setSize(70, 20);
      btn.setLocation(90, 130);
      add(btn);
      btn.addActionListener(new MyActionListener());
   }
      class MyActionListener implements ActionListener  {

         @Override
         public void actionPerformed(ActionEvent e) {
            win.change("panel03");
         }
      }
   }

class JPanel03 extends JPanel {

   private JButton jButton1,jButton2;
   private JScrollPane jScrollPane1;
   private JTextArea jTextArea1;
   private JPanelTest win;

   public JPanel03(JPanelTest win) {
      this.win = win;
      setLayout(null);

      jButton1 = new JButton("Ȯ��");
      jButton1.setSize(70, 20);
      jButton1.setLocation(50, 210);
      add(jButton1);
      
      jButton2 = new JButton("���");
      jButton2.setSize(70, 20);
      jButton2.setLocation(150, 210);
      add(jButton2);

      jTextArea1 = new JTextArea("\n\n\n      ����µ� ������ �Ϸ�Ǿ����ϴ�. \n        'Ȯ��' ��ư�� �����ּ���.");

      jScrollPane1 = new JScrollPane(jTextArea1);
      jScrollPane1.setSize(200, 150);
      jScrollPane1.setLocation(40, 40);
      add(jScrollPane1);

      jButton1.addActionListener(new MyActionListener());
      jButton2.addActionListener(new MyActionListener1());
      
   }

   class MyActionListener implements ActionListener {

      @Override
      public void actionPerformed(ActionEvent e) {
         win.change("panel00");
      }
   }
   class MyActionListener1 implements ActionListener {

	      @Override
	      public void actionPerformed(ActionEvent e) {
	         win.change("panel02");
	      }
	   }
}


public class JPanelTest extends JFrame {

	public JPanel00 jPanel00 = null;
   public JPanel01 jPanel01 = null;
   public JPanel02 jPanel02 = null;
   public JPanel03 jPanel03 = null;

   public void change(String panelName) {

	   if (panelName.equals("panel00")) {
	         getContentPane().removeAll();
	         getContentPane().add(jPanel00);
	         revalidate();
	         repaint();
	   }else if (panelName.equals("panel01")) {
         getContentPane().removeAll();
         getContentPane().add(jPanel01);
         revalidate();
         repaint();
      } else if(panelName.equals("panel02")) {
         getContentPane().removeAll();
         getContentPane().add(jPanel02);
         revalidate();
         repaint();
      } else {
         getContentPane().removeAll();
         getContentPane().add(jPanel03);
         revalidate();
         repaint();
      }
   }

   public static void main(String[] args) {

	   
      JPanelTest win = new JPanelTest();

      win.setTitle("airConditioner");
      win.jPanel00 = new JPanel00(win);
      win.jPanel01 = new JPanel01(win);
      win.jPanel02 = new JPanel02(win);
      win.jPanel03 = new JPanel03(win);

      win.add(win.jPanel00);
      win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      win.setSize(300, 300);
      win.setVisible(true);
      win.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(1);// ��������
			}
		});
   }
}
