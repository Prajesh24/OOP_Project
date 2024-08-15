/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project.Model;


public class user_loginModel {
    private String username_field;

    private String password_field;
    
    public user_loginModel(String username_field,String password_field){
        this.username_field = username_field;
        this.password_field=password_field;
        
        
        
    }
    
    
    public String getusername_field() {
        return username_field;
    }

    public void setUsername_field(String username_field) {
        this.username_field = username_field;
    }

    public String getpassword_field() {
        return password_field;
    }

    public void setpassword_field(String password_field) {
        this.password_field = password_field;
    }

    
 }

