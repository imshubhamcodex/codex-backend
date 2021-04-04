package com.project.database.modal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Provider {
    
    @Column(name="sl_no")
    private Integer sl_no;

    @Column(name="Provider_type")
    private String Provider_type;

    @Column(name="Organization_id")
    private int Organization_id;

    @Column(name="Organization_name")
    private String Organization_name;

    @Column(name="Provider_name")
    private String Provider_name;

    @Column(name="Email_id")
    private String Email_id;

    @Column(name="Phone_Number")
    private int Phone_number;

    @Id
    @Column(name="Provider_id")
    private int Provider_id;

    public Provider(){

    }

    public String getProvider_type() {
        return Provider_type;
    }

    public void setProvider_type(String provider_type) {
        Provider_type = provider_type;
    }

    public int getOrganization_id() {
        return Organization_id;
    }

    public void setOrganization_id(int organization_id) {
        Organization_id = organization_id;
    }

    public String getOrganization_name() {
        return Organization_name;
    }

    public void setOrganization_name(String organization_name) {
        Organization_name = organization_name;
    }

    public String getProvider_name() {
        return Provider_name;
    }

    public void setProvider_name(String provider_name) {
        Provider_name = provider_name;
    }

    public String getEmail_id() {
        return Email_id;
    }

    public void setEmail_id(String email_id) {
        Email_id = email_id;
    }

    

    public int getProvider_id() {
        return Provider_id;
    }

    public void setProvider_id(int provider_id) {
        Provider_id = provider_id;
    }

    public int getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(int phone_number) {
        Phone_number = phone_number;
    }

    public Integer getSl_no() {
        return sl_no;
    }

    public void setSl_no(Integer sl_no) {
        this.sl_no = sl_no;
    }
}
