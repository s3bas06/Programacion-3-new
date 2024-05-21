package controllers;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import views.AuthView;

public class AuthController {
	JFrame frame;
	AuthView view = new AuthView();
	
	public AuthController() {
		frame = new JFrame();
		frame.setVisible(false);
		frame.setTitle("Programa");
		frame.setBounds(100, 100, 605, 719);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void login() {
		frame.add(view.login(), BorderLayout.CENTER);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
	
}
