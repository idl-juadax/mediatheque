package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Accueil extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTable table_1;

	public Accueil() {
		setTitle("Médiathèque - Tableau de bord");
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
		setBounds(screenSize.width/2 - 200, screenSize.height/2  - 300, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane.setRightComponent(splitPane_1);
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setLeftComponent(splitPane_2);
		
		JLabel lblUtilisateurs = new JLabel("Utilisateurs");
		splitPane_2.setLeftComponent(lblUtilisateurs);
		
		table = new JTable();
		splitPane_2.setRightComponent(table);
		
		JSplitPane splitPane_3 = new JSplitPane();
		splitPane_3.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setRightComponent(splitPane_3);
		
		JLabel lblEmprunts = new JLabel("Emprunts");
		splitPane_3.setLeftComponent(lblEmprunts);
		
		table_1 = new JTable();
		splitPane_3.setRightComponent(table_1);
		
		JLabel lblBonjourJulien = new JLabel("Bonjour Julien !");
		splitPane.setLeftComponent(lblBonjourJulien);
		setVisible(true);
	}
}
