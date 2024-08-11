/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project.View;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
 
public class user_signup extends JFrame {
    
    private JTextField username_field;
    private JTextField address_field;
    private JPasswordField set_field;
    private JTextField contact_field;
    private JPasswordField confirm_field;
    private JTextField email_field;
    private JTextField citizenship_field;
    private JTextField license_field;
    private JButton register_button;
    
    public user_signup(){
        setSize(1450,900);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
       
                //left image
        ImageIcon signup_image=new ImageIcon(getClass().getResource("/images/signup.jpeg"));
        Image original_signup_image=signup_image.getImage();
        Image resized_signup_image=original_signup_image.getScaledInstance(600, 900,Image.SCALE_SMOOTH);
        ImageIcon completed_signup_image=new ImageIcon(resized_signup_image);
        JLabel signup_image_label=new JLabel(completed_signup_image);
        signup_image_label.setBounds(0,0,600,900);
        add(signup_image_label);
        
                //signup title
        JLabel signup_title=new JLabel("SIGN UP");
        signup_title.setForeground(Color.BLACK);
        signup_title.setFont(new Font("times new roman", Font.PLAIN,40));
        signup_title.setBounds(950,50, 350, 50);
        add(signup_title);
        
                 //Username section
        JLabel username_label=new JLabel("Username");
        username_label.setForeground(Color.BLACK);
        username_label.setFont(new Font("times new roman", Font.PLAIN,24));
        username_label.setBounds(690,150, 350, 50);
        add(username_label);
        
        username_field = new JTextField();
        username_field.setBounds(690, 200, 250, 40);
        add(username_field);
        
                   //Address section
        JLabel address_label=new JLabel("Address");
        address_label.setForeground(Color.BLACK);
        address_label.setFont(new Font("times new roman", Font.PLAIN,24));
        address_label.setBounds(1150,150, 350, 50);
        add(address_label);
        
        address_field=new JTextField();
        address_field.setBounds(1150,200,250,40);
        add(address_field);
                    
        
                    //Set password section
        JLabel setPassword_label=new JLabel("Set Password");
        setPassword_label.setForeground(Color.BLACK);
        setPassword_label.setFont(new Font("times new roman", Font.PLAIN,24));
        setPassword_label.setBounds(690,270, 350, 50);
        add(setPassword_label);
        
        
        set_field=new JPasswordField();
        set_field.setBounds(690,320,250,40);
        add(set_field);
        
        
                    //Contact Number
        JLabel contact_label=new JLabel("Contact Number");
        contact_label.setForeground(Color.BLACK);
        contact_label.setFont(new Font("times new roman", Font.PLAIN,24));
        contact_label.setBounds(1150,270, 350, 50);
        add(contact_label);
        
        contact_field=new JTextField();
        contact_field.setBounds(1150,320,250,40);
        add(contact_field);
                
        
                    //Confirm Password
        JLabel confirmPassword_label=new JLabel("Confirm password");
        confirmPassword_label.setForeground(Color.BLACK);
        confirmPassword_label.setFont(new Font("times new roman", Font.PLAIN,24));
        confirmPassword_label.setBounds(690,390, 350, 50);
        add(confirmPassword_label);
                   
        confirm_field=new JPasswordField();
        confirm_field.setBounds(690,440,250,40);
        add(confirm_field);
        
        
                    //citizenship
        JLabel citizenship_label=new JLabel("Citizenship Number");
        citizenship_label.setForeground(Color.BLACK);
        citizenship_label.setFont(new Font("times new roman", Font.PLAIN,24));
        citizenship_label.setBounds(1150,390, 350, 50);
        add(citizenship_label);
        
        citizenship_field=new JTextField();
        citizenship_field.setBounds(1150,440,250,40);
        add(citizenship_field);
        
                
                    //License Number
        JLabel licenseNumber_label=new JLabel("License Number");
        licenseNumber_label.setForeground(Color.BLACK);
        licenseNumber_label.setFont(new Font("times new roman", Font.PLAIN,24));
        licenseNumber_label.setBounds(690,510, 350, 50);
        add(licenseNumber_label);
        
        license_field=new JTextField();
        license_field.setBounds(690,560,250,40);
        add(license_field);
                    
        
                    //email
        JLabel email_label=new JLabel("Email");
        email_label.setForeground(Color.BLACK);
        email_label.setFont(new Font("times new roman", Font.PLAIN,24));
        email_label.setBounds(1150,510, 350, 50);
        add(email_label);
        
        email_field=new JTextField();
        email_field.setBounds(1150,560,250,40);
        add(email_field);
        
       
        
        
        register_button= new JButton("Register");
        register_button.setBounds(970,650, 150, 60);
        register_button.setBackground(Color.GREEN);
        add(register_button);
        
        
        JButton move_login_button= new JButton("Go to Login Page");
        move_login_button.setBounds(970,750, 150, 30);
        move_login_button.setBackground(Color.GREEN);
        add(move_login_button);
        move_login_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user_admin_login log=new user_admin_login();
                dispose(); // Close the current HomePage
            }
        });
        
        
       
                
                
        
        
        
        
     setVisible(true);   
    }
    
 
 
//public static void main(String[] args){
//    SignUp signup=new SignUp();
//    signup
//    
//
//}
 
    public JTextField getUsername_field() {
        return username_field;
    }
 
    public void setUsername_field(JTextField username_field) {
        this.username_field = username_field;
    }
 
    public JTextField getAddress_field() {
        return address_field;
    }
 
    public void setAddress_field(JTextField address_field) {
        this.address_field = address_field;
    }
 
    public JPasswordField getSet_field() {
        return set_field;
    }
 
    public void setSet_field(JPasswordField set_field) {
        this.set_field = set_field;
    }
 
    public JTextField getContact_field() {
        return contact_field;
    }
 
    public void setContact_field(JTextField contact_field) {
        this.contact_field = contact_field;
    }
 
    public JPasswordField getConfirm_field() {
        return confirm_field;
    }
 
    public void setConfirm_field(JPasswordField confirm_field) {
        this.confirm_field = confirm_field;
    }
 
    public JTextField getEmail_field() {
        return email_field;
    }
 
    public void setEmail_field(JTextField email_field) {
        this.email_field = email_field;
    }
 
    public JTextField getCitizenship_field() {
        return citizenship_field;
    }
 
    public void setCitizenship_field(JTextField citizenship_field) {
        this.citizenship_field = citizenship_field;
    }
 
    public JTextField getLicense_field() {
        return license_field;
    }
 
    public void setLicense_field(JTextField license_field) {
        this.license_field = license_field;
    }
 
      public void addRegisterButtonListener(ActionListener listener) {
        register_button.addActionListener(listener);
 
    }
 
    public void setMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    
    }
}
