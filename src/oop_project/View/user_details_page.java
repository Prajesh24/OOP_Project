/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project.View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class user_details_page extends JFrame {
    private JTextField pick_field;
    private JTextField model_field;
    private JTextField drop_field;
    private JTextField location_field;
    private JTextField contact_field;
    private JTextField amount_field;
    private JTextField total_field;
    private JComboBox<String> type_combo;
 
    user_details_page() {
        setSize(1450, 900);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
 
        ImageIcon logo_image = new ImageIcon(getClass().getResource("/images/logo.jpg"));
        Image original_logo_image = logo_image.getImage();
        Image resized_logo_image = original_logo_image.getScaledInstance(150, 70, Image.SCALE_SMOOTH);
        ImageIcon complete_logo_image = new ImageIcon(resized_logo_image);
        JLabel logo_image_label = new JLabel(complete_logo_image);
        logo_image_label.setBounds(0, 0, 150, 70);
        add(logo_image_label);
        
        
        ImageIcon bill_image=new ImageIcon(getClass().getResource("/images/bill.jpeg"));
        Image original_bill_image=bill_image.getImage();
        Image resized_bill_image= original_bill_image.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        ImageIcon complete_bill_image=new  ImageIcon(resized_bill_image);
        JButton bill_image_button= new JButton(complete_bill_image);
        bill_image_button.setBounds(1300,10,60,60);
        add(bill_image_button);
        
        bill_image_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BillPage billPage = new BillPage();
                   billPage.setVisible(true);
 
//                dispose(); // Close the current HomePage
            }
        });
 
        JPanel top_panel = new JPanel();
        top_panel.setBounds(150, 0, 1350, 70);
        top_panel.setBackground(Color.WHITE);
        add(top_panel);
 
        JLabel type_text = new JLabel("Vehicle Type");
        type_text.setForeground(new Color(255, 107, 0));
        type_text.setFont(new Font("AERIAL", Font.PLAIN, 20));
        type_text.setBounds(300, 160, 300, 60);
        add(type_text);
 
        String[] vehicle_types = {"Two Wheeler", "Four Wheeler"};
        type_combo = new JComboBox<>(vehicle_types);
        type_combo.setBounds(295, 210, 250, 45);
        type_combo.setBackground(new Color(121, 117, 117));
        add(type_combo);
 
        JLabel pick_text = new JLabel("Pick-Up Date");
        pick_text.setForeground(new Color(255, 107, 0));
        pick_text.setFont(new Font("AERIAL", Font.PLAIN, 20));
        pick_text.setBounds(950, 160, 300, 60);
        add(pick_text);
 
        pick_field = new JTextField();
        pick_field.setBounds(945, 210, 250, 45);
        pick_field.setBackground(new Color(121, 117, 117));
        add(pick_field);
 
        JLabel model_text = new JLabel("Vehicle Model");
        model_text.setForeground(new Color(255, 107, 0));
        model_text.setFont(new Font("AERIAL", Font.PLAIN, 20));
        model_text.setBounds(300, 280, 300, 60);
        add(model_text);
 
        model_field = new JTextField();
        model_field.setBounds(295, 330, 250, 45);
        model_field.setBackground(new Color(121, 117, 117));
        add(model_field);
 
        JLabel drop_text = new JLabel("Drop-Off Date");
        drop_text.setForeground(new Color(255, 107, 0));
        drop_text.setFont(new Font("AERIAL", Font.PLAIN, 20));
        drop_text.setBounds(950, 280, 300, 60);
        add(drop_text);
 
        drop_field = new JTextField();
        drop_field.setBounds(945, 330, 250, 45);
        drop_field.setBackground(new Color(121, 117, 117));
        add(drop_field);
 
        JLabel location_text = new JLabel("Location");
        location_text.setForeground(new Color(255, 107, 0));
        location_text.setFont(new Font("AERIAL", Font.PLAIN, 20));
        location_text.setBounds(300, 400, 300, 60);
        add(location_text);
 
        location_field = new JTextField();
        location_field.setBounds(295, 450, 250, 45);
        location_field.setBackground(new Color(121, 117, 117));
        add(location_field);
 
        JLabel contact_text = new JLabel("Contact Number");
        contact_text.setForeground(new Color(255, 107, 0));
        contact_text.setFont(new Font("AERIAL", Font.PLAIN, 20));
        contact_text.setBounds(950, 400, 300, 60);
        add(contact_text);
 
        contact_field = new JTextField();
        contact_field.setBounds(945, 450, 250, 45);
        contact_field.setBackground(new Color(121, 117, 117));
        add(contact_field);
 
        JLabel amount_text = new JLabel("Rental Duration");
        amount_text.setForeground(new Color(255, 107, 0));
        amount_text.setFont(new Font("AERIAL", Font.PLAIN, 20));
        amount_text.setBounds(300, 520, 300, 60);
        add(amount_text);
 
        amount_field = new JTextField();
        amount_field.setBounds(295, 570, 250, 45);
        amount_field.setBackground(new Color(121, 117, 117));
        add(amount_field);
 
        JLabel total_text = new JLabel("Total Amount");
        total_text.setForeground(new Color(255, 107, 0));
        total_text.setFont(new Font("AERIAL", Font.PLAIN, 20));
        total_text.setBounds(950, 520, 300, 60);
        add(total_text);
 
        total_field = new JTextField();
        total_field.setBounds(945, 570, 250, 45);
        total_field.setBackground(new Color(121, 117, 117));
        add(total_field);
 
        JButton proceed_button = new JButton("Proceed");
        proceed_button.setBounds(680, 700, 150, 45);
        add(proceed_button);
 
        proceed_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertData();
            }
        });
        
        
        JButton payment_button = new JButton("Online Payment");
       payment_button.setBounds(680, 800, 150, 45);
        add(payment_button);
 
        payment_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user_payment_page payment=new user_payment_page();
                payment.setVisible(true);
            }
        });
        
        
        
        setVisible(true);
        
        
    }
 
    private boolean isValidDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        try {
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
 
    private void insertData() {
        String url = "jdbc:mysql://localhost:3306/project";
        String user = "root";
        String password = "root";
 
        String type = (String) type_combo.getSelectedItem();
        String pickDate = pick_field.getText();
        String model = model_field.getText();
        String dropDate = drop_field.getText();
        String location = location_field.getText();
        String contact = contact_field.getText();
        String amountText = amount_field.getText();
        String totalText = total_field.getText();
 
        // Validate dates
        if (!isValidDate(pickDate) || !isValidDate(dropDate)) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please use YYYY-MM-DD.");
            return;
        }
 
        // Validate numeric fields
        int amount;
        int total;
        try {
            amount = Integer.parseInt(amountText);
            total = Integer.parseInt(totalText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Rental duration and total amount must be numeric.");
            return;
        }
 
        String sql = "INSERT INTO user_details (vehicle_type, pick_up_date, vehicle_model, drop_off_date, location, contact_number, rental_duration, total_amount) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
 
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            pstmt.setString(1, type);
            pstmt.setString(2, pickDate);
            pstmt.setString(3, model);
            pstmt.setString(4, dropDate);
            pstmt.setString(5, location);
            pstmt.setString(6, contact);
            pstmt.setInt(7, amount);
            pstmt.setInt(8, total);
 
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Your ride has been successfully rented");
 
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error renting.");
        }
    }
 
    public static void main(String[] args) {
        user_details_page details = new user_details_page();
        details.setVisible(true);
    }
}
