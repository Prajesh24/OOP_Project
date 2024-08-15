/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project.View;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
 
public class user_admin_login extends JFrame {
    private JTextField username_field;
    private JPasswordField password_field;
    private JButton login_button;
 
    public user_admin_login() {
        setSize(1450, 900);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
 
        // Logo
        ImageIcon logo_image = new ImageIcon(getClass().getResource("/images/logo.jpg"));
        Image original_logo_image = logo_image.getImage();
        Image resized_logo_image = original_logo_image.getScaledInstance(260, 190, Image.SCALE_SMOOTH);
        ImageIcon complete_logo_image = new ImageIcon(resized_logo_image);
        JLabel logo_image_label = new JLabel(complete_logo_image);
        logo_image_label.setBounds(1090, 0, 260, 190);
        add(logo_image_label);
 
        // Login image
        ImageIcon login_image = new ImageIcon(getClass().getResource("/images/login.jpg"));
        Image original_login_image = login_image.getImage();
        Image resized_login_image = original_login_image.getScaledInstance(1000, 900, Image.SCALE_SMOOTH);
        ImageIcon complete_login_image = new ImageIcon(resized_login_image);
        JLabel login_image_label = new JLabel(complete_login_image);
        login_image_label.setBounds(0, 0, 1000, 900);
        add(login_image_label);
 
        JLabel login_text = new JLabel("LOGIN");
        login_text.setForeground(new Color(52, 147, 29));
        login_text.setFont(new Font("AERIAL", Font.PLAIN, 38));
        login_text.setBounds(1170, 200, 300, 60);
        add(login_text);
 
        JLabel username_text = new JLabel("Username");
        username_text.setForeground(new Color(0, 0, 0));
        username_text.setFont(new Font("AERIAL", Font.PLAIN, 20));
        username_text.setBounds(1115, 285, 300, 60);
        add(username_text);
 
        JLabel passwords_text = new JLabel("Password");
        passwords_text.setForeground(new Color(0, 0, 0));
        passwords_text.setFont(new Font("AERIAL", Font.PLAIN, 20));
        passwords_text.setBounds(1115, 385, 300, 60);
        add(passwords_text);
 
        username_field = new JTextField();
        username_field.setBounds(1110, 330, 250, 45);
        add(username_field);
 
        password_field = new JPasswordField();
        password_field.setBounds(1110, 430, 250, 45);
        add(password_field);
 
        login_button = new JButton("Login");
        login_button.setBounds(1150, 540, 150, 45);
        add(login_button);
 
        JButton forgot_button = new JButton("Forgot password?");
        forgot_button.setBounds(1250, 720, 150, 45);
        add(forgot_button);
 
        forgot_button.addActionListener(e -> {
            user_forgot_password forgot=new user_forgot_password();
            forgot.setVisible(true);
            dispose(); // Close the current HomePage
        });
 
        JButton create_button = new JButton("Create a new account?");
        create_button.setBounds(1050, 720, 150, 45);
        add(create_button);
 
        create_button.addActionListener(e -> {
            user_signup sign=new user_signup();
            dispose(); // Close the current HomePage
        });
 
        setVisible(true);
    }
 
    public JTextField getusername_field() {
        return username_field;
    }
 
    public JPasswordField getpassword_field() {
        return password_field;
    }
 
    public void addLoginButtonListener(ActionListener listener) {
        login_button.addActionListener(listener);
    }
 
    public void setMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}