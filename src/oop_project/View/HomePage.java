/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project.View;

///import automobile.rentals.DAO.userDAO;
import oop_project.Controller.user_signup_controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import oop_project.View.user_admin_login;
import oop_project.Controller.user_login_controller;
import oop_project.DAO.userDAO;
 
 
public class HomePage extends JFrame   {
    public HomePage(){
        setTitle("Automobile Rentals");
        setSize(1450,900);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        JLabel title=new JLabel();
        title.setText("Automobile Rentals");
        title.setForeground(Color.BLACK);
        title.setFont(new Font("times new roman", Font.ITALIC,40));
        title.setBounds(580, 10, 350, 50);
        add(title);
        
        ImageIcon image= new ImageIcon(getClass().getResource("/images/home.jpg"));
        Image original_image=image.getImage();
        Image resized_image=original_image.getScaledInstance(1450, 900,Image.SCALE_SMOOTH);
        ImageIcon complete_image=new ImageIcon(resized_image);
        JLabel image_label=new JLabel(complete_image);
        image_label.setBounds(0,0, 1450,900);
        add(image_label);
        
        
        JButton login_button=new JButton();
        login_button.setText("Login");
        login_button.setBackground(Color.BLACK);
        login_button.setForeground(Color.BLACK);
        login_button.setBounds(1150,10,100,50);
        login_button.setFont(new Font("Times New Roman",Font.PLAIN,20));
        
        // Add action listener to login button
        login_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userDAO dao=new userDAO();
                user_admin_login login=new user_admin_login();
                user_login_controller control=new user_login_controller(dao,login);
                dispose(); // Close the current HomePage
            }
         });
        
        JButton signin_button=new JButton();
        signin_button.setText("Sign In");
        signin_button.setBackground(Color.BLACK);
        signin_button.setForeground(Color.BLACK);
        signin_button.setBounds(1300,10,100,50);
        signin_button.setFont(new Font("Times New Roman",Font.PLAIN,20));
        
         // Add action listener to signin button
        signin_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user_signup sign=new user_signup();
                
                userDAO dao= new userDAO();
                user_signup_controller con= new user_signup_controller(sign,dao);
                
                dispose(); // Close the current HomePage
            }
            
        });
        
        add(login_button);
        add(signin_button);
        
      
        
       
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBounds(0, 800, 1430, 100);
        bottomPanel.setBackground(new Color(0, 0, 0)); // Semi-transparent black
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 25));
        add(bottomPanel);
        
        JLabel bottomLabel = new JLabel("Embark on endless adventures with our premium rentals.");
        bottomLabel.setForeground(new Color(250,250,0));
        bottomLabel.setBounds(200,860,500,20);
        bottomLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        bottomPanel.add(bottomLabel);
        
       
        
        ImageIcon logo_image= new ImageIcon(getClass().getResource("/images/logo.jpg"));
        Image logo_original_image=logo_image.getImage();
        Image logo_resized_image=logo_original_image.getScaledInstance(160, 100,Image.SCALE_SMOOTH);
        ImageIcon logo_complete_image=new ImageIcon(logo_resized_image);
        JLabel logo_image_label=new JLabel(logo_complete_image);
        logo_image_label.setBounds(0,0,160,100);
        add(logo_image_label);
        
 
        
        getContentPane().setComponentZOrder(image_label, getContentPane().getComponentCount() - 1);
        getContentPane().setComponentZOrder(bottomPanel, 0);
        
        setVisible(true);
        
    }
        
}