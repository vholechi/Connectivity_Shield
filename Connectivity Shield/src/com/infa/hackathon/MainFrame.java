package com.infa.hackathon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Window.Type;
import java.awt.Panel;

public class MainFrame {

	private JFrame frmConnectivityShield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmConnectivityShield.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConnectivityShield = new JFrame();
		frmConnectivityShield.setType(Type.POPUP);
		frmConnectivityShield.setTitle("Connectivity Shield");
		frmConnectivityShield.setAlwaysOnTop(true);
		frmConnectivityShield.setBounds(100, 100, 1024, 721);
		frmConnectivityShield.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConnectivityShield.getContentPane().setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(470, 380, 323, 23);
		frmConnectivityShield.getContentPane().add(progressBar);
		
		JProgressBar progressBar2 = new JProgressBar();
		progressBar2.setBounds(470, 449, 323, 23);
		frmConnectivityShield.getContentPane().add(progressBar2);
		
		Button button = new Button("Browse");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(830, 179, 133, 21);
		frmConnectivityShield.getContentPane().add(button);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(249, 182, 544, 21);
		frmConnectivityShield.getContentPane().add(textField_3);
		
		TextField textField_3_1 = new TextField();
		textField_3_1.setBounds(249, 239, 291, 21);
		frmConnectivityShield.getContentPane().add(textField_3_1);
		
		TextField textField_3_1_1 = new TextField();
		textField_3_1_1.setBounds(249, 293, 121, 21);
		frmConnectivityShield.getContentPane().add(textField_3_1_1);
		
		Label label = new Label("Perforce Path");
		label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label.setBounds(79, 179, 131, 21);
		frmConnectivityShield.getContentPane().add(label);
		
		Label label_1 = new Label("Jar Filename");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1.setBounds(79, 239, 131, 21);
		frmConnectivityShield.getContentPane().add(label_1);
		
		Label label_1_1 = new Label("Safer Version");
		label_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1_1.setBounds(79, 293, 131, 21);
		frmConnectivityShield.getContentPane().add(label_1_1);
		
		Button button_1 = new Button("Update Package");
		button_1.setFont(new Font("Dialog", Font.BOLD, 15));
		button_1.setBounds(79, 380, 317, 21);
		frmConnectivityShield.getContentPane().add(button_1);
		
		Button button_1_1 = new Button("Run CATS");
		button_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		button_1_1.setBounds(79, 449, 317, 21);
		frmConnectivityShield.getContentPane().add(button_1_1);
		
		/*
		 * JProgressBar progressBar = new JProgressBar(); progressBar.setBounds(470,
		 * 380, 333, 23); frmConnectivityShield.getContentPane().add(progressBar);
		 */
	}
}
