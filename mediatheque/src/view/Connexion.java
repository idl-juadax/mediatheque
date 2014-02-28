package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;



public class Connexion extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JTextField textField;
	
	public Connexion() {
		setTitle("Mediatheque - Accueil");
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (System.getProperty("os.name").contains("Mac")) {
			System.setProperty("apple.laf.useScreenMenuBar", "true");
		}
		/* GLOBAL */
		final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(screenSize.width/2 - 200, screenSize.height/2  - 180, 400, 360);
		setSize(400, 360);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		JSplitPane splitPane_1 = new JSplitPane();
		getContentPane().add(splitPane_1, BorderLayout.SOUTH);
		splitPane_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		splitPane_1.setDividerSize(0);
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		splitPane_2.setDividerSize(0);
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setRightComponent(splitPane_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 0, 1, 0, Color.BLACK));
		splitPane_2.setLeftComponent(panel_1);
		
		JLabel lblInscription = new JLabel("Inscription");
		panel_1.add(lblInscription);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(10, 0, 10, 0));
		splitPane_2.setRightComponent(panel_4);
		
		JButton btnJeMinscris = new JButton("Je m'inscris !");
		btnJeMinscris.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		
		btnJeMinscris.setMinimumSize(new Dimension(300,50));
		panel_4.add(btnJeMinscris);
		
		JSplitPane splitPane_3 = new JSplitPane();
		splitPane_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		splitPane_3.setDividerSize(0);
		splitPane_3.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setLeftComponent(splitPane_3);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 0, 0, 0));
		splitPane_3.setLeftComponent(panel);
		
		JLabel lblIdentifiant = new JLabel("  Identifiant  ");
		panel.add(lblIdentifiant);
		
		textField = new JTextField();
		textField.setToolTipText("Identifiant");
		panel.add(textField);
		textField.setColumns(20);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(0, 0, 5, 0));
		splitPane_3.setRightComponent(panel_3);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		panel_3.add(lblMotDePasse);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Mot de passe");
		passwordField.setColumns(20);
		panel_3.add(passwordField);
		
		JSplitPane splitPane_4 = new JSplitPane();
		getContentPane().add(splitPane_4, BorderLayout.NORTH);
		splitPane_4.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		splitPane_4.setDividerSize(0);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(0, 0, 0, 0));
		splitPane_4.setLeftComponent(panel_5);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("images/biblio_header.png"));
		panel_5.add(lblNewLabel);
		lblNewLabel.setBounds(0, 0, 270, 50); 

		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		splitPane_4.setRightComponent(panel_6);
		
		JLabel lblConnexion = new JLabel("Connexion");
		panel_6.add(lblConnexion);
		setVisible(true);
	}
}