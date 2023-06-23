package Prog;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Experience extends JFrame {

	private JPanel contentPane;
	
	public Experience() {
		setTitle("Portfolio");
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Logo_Home.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(800, 550);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBackground(new Color(0, 0, 0));
		header.setBounds(0, 0, 784, 97);
		contentPane.add(header);
		header.setLayout(null);
		
		JLabel infoBtn = new JLabel();
		infoBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		infoBtn.setHorizontalAlignment(SwingConstants.CENTER);
		infoBtn.setIcon(new ImageIcon("src/user.png"));
		infoBtn.setBounds(21, 21, 32, 32);
		header.add(infoBtn);
		
		JLabel hobbiesBtn = new JLabel();
		hobbiesBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hobbiesBtn.setText("Hobbies");
		hobbiesBtn.setHorizontalAlignment(SwingConstants.CENTER);
		hobbiesBtn.setBounds(85, 30, 53, 18);
		hobbiesBtn.setFont(new Font("Garamond", Font.PLAIN, 14));
		hobbiesBtn.setForeground(new Color(255, 255, 255));
		header.add(hobbiesBtn);
		
		JLabel skillsBtn = new JLabel();
		skillsBtn.setText("Skill");
		skillsBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		skillsBtn.setForeground(new Color(255, 255, 255));
		skillsBtn.setFont(new Font("Garamond", Font.PLAIN, 14));
		skillsBtn.setHorizontalAlignment(SwingConstants.CENTER);
		skillsBtn.setBounds(158, 30, 33, 18);
		header.add(skillsBtn);
		
		JLabel experienceBtn = new JLabel();
		experienceBtn.setIcon(new ImageIcon("src/experience.png"));
		experienceBtn.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		experienceBtn.setForeground(new Color(255, 255, 255));
		experienceBtn.setHorizontalAlignment(SwingConstants.CENTER);
		experienceBtn.setFont(new Font("Garamond", Font.PLAIN, 14));
		experienceBtn.setBounds(210, 21, 32, 32);
		header.add(experienceBtn);
		
		JLabel mainBtn = new JLabel();
		mainBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mainBtn.setIcon(new ImageIcon("src/Logo_Home.png"));
		mainBtn.setHorizontalAlignment(SwingConstants.CENTER);
		mainBtn.setBounds(357, 12, 70, 72);
		header.add(mainBtn);
		
		JLabel backBtn = new JLabel();
		backBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backBtn.setIcon(new ImageIcon("src/logout.png"));
		backBtn.setHorizontalAlignment(SwingConstants.CENTER);
		backBtn.setBounds(742, 35, 24, 24);
		header.add(backBtn);
		
		JLabel prog1 = new JLabel();
		prog1.setIcon(new ImageIcon("src/prog1.png"));
		prog1.setBounds(54, 127, 217, 353);
		contentPane.add(prog1);
		
		JLabel prog2 = new JLabel();
		prog2.setIcon(new ImageIcon("src/prog2.png"));
		prog2.setBounds(304, 127, 210, 141);
		contentPane.add(prog2);
		
		JLabel prog2_1 = new JLabel();
		prog2_1.setIcon(new ImageIcon("src/prog3.png"));
		prog2_1.setBounds(320, 302, 176, 178);
		contentPane.add(prog2_1);
		
		JLabel prog2_1_1 = new JLabel();
		prog2_1_1.setIcon(new ImageIcon("src/prog4.png"));
		prog2_1_1.setBounds(552, 200, 195, 227);
		contentPane.add(prog2_1_1);
		
		JLabel txt = new JLabel();
		txt.setText("Term 2 Project for Mr. Elizer D. Ponio Jr.");
		txt.setForeground(new Color(255, 255, 255));
		txt.setFont(new Font("Garamond", Font.PLAIN, 24));
		txt.setBounds(54, 500, 435, 37);
		contentPane.add(txt);
		
		JLabel githubBtn = new JLabel();
		githubBtn.setIcon(new ImageIcon("src/github.png"));
		githubBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		githubBtn.setHorizontalAlignment(SwingConstants.CENTER);
		githubBtn.setBounds(734, 500, 32, 32);
		contentPane.add(githubBtn);
		
		infoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				infoBtnMouseClicked(evt);
			}
		});
		
		hobbiesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				hobbiesBtnMouseClicked(evt);
			}
		});
		
		skillsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				skillsBtnMouseClicked(evt);
			}
		});
		
		mainBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				mainBtnMouseClicked(evt);
			}
		});
		
		backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				backBtnMouseClicked(evt);
			}
		});
		
		githubBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				githubBtnMouseClicked(evt);
			}
		});
	}
	
	private void infoBtnMouseClicked (java.awt.event.MouseEvent evt) {
		Info info = new Info();
		info.setVisible(true);
		dispose();
	}
	
	private void hobbiesBtnMouseClicked (java.awt.event.MouseEvent evt) {
		Hobbies hobbies = new Hobbies();
		hobbies.setVisible(true);
		dispose();
	}
	
	private void skillsBtnMouseClicked (java.awt.event.MouseEvent evt) {
		Skills skills = new Skills();
		skills.setVisible(true);
		dispose();
	}
	
	private void mainBtnMouseClicked (java.awt.event.MouseEvent evt) {
		Main main = new Main();
		main.setVisible(true);
		dispose();
	}
	
	private void backBtnMouseClicked (java.awt.event.MouseEvent evt) {
		dispose();
	}
	
	private void githubBtnMouseClicked (java.awt.event.MouseEvent evt) {
	try{
		Desktop.getDesktop().browse(new URL ("https://github.com/Mariyangge/CCPRGG2L_PROJECT_INF225").toURI());
	}
	catch(Exception e)
	{}
	}
	
	public static void main (String [] args) {
		Experience frame = new Experience();
		frame.setVisible(true);
	}

}
