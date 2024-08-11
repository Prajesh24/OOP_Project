/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project.View;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class admin_two_wheeler extends JFrame {
    private JTextField vehicle_name;
    private JTextField engine5_value_label;
    private JTextField torque5_value_label;
    private JTextField speed5_value_label;
    private JTextField color5_value_label;
    private JTextField price5_value_label;
    private JLabel image_display_label;
    private File selectedImageFile;
    public admin_two_wheeler() {
        setSize(1450, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        
        
 
        // Main content panel that will be scrollable
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setBackground(Color.BLACK);
       
        contentPanel.setPreferredSize(new Dimension(1450, 2030)); // Set preferred size larger than frame size to enable scrolling
 
        // Set up the content
        setupContent(contentPanel);
 
        // Create JScrollPane and add content panel to it
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBounds(0, 0, 1450, 900);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16); // Adjust the scrolling speed if necessary
 
        // Add JScrollPane to the JFrame
        setLayout(null);
        add(scrollPane);
    }
 
    private void setupContent(JPanel contentPanel) {
        // Logo Image
        ImageIcon logo_image = new ImageIcon(getClass().getResource("/images/logo.jpg"));
        Image original_logo_image = logo_image.getImage();
        Image resized_logo_image = original_logo_image.getScaledInstance(150, 70, Image.SCALE_SMOOTH);
        ImageIcon complete_logo_image = new ImageIcon(resized_logo_image);
        JLabel logo_image_label = new JLabel(complete_logo_image);
        logo_image_label.setBounds(0, 0, 150, 70);
        contentPanel.add(logo_image_label);
        
        
        ImageIcon car_image=new ImageIcon(getClass().getResource("/images/car.png"));
        Image original_car_image=car_image.getImage();
        Image resized_car_image= original_car_image.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        ImageIcon complete_car_image=new  ImageIcon(resized_car_image);
        JButton car_image_button= new JButton(complete_car_image);
        car_image_button.setBounds(1300,10,60,60);
        contentPanel.add(car_image_button);
        
        car_image_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                admin_four_wheeler tfour = new admin_four_wheeler();
                     tfour. setVisible(true);
                        dispose(); // Close the current HomePage
            }
        });
 
        // Top Panel
        JPanel top_panel = new JPanel();
        top_panel.setBounds(150, 0, 1350, 70);
        top_panel.setBackground(Color.WHITE);
        contentPanel.add(top_panel);
 
        // First Panel
        JPanel first_panel = new JPanel();
        first_panel.setBounds(0, 100, 1450, 370);
        first_panel.setBackground(new Color(62,53,53));
        first_panel.setLayout(null);
        
         // Add border to first_panel
        Border border = BorderFactory.createLineBorder(Color.YELLOW, 3); // Creating a white line border with 3 pixels thickness
        first_panel.setBorder(border);
        
        contentPanel.add(first_panel);
 
        // Harley Image
        ImageIcon harley_image = new ImageIcon(getClass().getResource("/images/Harleydavidson.png"));
        Image original_harley_image = harley_image.getImage();
        Image resized_harley_image = original_harley_image.getScaledInstance(500, 360, Image.SCALE_SMOOTH);
        ImageIcon complete_harley_image = new ImageIcon(resized_harley_image);
        JLabel harley_image_label = new JLabel(complete_harley_image);
        harley_image_label.setBounds(5, 5, 500, 360);
        first_panel.add(harley_image_label);
        
        JLabel harley_text = new JLabel("Harley Davidson Iron 883");
        harley_text.setOpaque(true);
        harley_text.setBackground(new Color(62,53,53));
        harley_text.setForeground(new Color(245, 167, 10)); // Set text color to make it visible
        harley_text.setBounds(700, 10, 300, 50);
        harley_text.setFont(new Font("Times New Roman", Font.BOLD, 26));
        first_panel.add(harley_text);
        
        JLabel engine_label=new JLabel("Engine");
        engine_label.setOpaque(true);
        engine_label.setBackground(new Color(62,53,53));
        engine_label.setForeground(Color.WHITE);
        engine_label.setBounds(580, 70, 150, 50);
        engine_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        first_panel.add(engine_label);
        
        JTextField engine_value_label=new JTextField("2000 cc");
        engine_value_label.setOpaque(true);
        engine_value_label.setBackground(new Color(62,53,53));
        engine_value_label.setForeground(Color.WHITE);
        engine_value_label.setBounds(1000, 70, 150, 50);
        engine_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        first_panel.add(engine_value_label);
        
        
        JLabel torque_label=new JLabel("Torque");
        torque_label.setOpaque(true);
        torque_label.setBackground(new Color(62,53,53));
        torque_label.setForeground(Color.WHITE);
        torque_label.setBounds(580, 120, 150, 50);
        torque_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        first_panel.add(torque_label);
        
         JTextField torque_value_label=new  JTextField("52/3750 lb-ft/RPM");
        torque_value_label.setOpaque(true);
        torque_value_label.setBackground(new Color(62,53,53));
        torque_value_label.setForeground(Color.WHITE);
        torque_value_label.setBounds(910, 120, 200, 50);
        torque_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        first_panel.add(torque_value_label);
        
        
        
        JLabel speed_label=new JLabel("Top Speed");
        speed_label.setOpaque(true);
        speed_label.setBackground(new Color(62,53,53));
        speed_label.setForeground(Color.WHITE);
        speed_label.setBounds(580, 170, 150, 50);
        speed_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        first_panel.add(speed_label);
        
         JTextField speed_value_label=new  JTextField("350 Kmph");
        speed_value_label.setOpaque(true);
        speed_value_label.setBackground(new Color(62,53,53));
        speed_value_label.setForeground(Color.WHITE);
        speed_value_label.setBounds(980, 170, 150, 50);
        speed_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        first_panel.add(speed_value_label);
        
        
        JLabel color_label=new JLabel("Color");
        color_label.setOpaque(true);
        color_label.setBackground(new Color(62,53,53));
        color_label.setForeground(Color.WHITE);
        color_label.setBounds(580, 220, 150, 50);
        color_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        first_panel.add(color_label);
        
        JTextField color_value_label=new  JTextField("Black");
        color_value_label.setOpaque(true);
        color_value_label.setBackground(new Color(62,53,53));
        color_value_label.setForeground(Color.WHITE);
        color_value_label.setBounds(1020, 220, 150, 50);
        color_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        first_panel.add(color_value_label);
        
        JLabel price_label=new JLabel("Price Per Day");
        price_label.setOpaque(true);
        price_label.setBackground(new Color(62,53,53));
        price_label.setForeground(Color.WHITE);
        price_label.setBounds(580, 270, 150, 50);
        price_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        first_panel.add(price_label);
        
         JTextField price_value_label=new  JTextField("Rs 30000");
        price_value_label.setOpaque(true);
        price_value_label.setBackground(new Color(62,53,53));
        price_value_label.setForeground(Color.WHITE);
        price_value_label.setBounds(1000, 270, 150, 50);
        price_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        first_panel.add(price_value_label);
        
       
        
//         JButton harley_edit_button=new JButton("Edit");
//        harley_edit_button.setBackground(new Color(255,40,53));
//        harley_edit_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
//        harley_edit_button.setBounds(1250,150,120,50);
//        first_panel.add(harley_edit_button);
        
        JButton harley_update_button=new JButton("Update");
        harley_update_button.setBackground(new Color(255,40,53));
        harley_update_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        harley_update_button.setBounds(1250,230,120,50);
        first_panel.add(harley_update_button);
        
        
        
        
//        Second panel section
        JPanel second_panel = new JPanel();
        second_panel.setBounds(0, 470, 1450, 370);
        second_panel.setBackground(new Color(62,53,53));
        second_panel.setLayout(null);
        contentPanel.add(second_panel);
        second_panel.setBorder(border);
        
        ImageIcon ducati_image = new ImageIcon(getClass().getResource("/images/Ducatimonster.png"));
        Image original_ducati_image = ducati_image.getImage();
        Image resized_ducati_image = original_ducati_image.getScaledInstance(500, 360, Image.SCALE_SMOOTH);
        ImageIcon complete_ducati_image = new ImageIcon(resized_ducati_image);
        JLabel ducati_image_label = new JLabel(complete_ducati_image);
        ducati_image_label.setBounds(5, 5, 500, 360);
        second_panel.add(ducati_image_label);
        
        JLabel ducati_text = new JLabel("Ducati Monster");
        ducati_text.setOpaque(true);
        ducati_text.setBackground(new Color(62,53,53));
        ducati_text.setForeground(new Color(245, 167, 10)); // Set text color to make it visible
        ducati_text.setBounds(740, 10, 300, 50);
        ducati_text.setFont(new Font("Times New Roman", Font.BOLD, 26));
        second_panel.add(ducati_text);
        
        JLabel engine2_label=new JLabel("Engine");
        engine2_label.setOpaque(true);
        engine2_label.setBackground(new Color(62,53,53));
        engine2_label.setForeground(Color.WHITE);
        engine2_label.setBounds(580, 70, 150, 50);
        engine2_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        second_panel.add(engine2_label);
        
         JTextField engine2_value_label=new  JTextField("937 cc");
        engine2_value_label.setOpaque(true);
        engine2_value_label.setBackground(new Color(62,53,53));
        engine2_value_label.setForeground(Color.WHITE);
        engine2_value_label.setBounds(1020, 70, 150, 50);
        engine2_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        second_panel.add(engine2_value_label);
        
        
        JLabel torque2_label=new JLabel("Torque");
        torque2_label.setOpaque(true);
        torque2_label.setBackground(new Color(62,53,53));
        torque2_label.setForeground(Color.WHITE);
        torque2_label.setBounds(580, 120, 150, 50);
        torque2_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        second_panel.add(torque2_label);
        
        JTextField torque2_value_label=new  JTextField("6500 RPM");
        torque2_value_label.setOpaque(true);
        torque2_value_label.setBackground(new Color(62,53,53));
        torque2_value_label.setForeground(Color.WHITE);
        torque2_value_label.setBounds(980, 120, 200, 50);
        torque2_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        second_panel.add(torque2_value_label);
        
        
        
        JLabel speed2_label=new JLabel("Top Speed");
        speed2_label.setOpaque(true);
        speed2_label.setBackground(new Color(62,53,53));
        speed2_label.setForeground(Color.WHITE);
        speed2_label.setBounds(580, 170, 150, 50);
        speed2_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        second_panel.add(speed2_label);
        
         JTextField speed2_value_label=new  JTextField("253 Kmph");
        speed2_value_label.setOpaque(true);
        speed2_value_label.setBackground(new Color(62,53,53));
        speed2_value_label.setForeground(Color.WHITE);
        speed2_value_label.setBounds(980, 170, 150, 50);
        speed2_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        second_panel.add(speed2_value_label);
        
        
        JLabel color2_label=new JLabel("Color");
        color2_label.setOpaque(true);
        color2_label.setBackground(new Color(62,53,53));
        color2_label.setForeground(Color.WHITE);
        color2_label.setBounds(580, 220, 150, 50);
        color2_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        second_panel.add(color2_label);
        
         JTextField color2_value_label=new  JTextField("Red");
        color2_value_label.setOpaque(true);
        color2_value_label.setBackground(new Color(62,53,53));
        color2_value_label.setForeground(Color.WHITE);
        color2_value_label.setBounds(1030, 220, 150, 50);
        color2_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        second_panel.add(color2_value_label);
        
        JLabel price2_label=new JLabel("Price Per Day");
        price2_label.setOpaque(true);
        price2_label.setBackground(new Color(62,53,53));
        price2_label.setForeground(Color.WHITE);
        price2_label.setBounds(580, 270, 150, 50);
        price2_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        second_panel.add(price2_label);
        
         JTextField price2_value_label=new  JTextField("Rs 20000");
        price2_value_label.setOpaque(true);
        price2_value_label.setBackground(new Color(62,53,53));
        price2_value_label.setForeground(Color.WHITE);
        price2_value_label.setBounds(1000, 270, 150, 50);
        price2_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        second_panel.add(price2_value_label);
        
//        JButton ducati_edit_button=new JButton("Edit");
//        ducati_edit_button.setBackground(new Color(255,40,53));
//        ducati_edit_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
//        ducati_edit_button.setBounds(1250,150,120,50);
//        second_panel.add(ducati_edit_button);
        
        JButton ducati_update_button=new JButton("Update");
        ducati_update_button.setBackground(new Color(255,40,53));
        ducati_update_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
       ducati_update_button.setBounds(1250,230,120,50);
        second_panel.add(ducati_update_button);
        
        
        
//        third panel section
        JPanel third_panel = new JPanel();
        third_panel.setBounds(0, 840, 1450, 370);
        third_panel.setBackground(new Color(62,53,53));
        third_panel.setLayout(null);
        contentPanel.add(third_panel);
        third_panel.setBorder(border);
        
        ImageIcon kawasaki_image = new ImageIcon(getClass().getResource("/images/Kawasaki.png"));
        Image original_kawasaki_image = kawasaki_image.getImage();
        Image resized_kawasaki_image = original_kawasaki_image.getScaledInstance(500, 360, Image.SCALE_SMOOTH);
        ImageIcon complete_kawasaki_image = new ImageIcon(resized_kawasaki_image);
        JLabel kawasaki_image_label = new JLabel(complete_kawasaki_image);
        kawasaki_image_label.setBounds(5, 5, 500, 360);
        third_panel.add(kawasaki_image_label);
        
        JLabel kawasaki_text = new JLabel("Kawasaki Ninja 400");
        kawasaki_text.setOpaque(true);
        kawasaki_text.setBackground(new Color(62,53,53));
        kawasaki_text.setForeground(new Color(245, 167, 10)); // Set text color to make it visible
        kawasaki_text.setBounds(730, 10, 300, 50);
        kawasaki_text.setFont(new Font("Times New Roman", Font.BOLD, 26));
        third_panel.add(kawasaki_text);
        
        JLabel engine3_label=new JLabel("Engine");
        engine3_label.setOpaque(true);
        engine3_label.setBackground(new Color(62,53,53));
        engine3_label.setForeground(Color.WHITE);
        engine3_label.setBounds(580, 70, 150, 50);
        engine3_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        third_panel.add(engine3_label);
        
         JTextField engine3_value_label=new  JTextField("399 cc");
        engine3_value_label.setOpaque(true);
        engine3_value_label.setBackground(new Color(62,53,53));
        engine3_value_label.setForeground(Color.WHITE);
        engine3_value_label.setBounds(1020, 70, 150, 50);
        engine3_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        third_panel.add(engine3_value_label);
        
        
        JLabel torque3_label=new JLabel("Torque");
        torque3_label.setOpaque(true);
        torque3_label.setBackground(new Color(62,53,53));
        torque3_label.setForeground(Color.WHITE);
        torque3_label.setBounds(580, 120, 150, 50);
        torque3_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        third_panel.add(torque3_label);
        
         JTextField torque3_value_label=new  JTextField("8000 RPM");
        torque3_value_label.setOpaque(true);
        torque3_value_label.setBackground(new Color(62,53,53));
        torque3_value_label.setForeground(Color.WHITE);
        torque3_value_label.setBounds(980, 120, 200, 50);
        torque3_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        third_panel.add(torque3_value_label);
        
        
        
        JLabel speed3_label=new JLabel("Top Speed");
        speed3_label.setOpaque(true);
        speed3_label.setBackground(new Color(62,53,53));
        speed3_label.setForeground(Color.WHITE);
        speed3_label.setBounds(580, 170, 150, 50);
        speed3_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        third_panel.add(speed3_label);
        
         JTextField speed3_value_label=new  JTextField("200 Kmph");
        speed3_value_label.setOpaque(true);
        speed3_value_label.setBackground(new Color(62,53,53));
        speed3_value_label.setForeground(Color.WHITE);
        speed3_value_label.setBounds(980, 170, 150, 50);
        speed3_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        third_panel.add(speed3_value_label);
        
        
        JLabel color3_label=new JLabel("Color");
        color3_label.setOpaque(true);
        color3_label.setBackground(new Color(62,53,53));
        color3_label.setForeground(Color.WHITE);
        color3_label.setBounds(580, 220, 150, 50);
        color3_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        third_panel.add(color3_label);
        
         JTextField color3_value_label=new  JTextField("Light Green");
        color3_value_label.setOpaque(true);
        color3_value_label.setBackground(new Color(62,53,53));
        color3_value_label.setForeground(Color.WHITE);
        color3_value_label.setBounds(970, 220, 150, 50);
        color3_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        third_panel.add(color3_value_label);
        
        JLabel price3_label=new JLabel("Price Per Day");
        price3_label.setOpaque(true);
        price3_label.setBackground(new Color(62,53,53));
        price3_label.setForeground(Color.WHITE);
        price3_label.setBounds(580, 270, 150, 50);
        price3_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        third_panel.add(price3_label);
        
        JTextField price3_value_label=new  JTextField("Rs 7000");
        price3_value_label.setOpaque(true);
        price3_value_label.setBackground(new Color(62,53,53));
        price3_value_label.setForeground(Color.WHITE);
        price3_value_label.setBounds(1010, 270, 150, 50);
        price3_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        third_panel.add(price3_value_label);
        
//         JButton kawasaki_edit_button=new JButton("Edit");
//        kawasaki_edit_button.setBackground(new Color(255,40,53));
//        kawasaki_edit_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
//        kawasaki_edit_button.setBounds(1250,150,120,50);
//        third_panel.add(kawasaki_edit_button);
        
        JButton kawasaki_update_button=new JButton("Update");
        kawasaki_update_button.setBackground(new Color(255,40,53));
        kawasaki_update_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        kawasaki_update_button.setBounds(1250,230,120,50);
        third_panel.add(kawasaki_update_button);
        
        
        
        
        
        
        
//        Fourth panel section
        JPanel fourth_panel = new JPanel();
        fourth_panel.setBounds(0, 1210, 1450, 370);
        fourth_panel.setBackground(new Color(62,53,53));
        fourth_panel.setLayout(null);
        contentPanel.add(fourth_panel);
        fourth_panel.setBorder(border);
        
         ImageIcon royal_image=new ImageIcon(getClass().getResource("/images/Royalenfield.png"));
        Image original_royal_image=royal_image.getImage();
        Image resized_royal_image= original_royal_image.getScaledInstance(500, 360,Image.SCALE_SMOOTH);
        ImageIcon complete_royal_image=new  ImageIcon(resized_royal_image);
        JLabel royal_image_label= new JLabel(complete_royal_image);
        royal_image_label.setBounds(5,5,500,360);
        fourth_panel.add(royal_image_label);
        
        JLabel royal_text = new JLabel("Royal Enfield Classic 350");
        royal_text.setOpaque(true);
        royal_text.setBackground(new Color(62,53,53));
        royal_text.setForeground(new Color(245, 167, 10)); // Set text color to make it visible
        royal_text.setBounds(700, 10, 300, 50);
        royal_text.setFont(new Font("Times New Roman", Font.BOLD, 26));
        fourth_panel.add(royal_text);
        
        JLabel engine4_label=new JLabel("Engine");
        engine4_label.setOpaque(true);
        engine4_label.setBackground(new Color(62,53,53));
        engine4_label.setForeground(Color.WHITE);
        engine4_label.setBounds(580, 70, 150, 50);
        engine4_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        fourth_panel.add(engine4_label);
        
         JTextField engine4_value_label=new  JTextField("349 cc");
        engine4_value_label.setOpaque(true);
        engine4_value_label.setBackground(new Color(62,53,53));
        engine4_value_label.setForeground(Color.WHITE);
        engine4_value_label.setBounds(1020, 70, 150, 50);
        engine4_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
         fourth_panel.add(engine4_value_label);
        
        
        JLabel torque4_label=new JLabel("Torque");
        torque4_label.setOpaque(true);
        torque4_label.setBackground(new Color(62,53,53));
        torque4_label.setForeground(Color.WHITE);
        torque4_label.setBounds(580, 120, 150, 50);
        torque4_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        fourth_panel.add(torque4_label);
        
         JTextField torque4_value_label=new  JTextField("19.9 ft-lbs");
        torque4_value_label.setOpaque(true);
        torque4_value_label.setBackground(new Color(62,53,53));
        torque4_value_label.setForeground(Color.WHITE);
        torque4_value_label.setBounds(980, 120, 200, 50);
        torque4_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
         fourth_panel.add(torque4_value_label);
        
        
        
        JLabel speed4_label=new JLabel("Top Speed");
        speed4_label.setOpaque(true);
        speed4_label.setBackground(new Color(62,53,53));
        speed4_label.setForeground(Color.WHITE);
        speed4_label.setBounds(580, 170, 150, 50);
        speed4_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
         fourth_panel.add(speed4_label);
        
         JTextField speed4_value_label=new  JTextField("170 Kmph");
        speed4_value_label.setOpaque(true);
        speed4_value_label.setBackground(new Color(62,53,53));
        speed4_value_label.setForeground(Color.WHITE);
        speed4_value_label.setBounds(980, 170, 150, 50);
        speed4_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        fourth_panel.add(speed4_value_label);
        
        
        JLabel color4_label=new JLabel("Color");
        color4_label.setOpaque(true);
        color4_label.setBackground(new Color(62,53,53));
        color4_label.setForeground(Color.WHITE);
        color4_label.setBounds(580, 220, 150, 50);
        color4_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        fourth_panel.add(color4_label);
        
         JTextField color4_value_label=new  JTextField("Crome Red");
        color4_value_label.setOpaque(true);
        color4_value_label.setBackground(new Color(62,53,53));
        color4_value_label.setForeground(Color.WHITE);
        color4_value_label.setBounds(980, 220, 150, 50);
        color4_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
         fourth_panel.add(color4_value_label);
        
        JLabel price4_label=new JLabel("Price Per Day");
        price4_label.setOpaque(true);
        price4_label.setBackground(new Color(62,53,53));
        price4_label.setForeground(Color.WHITE);
        price4_label.setBounds(580, 270, 150, 50);
        price4_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
         fourth_panel.add(price4_label);
        
         JTextField price4_value_label=new  JTextField("Rs 4000");
        price4_value_label.setOpaque(true);
        price4_value_label.setBackground(new Color(62,53,53));
        price4_value_label.setForeground(Color.WHITE);
        price4_value_label.setBounds(1000, 270, 150, 50);
        price4_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
         fourth_panel.add(price4_value_label);
        
//         JButton royal_edit_button=new JButton("Edit");
//        royal_edit_button.setBackground(new Color(255,40,53));
//        royal_edit_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
//       royal_edit_button.setBounds(1250,150,120,50);
//        fourth_panel.add(royal_edit_button);
        
        JButton royal_update_button=new JButton("Update");
        royal_update_button.setBackground(new Color(255,40,53));
        royal_update_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        royal_update_button.setBounds(1250,230,120,50);
        fourth_panel.add(royal_update_button);
        
        
//        // Create panel
        JPanel create_panel = new JPanel();
        create_panel.setBounds(0, 1580, 1450, 370);
        create_panel.setBackground(new Color(62, 53, 53));
        create_panel.setLayout(null);
        contentPanel.add(create_panel);
        create_panel.setBorder(border);
 
        vehicle_name = new JTextField("");
        vehicle_name.setOpaque(true);
        vehicle_name.setBackground(new Color(62, 53, 53));
        vehicle_name.setForeground(new Color(245, 167, 10)); // Set text color to make it visible
        vehicle_name.setBounds(740, 10, 300, 50);
        vehicle_name.setFont(new Font("Times New Roman", Font.BOLD, 26));
        create_panel.add(vehicle_name);
 
        JLabel engine5_label = new JLabel("Engine");
        engine5_label.setOpaque(true);
        engine5_label.setBackground(new Color(62, 53, 53));
        engine5_label.setForeground(Color.WHITE);
        engine5_label.setBounds(580, 70, 150, 50);
        engine5_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        create_panel.add(engine5_label);
 
        engine5_value_label = new JTextField("");
        engine5_value_label.setOpaque(true);
        engine5_value_label.setBackground(new Color(62, 53, 53));
        engine5_value_label.setForeground(Color.WHITE);
        engine5_value_label.setBounds(930, 70, 200, 50);
        engine5_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        create_panel.add(engine5_value_label);
 
        JLabel torque5_label = new JLabel("Torque");
        torque5_label.setOpaque(true);
        torque5_label.setBackground(new Color(62, 53, 53));
        torque5_label.setForeground(Color.WHITE);
        torque5_label.setBounds(580, 120, 150, 50);
        torque5_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        create_panel.add(torque5_label);
 
        torque5_value_label = new JTextField("");
        torque5_value_label.setOpaque(true);
        torque5_value_label.setBackground(new Color(62, 53, 53));
        torque5_value_label.setForeground(Color.WHITE);
        torque5_value_label.setBounds(1020, 120, 200, 50);
        torque5_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        create_panel.add(torque5_value_label);
 
        JLabel speed5_label = new JLabel("Top Speed");
        speed5_label.setOpaque(true);
        speed5_label.setBackground(new Color(62, 53, 53));
        speed5_label.setForeground(Color.WHITE);
        speed5_label.setBounds(580, 170, 150, 50);
        speed5_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        create_panel.add(speed5_label);
 
        speed5_value_label = new JTextField("");
        speed5_value_label.setOpaque(true);
        speed5_value_label.setBackground(new Color(62, 53, 53));
        speed5_value_label.setForeground(Color.WHITE);
        speed5_value_label.setBounds(1010, 170, 150, 50);
        speed5_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        create_panel.add(speed5_value_label);
 
        JLabel color5_label = new JLabel("Color");
        color5_label.setOpaque(true);
        color5_label.setBackground(new Color(62, 53, 53));
        color5_label.setForeground(Color.WHITE);
        color5_label.setBounds(580, 220, 150, 50);
        color5_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        create_panel.add(color5_label);
 
        color5_value_label = new JTextField("");
        color5_value_label.setOpaque(true);
        color5_value_label.setBackground(new Color(62, 53, 53));
        color5_value_label.setForeground(Color.WHITE);
        color5_value_label.setBounds(1040, 220, 150, 50);
        color5_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        create_panel.add(color5_value_label);
 
        JLabel price5_label = new JLabel("Price Per Day");
        price5_label.setOpaque(true);
        price5_label.setBackground(new Color(62, 53, 53));
        price5_label.setForeground(Color.WHITE);
        price5_label.setBounds(580, 270, 150, 50);
        price5_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        create_panel.add(price5_label);
 
        price5_value_label = new JTextField("");
        price5_value_label.setOpaque(true);
        price5_value_label.setBackground(new Color(62, 53, 53));
        price5_value_label.setForeground(Color.WHITE);
        price5_value_label.setBounds(1020, 270, 150, 50);
        price5_value_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        create_panel.add(price5_value_label);
 
        JButton create_button = new JButton("Create");
        create_button.setBackground(new Color(255, 40, 53));
        create_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        create_button.setBounds(1250, 100, 120, 50);
        create_panel.add(create_button);
 
        
        JButton update_button = new JButton("Update");
        update_button.setBackground(new Color(255, 40, 53));
        update_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        update_button.setBounds(1250, 160, 120, 50);
        create_panel.add(update_button);
        
         JButton delete_button = new JButton("Delete");
        delete_button.setBackground(new Color(255, 40, 53));
        delete_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        delete_button.setBounds(1250, 220, 120, 50);
        create_panel.add(delete_button);
        
        JButton image_button = new JButton("Choose Image");
        image_button.setBackground(new Color(255, 40, 53));
        image_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        image_button.setBounds(150, 320, 150, 50);
        create_panel.add(image_button);
 
        // Image display panel
        image_display_label = new JLabel();
        image_display_label.setBounds(5, 5, 500, 360);
        image_display_label.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        create_panel.add(image_display_label);
 
        image_button.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                selectedImageFile = fileChooser.getSelectedFile();
                ImageIcon imageIcon = new ImageIcon(selectedImageFile.getPath());
                Image image = imageIcon.getImage().getScaledInstance(image_display_label.getWidth(), image_display_label.getHeight(), Image.SCALE_SMOOTH);
                image_display_label.setIcon(new ImageIcon(image));
            }
        });
 
        create_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createVehicle();
            }
        });
        
          update_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateVehicle();
            }
        });
    
    
     delete_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteVehicle();
            }
        });
     
      setVisible(true);
    }
    private void createVehicle() {
        String url = "jdbc:mysql://localhost:3306/project";
        String user = "root";
        String password = "root";
 
        String vehicleName = vehicle_name.getText();
        String engine = engine5_value_label.getText();
        String torque = torque5_value_label.getText();
        String topSpeed = speed5_value_label.getText();
        String color = color5_value_label.getText();
        String pricePerDay = price5_value_label.getText();
        String imagePath = (selectedImageFile != null) ? selectedImageFile.getPath() : "";
 
        String sql = "INSERT INTO bike_details (vehicle_name, engine, torque, top_speed, color, price_per_day, image_path) VALUES (?, ?, ?, ?, ?, ?, ?)";
 
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            pstmt.setString(1, vehicleName);
            pstmt.setString(2, engine);
            pstmt.setString(3, torque);
            pstmt.setString(4, topSpeed);
            pstmt.setString(5, color);
            pstmt.setString(6, pricePerDay);
            pstmt.setString(7, imagePath);
 
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vehicle created successfully!");
 
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error creating vehicle.");
        }
    }
    
     private void updateVehicle() {
        String url = "jdbc:mysql://localhost:3306/project";
        String user = "root";
        String password = "root";
 
        String vehicleName = vehicle_name.getText();
        String engine = engine5_value_label.getText();
        String torque = torque5_value_label.getText();
        String topSpeed = speed5_value_label.getText();
        String color = color5_value_label.getText();
        String pricePerDay = price5_value_label.getText();
        String imagePath = (selectedImageFile != null) ? selectedImageFile.getPath() : "";
 
        String sql = "UPDATE bike_details SET engine = ?, torque = ?, top_speed = ?, color = ?, price_per_day = ?, image_path = ? WHERE vehicle_name = ?";
 
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            pstmt.setString(1, engine);
            pstmt.setString(2, torque);
            pstmt.setString(3, topSpeed);
            pstmt.setString(4, color);
            pstmt.setString(5, pricePerDay);
            pstmt.setString(6, imagePath);
            pstmt.setString(7, vehicleName);
 
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Vehicle updated successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "No vehicle found with the given name.");
            }
 
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating vehicle.");
        }
    }
     
    private void deleteVehicle() {
    String url = "jdbc:mysql://localhost:3306/project";
    String user = "root";
    String password = "root";
 
    String vehicleName = vehicle_name.getText();
 
    String sql = "DELETE FROM bike_details WHERE vehicle_name = ?";
 
    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
        pstmt.setString(1, vehicleName);
 
        int rowsAffected = pstmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Vehicle deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "No vehicle found with the given name.");
        }
 
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error deleting vehicle.");
    }
    
   
}
 
    public static void main(String[] args) {
        admin_two_wheeler t = new admin_two_wheeler();
        t.setVisible(true);
    }
}