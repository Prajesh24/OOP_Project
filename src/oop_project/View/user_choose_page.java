/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project.View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class user_choose_page extends JFrame {
    public user_choose_page(){
         setSize(1450,900);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon logo_image=new ImageIcon(getClass().getResource("/images/logo.jpg"));
        Image original_logo_image=logo_image.getImage();
        Image resized_logo_image= original_logo_image.getScaledInstance(230, 160,Image.SCALE_SMOOTH);
        ImageIcon complete_logo_image=new  ImageIcon(resized_logo_image);
        JLabel logo_image_label= new JLabel(complete_logo_image);
        logo_image_label.setBounds(0,0,230,160);
        add(logo_image_label);
        
        JLabel rental_text=new JLabel("Our Rentals");
        rental_text.setForeground(new Color(153,11,11));
        rental_text.setFont(new Font("AERIAL", Font.PLAIN,44));
        rental_text.setBounds(600,70,300,60);
        add(rental_text);
        
        JLabel choose_text=new JLabel("Please choose your ride");
        choose_text.setForeground(new Color(11,158,16));
        choose_text.setFont(new Font("AERIAL", Font.PLAIN,26));
        choose_text.setBounds(580,130,400,60);
        add(choose_text);
        
        
//        Four wheeler
        ImageIcon car_image=new ImageIcon(getClass().getResource("/images/car.png"));
        Image original_car_image=car_image.getImage();
        Image resized_car_image= original_car_image.getScaledInstance(280,350,Image.SCALE_SMOOTH);
        ImageIcon complete_car_image=new  ImageIcon(resized_car_image);
        JButton car_image_button= new JButton(complete_car_image);
        car_image_button.setBounds(300,300,300,370);
        add(car_image_button);
        
        car_image_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
            user_four_wheeler tfour = new user_four_wheeler();
            tfour.setVisible(true);
            });
                dispose(); // Close the current HomePage
            }
        });
        
        
        JLabel four_text=new JLabel("Four Wheelers");
        four_text.setForeground(new Color(0,0,0));
        four_text.setFont(new Font("AERIAL", Font.PLAIN,26));
        four_text.setBounds(360,700,200,60);
        add(four_text);
        
        
        
        
        
//        Two wheeler
        ImageIcon bike_image=new ImageIcon(getClass().getResource("/images/Bike.png"));
        Image original_bike_image=bike_image.getImage();
        Image resized_bike_image= original_bike_image.getScaledInstance(280,350,Image.SCALE_SMOOTH);
        ImageIcon complete_bike_image=new  ImageIcon(resized_bike_image);
        JButton bike_image_button= new JButton(complete_bike_image);
        bike_image_button.setBounds(800,300,300,370);
        add(bike_image_button);
        
        bike_image_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
            user_two_wheeler t = new user_two_wheeler();
            t.setVisible(true);
        });
                dispose(); 
            }
        });
        
        
       JLabel two_text=new JLabel("Two Wheelers");
        two_text.setForeground(new Color(0,0,0));
        two_text.setFont(new Font("AERIAL", Font.PLAIN,26));
        two_text.setBounds(860,700,200,60);
        add(two_text);     
    }
    
}
