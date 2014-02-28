package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import model.UserModel;
import controller.UserController;



public class Connexion extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JTextField textField;
	private JLabel LblInscription;
	private JLabel lblLabelResultConnexion;
	
	private UserController userController = new UserController();
	
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
		setBounds(screenSize.width/2 - 200, screenSize.height/2  - 180, 400, 400);
		setSize(400, 400);
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
		btnJeMinscris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String message = userController.inscription(textField.getText(), passwordField.getText());
				LblInscription.setText(message);
			}
		});
		btnJeMinscris.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		
		btnJeMinscris.setMinimumSize(new Dimension(300,50));
		panel_4.add(btnJeMinscris);
		
		LblInscription = new JLabel("");
		panel_4.add(LblInscription);
		
		JSplitPane splitPane_3 = new JSplitPane();
		splitPane_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		splitPane_3.setDividerSize(0);
		splitPane_3.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setLeftComponent(splitPane_3);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 0, 0, 0));
		splitPane_3.setLeftComponent(panel);
		
		JLabel lblIdentifiant = new JLabel("   Email   ");
		panel.add(lblIdentifiant);
		
		textField = new JTextField();
		textField.setToolTipText("Identifiant");
		panel.add(textField);
		textField.setColumns(20);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);

		splitPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		splitPane.setDividerSize(0);
		
		
		splitPane_3.setRightComponent(splitPane);
		
		JSplitPane splitPane_5 = new JSplitPane();
		splitPane_5.setOrientation(JSplitPane.VERTICAL_SPLIT);

		splitPane_5.setBorder(new EmptyBorder(0, 0, 0, 0));
		splitPane_5.setDividerSize(0);
		splitPane.setRightComponent(splitPane_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		splitPane_5.setLeftComponent(panel_3);
	
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EmptyBorder(0, 0, 0, 0));
		splitPane_5.setRightComponent(panel_7);
		
		lblLabelResultConnexion = new JLabel("");
		panel_7.add(lblLabelResultConnexion);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		splitPane.setLeftComponent(panel_2);
		
		JSplitPane splitPane_4 = new JSplitPane();
		getContentPane().add(splitPane_4, BorderLayout.NORTH);
		splitPane_4.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		splitPane_4.setDividerSize(0);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(0, 0, 0, 0));
		splitPane_4.setLeftComponent(panel_5);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("img/biblio_header.png"));
		panel_5.add(lblNewLabel);
		lblNewLabel.setBounds(0, 0, 270, 50); 

		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		splitPane_4.setRightComponent(panel_6);
		
		JLabel lblConnexion = new JLabel("Connexion");
		panel_6.add(lblConnexion);
		setVisible(true);
		

		JLabel lblMotDePasse = new JLabel("Mot de passe");
		panel_2.add(lblMotDePasse);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Mot de passe");
		passwordField.setColumns(20);
		panel_2.add(passwordField);
		
		
		JButton btnNewButton = new JButton("Connexion");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserModel user = userController.connexion(textField.getText(), passwordField.getText());
				if(user == null)
					lblLabelResultConnexion.setText("Mauvais identifiants / mot de passe");
				else
					lblLabelResultConnexion.setText("Connexion réussie");
			}
		});
		panel_3.add(btnNewButton);
	}
}