package Prog;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Skills extends JFrame {

	private JPanel contentPane;

	public Skills() {
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
		hobbiesBtn.setText("Hobbies");
		hobbiesBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hobbiesBtn.setForeground(new Color(255, 255, 255));
		hobbiesBtn.setFont(new Font("Garamond", Font.PLAIN, 14));
		hobbiesBtn.setHorizontalAlignment(SwingConstants.CENTER);
		hobbiesBtn.setBounds( 85, 30, 53, 18);
		header.add(hobbiesBtn);
		
		JLabel skillsBtn = new JLabel();
		skillsBtn.setIcon(new ImageIcon("src/skills.png"));
		skillsBtn.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		skillsBtn.setHorizontalAlignment(SwingConstants.CENTER);
		skillsBtn.setBounds(158, 21, 32, 32);
		header.add(skillsBtn);
		
		JLabel experienceBtn = new JLabel();
		experienceBtn.setText("Experience");
		experienceBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		experienceBtn.setForeground(new Color(255, 255, 255));
		experienceBtn.setHorizontalAlignment(SwingConstants.CENTER);
		experienceBtn.setFont(new Font("Garamond", Font.PLAIN, 14));
		experienceBtn.setBounds(210, 30, 67, 18);
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
		
		JLabel profile = new JLabel();
		profile.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		profile.setIcon(new ImageIcon("src/profile2.png"));
		profile.setHorizontalAlignment(SwingConstants.CENTER);
		profile.setBounds(31, 149, 81, 81);
		contentPane.add(profile);
		
		JLabel quote = new JLabel();
		quote.setForeground(new Color(255, 255, 255));
		quote.setText("<HTML>As an art Enthusiast, my sense of aesthetic has been constantly developing. I also have the basic skills in using the following softwares that can make me improve my knowledge and skill capacity in the future.</HTML>");
		quote.setBounds(138, 149, 639, 81);
		quote.setFont(new Font("Garamond", Font.PLAIN, 20));
		contentPane.add(quote);
		
		PanelRound other = new PanelRound();
		other.setBackground(new Color(70, 60, 47));
		other.setRoundTopRight(100);
		other.setRoundTopLeft(100);
		other.setRoundBottomRight(100);
		other.setRoundBottomLeft(100);
		other.setBounds(0, 264, 784, 123);
		contentPane.add(other);
		other.setLayout(null);
		
		JLabel canvaLogo = new JLabel();
		canvaLogo.setIcon(new ImageIcon("src/canva.png"));
		canvaLogo.setBounds(111, 20, 75, 75);
		other.add(canvaLogo);
		
		JLabel sketchupLogo = new JLabel();
		sketchupLogo.setIcon(new ImageIcon("src/sketchup.png"));
		sketchupLogo.setBounds(276, 20, 69, 75);
		other.add(sketchupLogo);
		
		JLabel figmaLogo = new JLabel();
		figmaLogo.setIcon(new ImageIcon("src/figma.png"));
		figmaLogo.setBounds(438, 20, 63, 75);
		other.add(figmaLogo);
		
		JLabel clipLogo = new JLabel();
		clipLogo.setIcon(new ImageIcon("src/clipstudio.png"));
		clipLogo.setBounds(594, 20, 75, 75);
		other.add(clipLogo);
		
		JLabel canva = new JLabel();
		canva.setForeground(new Color(255, 255, 255));
		canva.setHorizontalAlignment(SwingConstants.CENTER);
		canva.setFont(new Font("Garamond", Font.PLAIN, 16));
		canva.setText("Canva");
		canva.setBounds(121, 85, 50, 50);
		other.add(canva);
		
		JLabel sketchup = new JLabel();
		sketchup.setForeground(new Color(255, 255, 255));
		sketchup.setHorizontalAlignment(SwingConstants.CENTER);
		sketchup.setFont(new Font("Garamond", Font.PLAIN, 16));
		sketchup.setText("Sketchup");
		sketchup.setBounds(276, 85, 69, 50);
		other.add(sketchup);
		
		JLabel figma = new JLabel();
		figma.setText("Figma");
		figma.setHorizontalAlignment(SwingConstants.CENTER);
		figma.setForeground(Color.WHITE);
		figma.setFont(new Font("Garamond", Font.PLAIN, 16));
		figma.setBounds(438, 85, 63, 50);
		other.add(figma);
		
		JLabel clip = new JLabel();
		clip.setText("Clip Studio");
		clip.setHorizontalAlignment(SwingConstants.CENTER);
		clip.setForeground(Color.WHITE);
		clip.setFont(new Font("Garamond", Font.PLAIN, 16));
		clip.setBounds(594, 85, 75, 50);
		other.add(clip);
		
		JLabel SoftSkills = new JLabel();
		SoftSkills.setText("Soft Skills:");
		SoftSkills.setForeground(Color.WHITE);
		SoftSkills.setFont(new Font("Garamond", Font.PLAIN, 20));
		SoftSkills.setBounds(52, 400, 90, 24);
		contentPane.add(SoftSkills);
		
		JLabel Skills = new JLabel();
		Skills.setText("Good at Communication");
		Skills.setForeground(Color.WHITE);
		Skills.setFont(new Font("Garamond", Font.PLAIN, 16));
		Skills.setBounds(52, 435, 203, 40);
		contentPane.add(Skills);
		
		JLabel lblAdapatible = new JLabel();
		lblAdapatible.setText("Adapatible");
		lblAdapatible.setForeground(Color.WHITE);
		lblAdapatible.setFont(new Font("Garamond", Font.PLAIN, 16));
		lblAdapatible.setBounds(52, 458, 203, 40);
		contentPane.add(lblAdapatible);
		
		JLabel lblCreativity = new JLabel();
		lblCreativity.setText("Creativity");
		lblCreativity.setForeground(Color.WHITE);
		lblCreativity.setFont(new Font("Garamond", Font.PLAIN, 16));
		lblCreativity.setBounds(52, 480, 203, 40);
		contentPane.add(lblCreativity);
		
		JLabel lblPersuasion = new JLabel();
		lblPersuasion.setText("Persuasion");
		lblPersuasion.setForeground(Color.WHITE);
		lblPersuasion.setFont(new Font("Garamond", Font.PLAIN, 16));
		lblPersuasion.setBounds(52, 503, 203, 40);
		contentPane.add(lblPersuasion);
		
		JLabel lblConflictManagement = new JLabel();
		lblConflictManagement.setText("Conflict Management");
		lblConflictManagement.setForeground(Color.WHITE);
		lblConflictManagement.setFont(new Font("Garamond", Font.PLAIN, 16));
		lblConflictManagement.setBounds(453, 435, 203, 40);
		contentPane.add(lblConflictManagement);
		
		JLabel lblResourcefulness = new JLabel();
		lblResourcefulness.setText("Resourcefulness");
		lblResourcefulness.setForeground(Color.WHITE);
		lblResourcefulness.setFont(new Font("Garamond", Font.PLAIN, 16));
		lblResourcefulness.setBounds(453, 458, 203, 40);
		contentPane.add(lblResourcefulness);
		
		JLabel lblDecisionmaking = new JLabel();
		lblDecisionmaking.setText("Decision-Making");
		lblDecisionmaking.setForeground(Color.WHITE);
		lblDecisionmaking.setFont(new Font("Garamond", Font.PLAIN, 16));
		lblDecisionmaking.setBounds(453, 480, 203, 40);
		contentPane.add(lblDecisionmaking);
		
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
		
		experienceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				experienceBtnMouseClicked(evt);
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
	}
	
	private void infoBtnMouseClicked(java.awt.event.MouseEvent evt) {
		Info info = new Info();
		info.setVisible(true);
		dispose();
	}
	
	private void hobbiesBtnMouseClicked(java.awt.event.MouseEvent evt) {
		Hobbies hobbies = new Hobbies();
		hobbies.setVisible(true);
		dispose();
	}
	
	private void experienceBtnMouseClicked(java.awt.event.MouseEvent evt) {
		Experience experience = new Experience();
		experience.setVisible(true);
		dispose();
	}
	
	private void mainBtnMouseClicked(java.awt.event.MouseEvent evt) {
		Main main = new Main();
		main.setVisible(true);
		dispose();
	}
	
	private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {
		dispose();
	} 
	
	public static void main(String [] args) {
		Skills frame = new Skills();
		frame.setVisible(true);
	}
}
