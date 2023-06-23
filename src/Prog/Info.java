package Prog;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.ScrollPaneConstants;
import java.awt.Cursor;

public class Info extends JFrame {

	private JPanel contentPane;
	BasicInfo info = new BasicInfo();
	
	public Info() {
		setTitle("Portfolio");
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Logo_Home.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel icon = new JLabel();
		icon.setHorizontalAlignment(SwingConstants.CENTER);
		icon.setIcon(new ImageIcon("src/profile.png"));
		icon.setBounds(327, 11, 129, 126);
		
		JLabel backBtn = new JLabel();
		backBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backBtn.setIcon(new ImageIcon("src/logout.png"));
		backBtn.setHorizontalAlignment(SwingConstants.CENTER);
		backBtn.setBounds(731, 11, 24, 24);
		
		//Basic Info
		
		JLabel labelbi = new JLabel();
		labelbi.setText("Basic Information:");
		labelbi.setFont(new Font("Garamond", Font.BOLD, 24));
		labelbi.setForeground(Color.white);
		labelbi.setBounds(42, 150, 192, 33);
		
		JLabel lblnm = new JLabel();
		lblnm.setText("Name:");
		lblnm.setFont(new Font("Garamond", Font.PLAIN, 15));
		lblnm.setForeground(new Color(255, 255, 255));
		lblnm.setBounds(42, 250, 41, 20);
		
		JLabel labelname = new JLabel();
		labelname.setText(info.Name);
		labelname.setFont(new Font("Garamond", Font.PLAIN, 20));
		labelname.setForeground(new Color(255, 255, 255));
		labelname.setBounds(256, 250, 272, 14);
		
		JLabel lblbd = new JLabel();
		lblbd.setText("Birthday:");
		lblbd.setFont(new Font("Garamond", Font.PLAIN, 15));
		lblbd.setForeground(new Color(255, 255, 255));
		lblbd.setBounds(42, 300, 51, 20);
		
		JLabel labelbirthday = new JLabel();
		labelbirthday.setText(info.Birthday);
		labelbirthday.setFont(new Font("Garamond", Font.PLAIN, 20));
		labelbirthday.setForeground(new Color(255, 255, 255));
		labelbirthday.setBounds(318, 300, 147, 14);
		
		JLabel lblad = new JLabel();
		lblad.setText("Address:");
		lblad.setFont(new Font("Garamond", Font.PLAIN, 15));
		lblad.setForeground(new Color(255, 255, 255));
		lblad.setBounds(42, 350, 51, 20);
		
		JLabel labeladdress = new JLabel();
		labeladdress.setText(info.Address);
		labeladdress.setFont(new Font("Garamond", Font.PLAIN, 20));
		labeladdress.setForeground(new Color(255, 255, 255));
		labeladdress.setBounds(196, 350, 391, 20);
		
		JLabel lblgen = new JLabel();
		lblgen.setText("Gender:");
		lblgen.setFont(new Font("Garamond", Font.PLAIN, 15));
		lblgen.setForeground(new Color(255, 255, 255));
		lblgen.setBounds(42, 400, 51, 20);
		
		JLabel labelgender = new JLabel();
		labelgender.setText(info.Gender);
		labelgender.setFont(new Font("Garamond", Font.PLAIN, 20));
		labelgender.setForeground(new Color(255, 255, 255));
		labelgender.setBounds(364, 400, 55, 14);
		
		JLabel lblcs = new JLabel();
		lblcs.setText("Civil Status:");
		lblcs.setFont(new Font("Garamond", Font.PLAIN, 15));
		lblcs.setForeground(new Color(255, 255, 255));
		lblcs.setBounds(42, 450, 69, 20);
		
		JLabel labelcivil = new JLabel();
		labelcivil.setText(info.CivilStats);
		labelcivil.setFont(new Font("Garamond", Font.PLAIN, 20));
		labelcivil.setForeground(new Color(255, 255, 255));
		labelcivil.setBounds(368, 450, 51, 14);
		
		JLabel lblcit = new JLabel();
		lblcit.setText("Citizenship:");
		lblcit.setFont(new Font("Garamond", Font.PLAIN, 15));
		lblcit.setForeground(new Color(255, 255, 255));
		lblcit.setBounds(42, 500, 69, 20);
		
		JLabel labelcitizen = new JLabel();
		labelcitizen.setText(info.Citizen);
		labelcitizen.setFont(new Font("Garamond", Font.PLAIN, 20));
		labelcitizen.setForeground(new Color(255, 255, 255));
		labelcitizen.setBounds(361, 500, 61, 20);
		
		//Education
		
		JLabel labeleduc = new JLabel();
		labeleduc.setText("Education:");
		labeleduc.setFont(new Font("Garamond", Font.BOLD, 24));
		labeleduc.setForeground(Color.white);
		labeleduc.setBounds(42, 600, 124, 33);
		
		//UE
		
		JLabel labelueicon = new JLabel();
		labelueicon.setHorizontalAlignment(SwingConstants.CENTER);
		labelueicon.setIcon(new ImageIcon("src/ue.png"));
		labelueicon.setBounds(150, 670, 167, 167);
		
		JLabel lblue = new JLabel();
		lblue.setText(info.UE);
		lblue.setFont(new Font("Garamond", Font.BOLD, 17));
		lblue.setForeground(new Color(255, 255, 255));
		lblue.setBounds(42, 860, 227, 20);
		
		JLabel lbljhs = new JLabel();
		lbljhs.setText(info.jhs);
		lbljhs.setFont(new Font("Garamond", Font.BOLD, 15));
		lbljhs.setForeground(new Color(255, 255, 255));
		lbljhs.setBounds(42, 890, 124, 20);
		
		JLabel lblyjhs = new JLabel();
		lblyjhs.setText(info.yearjhs);
		lblyjhs.setFont(new Font("Garamond", Font.PLAIN, 15));
		lblyjhs.setForeground(new Color(255, 255, 255));
		lblyjhs.setBounds(42, 910, 69, 20);
		
		JLabel lblshs = new JLabel();
		lblshs.setText(info.shs);
		lblshs.setFont(new Font("Garamond", Font.BOLD, 15));
		lblshs.setForeground(new Color(255, 255, 255));
		lblshs.setBounds(42, 930, 167, 20);
		
		JLabel lblyshs = new JLabel();
		lblyshs.setText(info.yearshs);
		lblyshs.setFont(new Font("Garamond", Font.PLAIN, 15));
		lblyshs.setForeground(new Color(255, 255, 255));
		lblyshs.setBounds(42, 950, 69, 20);
		
		//NU
		
		JLabel labelnuicon = new JLabel();
		labelnuicon.setHorizontalAlignment(SwingConstants.CENTER);
		labelnuicon.setIcon(new ImageIcon("src/nu.png"));
		labelnuicon.setBounds(450, 670, 167, 167);
		
		JLabel lblnu = new JLabel();
		lblnu.setText(info.NU);
		lblnu.setFont(new Font("Garamond", Font.BOLD, 17));
		lblnu.setForeground(new Color(255, 255, 255));
		lblnu.setBounds(406, 860, 227, 20);
		
		JLabel lblar = new JLabel();
		lblar.setText(info.archi);
		lblar.setFont(new Font("Garamond", Font.BOLD, 15));
		lblar.setForeground(new Color(255, 255, 255));
		lblar.setBounds(406, 890, 171, 20);
		
		JLabel lblaryr = new JLabel();
		lblaryr.setText(info.archiyear);
		lblaryr.setFont(new Font("Garamond", Font.PLAIN, 15));
		lblaryr.setForeground(new Color(255, 255, 255));
		lblaryr.setBounds(406, 910, 69, 20);
		
		JLabel lblit = new JLabel();
		lblit.setText(info.it);
		lblit.setFont(new Font("Garamond", Font.BOLD, 15));
		lblit.setForeground(new Color(255, 255, 255));
		lblit.setBounds(406, 930, 167, 20);
		
		JLabel lblityr = new JLabel();
		lblityr.setText(info.ityear);
		lblityr.setFont(new Font("Garamond", Font.PLAIN, 15));
		lblityr.setForeground(new Color(255, 255, 255));
		lblityr.setBounds(406, 950, 80, 20);	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 0, 800, 600);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(784, 1000));
		panel.setBackground(new Color(0, 0, 0));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		//basic info panel
		panel.add(icon);
		panel.add(backBtn);
		
		panel.add(labelbi);
		panel.add(labelname);
		panel.add(labelbirthday);
		panel.add(labeladdress);
		panel.add(labelgender);
		panel.add(labelcivil);
		panel.add(labelcitizen);
		panel.add(lblnm);
		panel.add(lblbd);
		panel.add(lblad);
		panel.add(lblgen);
		panel.add(lblcs);
		panel.add(lblcit);
		
		//education
		panel.add(labeleduc);
		
		//UE
		panel.add(labelueicon);
		panel.add(lblue);
		panel.add(lbljhs);
		panel.add(lblyjhs);
		panel.add(lblshs);
		panel.add(lblyshs);
		
		//NU
		panel.add(labelnuicon); 
		panel.add(lblnu);
		panel.add(lblar);
		panel.add(lblaryr);
		panel.add(lblit);
		panel.add(lblityr);
		
		backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				backBtnMouseClicked(evt);
			}
		});
		
	}
	
	private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {
		Main main = new Main();
		main.setVisible(true);
		dispose();
	}
	
	public static void main(String[] args) {
		Info frame = new Info();
		frame.setVisible(true);
	}
}