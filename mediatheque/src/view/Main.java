package view;

import java.awt.EventQueue;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Connexion c = new Connexion();
					//Inscription i = new Inscription();
					/*
					Accueil a = new Accueil();
					Medias m = new Medias();
					Emprunt e = new Emprunt();
					*/
				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
		});

	}

}
