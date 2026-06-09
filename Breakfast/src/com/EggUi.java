package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class EggUi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField eggcake;
	private JTextField lobo;
	private JTextField jaja;
	private JTextField kala;
	private JTextField toast;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EggUi frame = new EggUi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EggUi() {
		setTitle("/ 吳家早餐店點餐系統/");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 647);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 240));
		panel.setBounds(26, 131, 370, 379);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("蛋餅＄30");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1.setBounds(50, 41, 68, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("卡拉雞腿堡＄55");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(29, 255, 117, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("烤火腿蛋吐司＄40");
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(29, 321, 140, 24);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("蔥抓餅＄45");
		lblNewLabel_1_3.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(43, 185, 95, 24);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("蘿蔔糕＄35");
		lblNewLabel_1_4.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(43, 113, 95, 24);
		panel.add(lblNewLabel_1_4);
		
		
		
		eggcake = new JTextField();
		eggcake.setHorizontalAlignment(SwingConstants.CENTER);
		eggcake.setBounds(236, 40, 39, 25);
		panel.add(eggcake);
		eggcake.setColumns(10);
		
		
		
		
		
		lobo = new JTextField();
		lobo.setHorizontalAlignment(SwingConstants.CENTER);
		lobo.setColumns(10);
		lobo.setBounds(236, 116, 39, 25);
		panel.add(lobo);
		
		
		
		
		
		jaja = new JTextField();
		jaja.setHorizontalAlignment(SwingConstants.CENTER);
		jaja.setColumns(10);
		jaja.setBounds(236, 188, 39, 25);
		panel.add(jaja);
		
		
		
		
		
		kala = new JTextField();
		kala.setHorizontalAlignment(SwingConstants.CENTER);
		kala.setColumns(10);
		kala.setBounds(236, 258, 39, 25);
		panel.add(kala);
		
		
		
		
		
		toast = new JTextField();
		toast.setHorizontalAlignment(SwingConstants.CENTER);
		toast.setColumns(10);
		toast.setBounds(236, 324, 39, 25);
		panel.add(toast);
		
		
		
		JLabel lblNewLabel = new JLabel("吳家早餐店");
		lblNewLabel.setBackground(new Color(254, 199, 137));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 12, 739, 62);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_2 = new JLabel("姓名：");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2.setBounds(64, 84, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		name = new JTextField();
		name.setFont(new Font("Dialog", Font.BOLD, 14));
		name.setBounds(143, 79, 102, 28);
		contentPane.add(name);
		name.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 240));
		panel_1.setBounds(406, 133, 302, 108);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 250, 240));
		panel_2.setBounds(406, 251, 302, 259);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea out = new JTextArea();
		out.setFont(new Font("Dialog", Font.PLAIN, 13));
		out.setBounds(10, 10, 282, 241);
		panel_2.add(out);
		
		JLabel lblNewLabel_3 = new JLabel("?????");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(0, 52, 302, 56);
		panel_1.add(lblNewLabel_3);
		
		eggcake.setText("0");
		lobo.setText("0");
		jaja.setText("0");
		kala.setText("0");
		toast.setText("0");
		
		JLabel lblNewLabel_4 = new JLabel("<html>加入會員即享限定折扣<br>&emsp;天天陪你吃早餐！</html>");
		lblNewLabel_4.setForeground(new Color(255, 202, 136));
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(406, 67, 290, 56);
		contentPane.add(lblNewLabel_4);

		
		
		
		
/**********************************************event***************************************/
		//數量按鍵--->按下後蛋餅數量可右加左減
		JButton eggcakeMinus = new JButton("-");
		eggcakeMinus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				 int count = Integer.parseInt(eggcake.getText());

			        if(count > 0) {
			            eggcake.setText(String.valueOf(count - 1));
			        }
			}
		});
		eggcakeMinus.setFont(new Font("新細明體", Font.BOLD, 16));
		eggcakeMinus.setBounds(179, 39, 47, 26);
		panel.add(eggcakeMinus);
		
		JButton eggcakePlus = new JButton("+");
		eggcakePlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 int count = Integer.parseInt(eggcake.getText());

			        eggcake.setText(String.valueOf(count + 1));
			}
		});
		eggcakePlus.setFont(new Font("新細明體", Font.BOLD, 16));
		eggcakePlus.setBounds(285, 39, 47, 26);
		panel.add(eggcakePlus);
		
		//數量按鍵--->按下後蘿蔔糕數量可右加左減
		JButton loboMinus = new JButton("-");
		loboMinus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 int count = Integer.parseInt(lobo.getText());

			        if(count > 0) {
			            lobo.setText(String.valueOf(count - 1));
			        }
			}
		});
		loboMinus.setFont(new Font("新細明體", Font.BOLD, 16));
		loboMinus.setBounds(179, 115, 47, 26);
		panel.add(loboMinus);
		
		JButton loboPlus = new JButton("+");
		loboPlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 int count = Integer.parseInt(lobo.getText());

			        lobo.setText(String.valueOf(count + 1));
				
		
			}
		});
		loboPlus.setFont(new Font("新細明體", Font.BOLD, 16));
		loboPlus.setBounds(285, 115, 47, 26);
		panel.add(loboPlus);
		//數量按鍵--->按下後蔥抓餅數量可右加左減
		JButton jajaMinus = new JButton("-");
		jajaMinus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int count = Integer.parseInt(jaja.getText());

		        if(count > 0) {
		            jaja.setText(String.valueOf(count - 1));
		        }
			}
		});
		jajaMinus.setFont(new Font("新細明體", Font.BOLD, 16));
		jajaMinus.setBounds(179, 187, 47, 26);
		panel.add(jajaMinus);
		
		JButton jajaPlus = new JButton("+");
		jajaPlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int count = Integer.parseInt(jaja.getText());

		        jaja.setText(String.valueOf(count + 1));
			}
		});
		jajaPlus.setFont(new Font("新細明體", Font.BOLD, 16));
		jajaPlus.setBounds(285, 187, 47, 26);
		panel.add(jajaPlus);
		
		//數量按鍵--->按下後卡拉雞腿堡數量可右加左減 
		JButton kalaMinus = new JButton("-");
		kalaMinus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int count = Integer.parseInt(kala.getText());

		        if(count > 0) {
		            kala.setText(String.valueOf(count - 1));
		        }
			}
		});
		kalaMinus.setFont(new Font("新細明體", Font.BOLD, 16));
		kalaMinus.setBounds(179, 257, 47, 26);
		panel.add(kalaMinus);
		
		JButton kalaPlus = new JButton("+");
		kalaPlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int count = Integer.parseInt(kala.getText());

		        kala.setText(String.valueOf(count + 1));
			}
		});
		kalaPlus.setFont(new Font("新細明體", Font.BOLD, 16));
		kalaPlus.setBounds(285, 257, 47, 26);
		panel.add(kalaPlus);
		
		//數量按鍵--->按下後火腿烤土司數量可右加左減 
		JButton toastMinus = new JButton("-");
		toastMinus.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        int count = Integer.parseInt(toast.getText());

		        if(count > 0) {
		            toast.setText(String.valueOf(count - 1));
		        }
		    }
		});
		toastMinus.setFont(new Font("新細明體", Font.BOLD, 16));
		toastMinus.setBounds(179, 323, 47, 26);
		panel.add(toastMinus);
		
		JButton toastPlus = new JButton("+");
		toastPlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int count = Integer.parseInt(toast.getText());

		        toast.setText(String.valueOf(count + 1));
			}
		});
		toastPlus.setFont(new Font("新細明體", Font.BOLD, 16));
		toastPlus.setBounds(285, 323, 47, 26);
		panel.add(toastPlus);
			
		//會員9折
				JCheckBox chckbxNewCheckBox = new JCheckBox("會員9折");
				chckbxNewCheckBox.setFont(new Font("Dialog", Font.BOLD, 14));
				chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
				chckbxNewCheckBox.setBounds(300, 80, 96, 28);
				contentPane.add(chckbxNewCheckBox);
		//訂單明細顯示送單時間
		LocalDateTime nowTime = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String timeStr = nowTime.format(fmt);
		
		//送出訂單後顯示訂單內容和總金額
		JButton btnNewButton = new JButton("送出訂單");
		btnNewButton.setBackground(new Color(255, 181, 181));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//姓名不得空白提示視窗
				if(name.getText().trim().isEmpty())
				{
					javax.swing.JOptionPane.showMessageDialog(EggUi.this, "姓名不得空白 !");
					return;
				}
				
				
				String Name =name.getText();
				int Eggcake=Integer.parseInt(eggcake.getText());
				int Lobo=Integer.parseInt(lobo.getText());
				int Jaja=Integer.parseInt(jaja.getText());
				int Kala=Integer.parseInt(kala.getText());
				int Toast=Integer.parseInt(toast.getText());				
				
				
				Egg v=new Egg(Name,Eggcake,Lobo,Jaja,Kala,Toast);
				
				int sum = v.getSum();
				
				if(chckbxNewCheckBox.isSelected()) 
				{
				    sum=(int)Math.round(sum*0.9);
				}
				
				//訂單內容上只出現客人有點餐的項目
				String detail = "";
				
				if(v.getEggcake()>0)
				{
					detail +="蛋餅:"+v.getEggcake()+"\n";
				}
				if(v.getLobo()>0)
				{
					detail+="蘿蔔糕:"+v.getLobo()+"\n";
				}
				if(v.getJaja()>0)
				{
					detail+="蔥抓餅:"+v.getJaja()+"\n";
				}
				if(v.getKala()>0)
				{
					detail+="卡拉雞腿堡:"+v.getKala()+"\n";
				}
				if(v.getToast()>0)
				{
					detail+="烤火腿蛋吐司:"+v.getToast()+"\n";
				}
				
				out.setText( 
							"==============點餐明細===================\n"+
							"送單時間:"+timeStr+"\n"+
							"姓名："+v.getName()+"\n"+
							"========================================\n"+
							detail+
							"========================================\n"+
							"總金額："+sum+"元");
						
			}
		});
		btnNewButton.setBounds(306, 531, 125, 35);
		contentPane.add(btnNewButton);
		
		
		//清除按鍵
		JButton btnNewButton_1 = new JButton("清除");
		btnNewButton_1.setBackground(new Color(206, 231, 255));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
								name.setText("");
								eggcake.setText("0");
								lobo.setText("0");
								jaja.setText("0");
								kala.setText("0");
								toast.setText("0");
								out.setText("");	
								chckbxNewCheckBox.setSelected(false);
								lblNewLabel_3.setText("?????");
								
			}
		});
		btnNewButton_1.setBounds(85, 531, 130, 35);
		contentPane.add(btnNewButton_1);
				
		//離開按鍵
		JButton btnNewButton_3 = new JButton("離開");
		btnNewButton_3.setBackground(new Color(213, 213, 213));
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					System.exit(0);
			}
		});
		btnNewButton_3.setBounds(639, 563, 90, 35);
		contentPane.add(btnNewButton_3);
		
		
		//顯示時間
		JLabel time = new JLabel("New label");
		time.setFont(new Font("Dialog", Font.BOLD, 12));
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setBounds(530, 27, 143, 39);
		contentPane.add(time);
		
		DateTimeFormatter now=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		Timer timer = new Timer(1000,m ->time.setText(LocalDateTime.now().format(now)));
		timer.start();
		
		//今天吃什麼隨機按鍵
		JButton btnNewButton_4 = new JButton( "<html>選擇困難症患者<br>請幫我按下此鍵</html>");
		btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] foods= {"蛋餅", "蘿蔔糕","蔥抓餅","卡拉雞腿堡","烤火腿蛋吐司"};
				
				int n=(int)(Math.random()*foods.length);
				
				lblNewLabel_3.setText("今日推薦:"+foods[n]);
				
				
			}
		});
		btnNewButton_4.setBounds(65, 10, 167, 42);
		panel_1.add(btnNewButton_4);
		
		//列印明細
		
				JButton btnNewButton_2 = new JButton("列印明細");
				btnNewButton_2.setBackground(new Color(213, 255, 213));
				btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 12));
				btnNewButton_2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						try {
							out.print();
						} catch (PrinterException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
				});
				btnNewButton_2.setBounds(499, 531, 130, 35);
				contentPane.add(btnNewButton_2);
				
	
			}
}
	
	

