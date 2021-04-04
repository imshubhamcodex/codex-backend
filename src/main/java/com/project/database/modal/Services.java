package com.project.database.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Services {

    @Id
    @Column(name = "Service_Id")
    private Integer Service_Id;

    @Column(name = "Service_Type")
    private String Service_Type;

    @GeneratedValue
    @Column(name="sl_no")
    private Integer sl_no;

    public Services(){
        
    }

    public Integer getService_Id() {
        return Service_Id;
    }

    public void setService_Id(Integer service_Id) {
        Service_Id = service_Id;
    }

    public String getService_Type() {
        return Service_Type;
    }

    public void setService_Type(String service_Type) {
        Service_Type = service_Type;
    }

    public Integer getSl_no() {
        return sl_no;
    }

    public void setSl_no(Integer sl_no) {
        this.sl_no = sl_no;
    }
}
