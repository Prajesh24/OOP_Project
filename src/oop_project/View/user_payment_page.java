/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project.View;
import javax.swing.*;
import java.awt.*;
 
 
public class user_payment_page extends JFrame {
    user_payment_page(){
     setSize(1450,900);
     setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     getContentPane().setBackground(Color.WHITE);
     

         
        ImageIcon logo_image=new ImageIcon(getClass().getResource("/images/logo.jpg"));
        Image original_logo_image=logo_image.getImage();
        Image resized_logo_image= original_logo_image.getScaledInstance(240, 150,Image.SCALE_SMOOTH);
        ImageIcon complete_logo_image=new  ImageIcon(resized_logo_image);
        JLabel logo_image_label= new JLabel(complete_logo_image);
        logo_image_label.setBounds(0,0,240,150);
        add(logo_image_label);
        
        JLabel text=new JLabel("Payment can be done through following apps");
        text.setBounds(500,130,500,60);
        text.setFont(new Font("AERIAL", Font.PLAIN,20));
        add(text);
        
        ImageIcon esewa_image=new ImageIcon(getClass().getResource("/images/esewa.png"));
        Image original_esewa_image=esewa_image.getImage();
        Image resized_esewa_image= original_esewa_image.getScaledInstance(200, 150,Image.SCALE_SMOOTH);
        ImageIcon complete_esewa_image=new  ImageIcon(resized_esewa_image);
        JLabel esewa_image_label= new JLabel(complete_esewa_image);
        esewa_image_label.setBounds(250,300,200,150);
        add(esewa_image_label);
        
        ImageIcon khalti_image=new ImageIcon(getClass().getResource("/images/khalti.png"));
        Image original_khalti_image=khalti_image.getImage();
        Image resized_khalti_image= original_khalti_image.getScaledInstance(200, 150,Image.SCALE_SMOOTH);
        ImageIcon complete_khalti_image=new  ImageIcon(resized_khalti_image);
        JLabel khalti_image_label= new JLabel(complete_khalti_image);
        khalti_image_label.setBounds(600,300,200,150);
        add(khalti_image_label);
        
        ImageIcon ime_image=new ImageIcon(getClass().getResource("/images/ime_pay.png"));
        Image original_ime_image=ime_image.getImage();
        Image resized_ime_image= original_ime_image.getScaledInstance(200, 150,Image.SCALE_SMOOTH);
        ImageIcon complete_ime_image=new  ImageIcon(resized_ime_image);
        JLabel ime_image_label= new JLabel(complete_ime_image);
        ime_image_label.setBounds(950,300,200,150);
        add(ime_image_label);
        
        ImageIcon qr_image=new ImageIcon(getClass().getResource("/images/qr.png"));
        Image original_qr_image=qr_image.getImage();
        Image resized_qr_image= original_qr_image.getScaledInstance(200, 200,Image.SCALE_SMOOTH);
        ImageIcon complete_qr_image=new  ImageIcon(resized_qr_image);
        JLabel qr_image_label= new JLabel(complete_qr_image);
        qr_image_label.setBounds(600,600,200,200);
        add(qr_image_label);
        
        
        
}
}   