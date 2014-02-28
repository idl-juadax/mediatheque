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
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;



public class Inscription extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	
	public Inscription() {
		setTitle("M��diath��que - Inscription");
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (System.getProperty("os.name").contains("Mac")) {
			System.setProperty("apple.laf.useScreenMenuBar", "true");
		}
		/* GLOBAL */
		final int inset = 70;
		final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(screenSize.width/2 - 200, screenSize.height/2  - 300, 400, 600);
		setSize(400, 360);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
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
		
		JLabel lblConnexion = new JLabel("Formulaire d'inscription");
		panel_6.add(lblConnexion);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		
		JLabel lblNewLabel_2 = new JLabel("Adresse email");
		panel_4.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(20);
		panel.add(passwordField);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Mot de passe");
		panel_3.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(20);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblEmail = new JLabel("       Nom       ");
		panel_2.add(lblEmail);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(20);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNom = new JLabel("     Pr��nom     ");
		panel_1.add(lblNom);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(20);
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		
		JLabel lblCycle = new JLabel("        Cycle      ");
		panel_7.add(lblCycle);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"L1", "L2", "L3", "M1", "M2", "Enseignant", "Administrateur                            "}));
		comboBox.setSize(250, 30);
		panel.add(comboBox);
		setVisible(true);
	}
}