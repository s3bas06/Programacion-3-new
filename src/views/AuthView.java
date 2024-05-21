package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import models.AuthModel;


public class AuthView {
	JPanel panel;
	AuthModel model;
	
	public AuthView() {
		panel = new JPanel();
		model = new AuthModel();
	}
	
	public JPanel login() {
		//Disenio del login
		
		panel.setBackground(new Color(83, 83, 83));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(190, 69, 202, 40);
		panel.add(lblNewLabel);
		
		JTextField textField;
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(141, 162, 302, 40);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(141, 133, 302, 30);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa nombre de usuario");
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.BLACK);
		panel_1_1.setBounds(141, 234, 302, 30);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese su contraseña");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		panel_1_1.add(lblNewLabel_1_1);
		
		JPasswordField passwordField;
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setBounds(141, 263, 302, 40);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char [] pass = passwordField.getPassword();
				String password = new String(pass);
				String username = new String(textField.getText());
				
				if(model.login(username, password)) {
					JOptionPane.showMessageDialog(null, "EXITO AL INICIAR SESION", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
				}else {
					 JOptionPane.showMessageDialog(null, "No se ha encontrado dicho usuario y contraseña, intente de nuevo.", "Error", JOptionPane.WARNING_MESSAGE);
				}
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(141, 337, 302, 40);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_2 = new JLabel("¿Olvidó su contraseña?");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBackground(Color.BLACK);
		lblNewLabel_1_2.setBounds(141, 395, 164, 17);
		panel.add(lblNewLabel_1_2);
		
		JButton btnNewButton_1 = new JButton("¿Aun no tienes cuenta? Registrate aquí");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBounds(165, 434, 250, 23);
		panel.add(btnNewButton_1);
		return panel;
	}
	
	public JPanel register() {
		//Disenio del register
		panel.setBackground(Color.BLUE);
		return panel;
	}
}
