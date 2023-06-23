package Prog;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JScrollPane;
import java.awt.Cursor;

public class Hobbies extends JFrame {

	private JPanel contentPane;

	public Hobbies() {
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
		hobbiesBtn.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		hobbiesBtn.setIcon(new ImageIcon("src/hobbies_logo.png"));
		hobbiesBtn.setHorizontalAlignment(SwingConstants.CENTER);
		hobbiesBtn.setBounds(95, 21, 32, 32);
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
		
		JLabel ImageLogo = new JLabel();
		ImageLogo.setIcon(new ImageIcon("src/baguio.png"));
		ImageLogo.setBounds(0, 0, 784, 161);
		
		JLabel lblQuote = new JLabel();
		lblQuote.setText("<HTML>As someone who likes exploring and always being eaten by curiosity. I live an adventurous life before the pandemic, My family also loves to go out on vacations that created an adventurous side to my personality.</HTML>");
		lblQuote.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblQuote.setForeground(new Color(255, 255, 255));
		lblQuote.setBounds(32, 178, 719, 107);	
		
		JLabel lblTravel = new JLabel();
		lblTravel.setIcon(new ImageIcon("src/traveling.png"));
		lblTravel.setBounds(11, 285, 243, 243);	
		
		JLabel lblDiving = new JLabel();
		lblDiving.setIcon(new ImageIcon("src/diving.png"));
		lblDiving.setBounds(270, 285, 243, 243);	
		
		JLabel lblHiking = new JLabel();
		lblHiking.setIcon(new ImageIcon("src/hiking.png"));
		lblHiking.setBounds(531, 285, 243, 243);	
		
		JLabel lblTxtTraveling = new JLabel();
		lblTxtTraveling.setText("Traveling");
		lblTxtTraveling.setHorizontalAlignment(SwingConstants.CENTER);
		lblTxtTraveling.setForeground(Color.WHITE);
		lblTxtTraveling.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblTxtTraveling.setBounds(80, 544, 104, 25);	
		
		JLabel lblTxtDiving = new JLabel();
		lblTxtDiving.setText("Diving");
		lblTxtDiving.setHorizontalAlignment(SwingConstants.CENTER);
		lblTxtDiving.setForeground(Color.WHITE);
		lblTxtDiving.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblTxtDiving.setBounds(340, 544, 104, 25);	
		
		JLabel lblTxtHiking = new JLabel();
		lblTxtHiking.setText("Hiking");
		lblTxtHiking.setHorizontalAlignment(SwingConstants.CENTER);
		lblTxtHiking.setForeground(Color.WHITE);
		lblTxtHiking.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblTxtHiking.setBounds(600, 544, 104, 25);	
		
		JPanel otherPanel = new JPanel();
		otherPanel.setBackground(new Color(70, 60, 47));
		otherPanel.setBounds(0, 609, 784, 230);
		otherPanel.setLayout(null);
		
		JLabel lblOtherHobbies = new JLabel();
		lblOtherHobbies.setText("Other Hobbies:");
		lblOtherHobbies.setBounds(310, 21, 163, 28);
		lblOtherHobbies.setHorizontalAlignment(SwingConstants.CENTER);
		lblOtherHobbies.setForeground(Color.WHITE);
		lblOtherHobbies.setFont(new Font("Garamond", Font.BOLD | Font.ITALIC, 24));
		otherPanel.add(lblOtherHobbies);
		
		JLabel lblWatching = new JLabel();
		lblWatching.setText("Watching Movies");
		lblWatching.setHorizontalAlignment(SwingConstants.LEFT);
		lblWatching.setForeground(Color.WHITE);
		lblWatching.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblWatching.setBounds(57, 73, 384, 28);
		otherPanel.add(lblWatching);
		
		JLabel lblPainting = new JLabel();
		lblPainting.setText("Painting");
		lblPainting.setHorizontalAlignment(SwingConstants.LEFT);
		lblPainting.setForeground(Color.WHITE);
		lblPainting.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblPainting.setBounds(57, 122, 129, 28);
		otherPanel.add(lblPainting);
		
		JLabel lblDrawing = new JLabel();
		lblDrawing.setText("Drawing");
		lblDrawing.setHorizontalAlignment(SwingConstants.LEFT);
		lblDrawing.setForeground(Color.WHITE);
		lblDrawing.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblDrawing.setBounds(57, 170, 221, 28);
		otherPanel.add(lblDrawing);
		
		JLabel lblSocializing = new JLabel();
		lblSocializing.setText("Socializing");
		lblSocializing.setHorizontalAlignment(SwingConstants.LEFT);
		lblSocializing.setForeground(Color.WHITE);
		lblSocializing.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblSocializing.setBounds(497, 73, 163, 28);
		otherPanel.add(lblSocializing);
		
		JLabel lblReading = new JLabel();
		lblReading.setText("Reading");
		lblReading.setHorizontalAlignment(SwingConstants.LEFT);
		lblReading.setForeground(Color.WHITE);
		lblReading.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblReading.setBounds(497, 122, 163, 28);
		otherPanel.add(lblReading);
		
		JLabel lblOnlineGames = new JLabel();
		lblOnlineGames.setText("Online Games");
		lblOnlineGames.setHorizontalAlignment(SwingConstants.LEFT);
		lblOnlineGames.setForeground(Color.WHITE);
		lblOnlineGames.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblOnlineGames.setBounds(497, 170, 163, 28);
		otherPanel.add(lblOnlineGames);
		
		JLabel lblOnlineGamesI = new JLabel();
		lblOnlineGamesI.setText("Online Games I play:");
		lblOnlineGamesI.setHorizontalAlignment(SwingConstants.LEFT);
		lblOnlineGamesI.setForeground(Color.WHITE);
		lblOnlineGamesI.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblOnlineGamesI.setBounds(11, 850, 228, 28);	
		
		JLabel lblGenshinLogo = new JLabel();
		lblGenshinLogo.setIcon(new ImageIcon("src/genshin.png"));
		lblGenshinLogo.setBounds(20, 900, 150, 150);		
		
		JLabel lblLeagueLogo = new JLabel();
		lblLeagueLogo.setIcon(new ImageIcon("src/league.png"));
		lblLeagueLogo.setBounds(230, 889, 150, 150);		
		
		JLabel lblValorantLogo = new JLabel();
		lblValorantLogo.setIcon(new ImageIcon("src/valo.png"));
		lblValorantLogo.setBounds(430, 889, 150, 150);	
		
		JLabel lblZomboidLogo = new JLabel();
		lblZomboidLogo.setIcon(new ImageIcon("src/zomboid.png"));
		lblZomboidLogo.setBounds(600, 889, 150, 150);
			
		JLabel lblGenshin = new JLabel();
		lblGenshin.setText("Genshin Impact");
		lblGenshin.setHorizontalAlignment(SwingConstants.LEFT);
		lblGenshin.setForeground(Color.WHITE);
		lblGenshin.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblGenshin.setBounds(20, 1070, 228, 28);
		
		JLabel lblLeague = new JLabel();
		lblLeague.setText("League of Legends");
		lblLeague.setHorizontalAlignment(SwingConstants.LEFT);
		lblLeague.setForeground(Color.WHITE);
		lblLeague.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblLeague.setBounds(210, 1070, 228, 28);
		
		JLabel lblValorant = new JLabel();
		lblValorant.setText("Valorant");
		lblValorant.setHorizontalAlignment(SwingConstants.LEFT);
		lblValorant.setForeground(Color.WHITE);
		lblValorant.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblValorant.setBounds(460, 1070, 228, 28);
		
		JLabel lblPZ = new JLabel();
		lblPZ.setText("Project Zomboid");
		lblPZ.setHorizontalAlignment(SwingConstants.LEFT);
		lblPZ.setForeground(Color.WHITE);
		lblPZ.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblPZ.setBounds(590, 1070, 228, 28);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 96, 800, 550);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(784, 1155));
		panel.setBackground(new Color(0, 0, 0));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);	
		
		panel.add(ImageLogo);
		panel.add(lblQuote);
		panel.add(lblTravel);
		panel.add(lblDiving);
		panel.add(lblHiking);
		panel.add(lblTxtTraveling);
		panel.add(lblTxtDiving);
		panel.add(lblTxtHiking);
		panel.add(otherPanel);
		panel.add(lblOnlineGamesI);
		panel.add(lblGenshinLogo);
		panel.add(lblLeagueLogo);
		panel.add(lblValorantLogo);
		panel.add(lblZomboidLogo);
		panel.add(lblGenshin);
		panel.add(lblLeague);
		panel.add(lblValorant);
		panel.add(lblPZ);
		
		infoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				infoBtnMouseClicked(evt);
			}
		});
		
		skillsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				skillsBtnMouseClicked(evt);
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
	
	private void skillsBtnMouseClicked(java.awt.event.MouseEvent evt) {
		Skills skills = new Skills();
		skills.setVisible(true);
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
	
	public static void main (String [] args) {
		new Hobbies().setVisible(true);
	}
}
