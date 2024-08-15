/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project.Model;

public class user_signupModel {
    private String username_field;

    private String address_field;
    private String set_field;
    private String contact_field;
    private String confirm_field;
    private String email_field;
    private String citizenship_field;
    private String license_field;
    
    public user_signupModel(String username_field,String address_field, String set_field,String contact_field,
            String confirm_field,String email_field,String citizenship_field,String license_field  ){
        this.username_field = username_field;
        this.address_field=address_field;
        this.set_field=set_field;
        this.contact_field=contact_field;
        this.confirm_field=confirm_field;
        this.email_field=email_field;
        this.citizenship_field=citizenship_field;
        this.license_field =license_field ;
        
        
    }
    
    public String getUsername_field() {
        return username_field;
    }
    public void setUsername_field(String username_field) {
        this.username_field = username_field;
    }
    public String getAddress_field() {
        return address_field;
    }
    public void setAddress_field(String address_field) {
        this.address_field = address_field;
    }
    public String getSet_field() {
        return set_field;
    }
    public void setSet_field(String set_field) {
        this.set_field = set_field;
    }
    public String getContact_field() {
        return contact_field;
    }
    public void setContact_field(String contact_field) {
        this.contact_field = contact_field;
    }
    public String getConfirm_field() {
        return confirm_field;
    }
    public void setConfirm_field(String confirm_field) {
        this.confirm_field = confirm_field;
    }

    public String getEmail_field() {
        return email_field;
    }

    public void setEmail_field(String email_field) {
        this.email_field = email_field;
    }

    public String getCitizenship_field() {
        return citizenship_field;
    }

    public void setCitizenship_field(String citizenship_field) {
        this.citizenship_field = citizenship_field;
    }

    public String getLicense_field() {
        return license_field;
    }

    public void setLicense_field(String license_field) {
        this.license_field = license_field;
    }
}