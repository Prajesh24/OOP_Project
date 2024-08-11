/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project.View;
import Database.MySqlConnection;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
public class user_forgot_password extends JFrame {
 
    public user_forgot_password() {
        setSize(1450, 900);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
 
        JLabel forgot_text = new JLabel("FORGOT PASSWORD");
        forgot_text.setForeground(new Color(0, 0, 0));
        forgot_text.setFont(new Font("AERIAL", Font.PLAIN, 36));
        forgot_text.setBounds(50, 40, 350, 60);
        add(forgot_text);
 
        JLabel request_text = new JLabel("Please provide your details and update your password");
        request_text.setForeground(new Color(255, 0, 0));
        request_text.setFont(new Font("AERIAL", Font.PLAIN, 20));
        request_text.setBounds(50, 90, 550, 60);
        add(request_text);
 
        ImageIcon fogot_image = new ImageIcon(getClass().getResource("/images/forgot_image.png"));
        Image fogot_original_image = fogot_image.getImage();
        Image fogot_resized_image = fogot_original_image.getScaledInstance(850, 900, Image.SCALE_SMOOTH);
        ImageIcon fogot_complete_image = new ImageIcon(fogot_resized_image);
        JLabel fogot_image_label = new JLabel(fogot_complete_image);
        fogot_image_label.setBounds(600, 0, 850, 900);
        add(fogot_image_label);
 
        JLabel lisence_text = new JLabel("License Number");
        lisence_text.setForeground(new Color(0, 0, 0));
        lisence_text.setFont(new Font("AERIAL", Font.PLAIN, 20));
        lisence_text.setBounds(100, 160, 300, 60);
        add(lisence_text);
 
        JTextField lisence_field = new JTextField();
        lisence_field.setBounds(95, 220, 250, 45);
        add(lisence_field);
 
        JLabel citizen_text = new JLabel("Citizenship Number");
        citizen_text.setForeground(new Color(0, 0, 0));
        citizen_text.setFont(new Font("AERIAL", Font.PLAIN, 20));
        citizen_text.setBounds(100, 270, 300, 60);
        add(citizen_text);
 
        JTextField citizen_field = new JTextField();
        citizen_field.setBounds(95, 330, 250, 45);
        add(citizen_field);
 
        JLabel update_text = new JLabel("Update Password");
        update_text.setForeground(new Color(0, 0, 0));
        update_text.setFont(new Font("AERIAL", Font.PLAIN, 20));
        update_text.setBounds(100, 380, 300, 60);
        add(update_text);
 
        JPasswordField update_field = new JPasswordField();
        update_field.setBounds(95, 440, 250, 45);
        add(update_field);
 
        JLabel passwords_text = new JLabel("Confirm Password");
        passwords_text.setForeground(new Color(0, 0, 0));
        passwords_text.setFont(new Font("AERIAL", Font.PLAIN, 20));
        passwords_text.setBounds(100, 490, 300, 60);
        add(passwords_text);
 
        JPasswordField password_field = new JPasswordField();
        password_field.setBounds(95, 550, 250, 45);
        add(password_field);
 
        JButton update_button = new JButton("Update");
        update_button.setBounds(140, 630, 150, 45);
        add(update_button);
 
        JButton login_button = new JButton("Login");
        login_button.setBounds(140, 710, 150, 45);
        add(login_button);
 
        update_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String licenseNumber = lisence_field.getText();
                String citizenshipNumber = citizen_field.getText();
                String newPassword = new String(update_field.getPassword());
                String confirmPassword = new String(password_field.getPassword());
 
                if (!newPassword.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(null, "Passwords do not match");
                    return;
                }
 
                MySqlConnection db = new MySqlConnection();
                Connection conn = db.openConnection();
                if (conn != null) {
                    try {
                        // Check if the user exists
                        String checkQuery = "SELECT * FROM signin WHERE license_num = ? AND citizenship_num = ?";
                        PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
                        checkStmt.setString(1, licenseNumber);
                        checkStmt.setString(2, citizenshipNumber);
                        ResultSet rs = checkStmt.executeQuery();
 
                        if (rs.next()) {
                            // Update the password
                            String updateQuery = "UPDATE signin SET set_password = ? WHERE license_num = ? AND citizenship_num = ?";
                            PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
                            updateStmt.setString(1, newPassword);
                            updateStmt.setString(2, licenseNumber);
                            updateStmt.setString(3, citizenshipNumber);
                            updateStmt.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Password updated successfully");
                        } else {
                            JOptionPane.showMessageDialog(null, "User not found");
                        }
 
                        db.closeConnection(conn);
                    } catch (Exception ex) {
                        System.out.println(ex);
                        JOptionPane.showMessageDialog(null, "An error occurred while updating the password");
                    }
                }
            }
        });
 
        login_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new user_admin_login();
                dispose(); // Close the current frame
            }
        });
        setVisible(true);
    }
}

