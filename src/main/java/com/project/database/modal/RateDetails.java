package com.project.database.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RateDetails {
    
    @Id
    @Column(name="sl_no")
    private Integer sl_no;

    @Column(name="Service_id")
    private int Service_id;

    @Column(name="Provider_id")
    private int Provider_id;

    @Column(name="Rate")
    private double Rate;

    @Column(name="Discounted_Rate")
    private double Discounted_rate;

    public RateDetails(){
        
    }

    public int getService_id() {
        return Service_id;
    }
    public void setService_id(int service_id) {
        Service_id = service_id;
    }
    public int getProvider_id() {
        return Provider_id;
    }
    public void setProvider_id(int provider_id) {
        Provider_id = provider_id;
    }
    public double getRate() {
        return Rate;
    }
    public void setRate(double rate) {
        Rate = rate;
    }
    
    public Integer getSl_no() {
        return sl_no;
    }

    public void setSl_no(Integer sl_no) {
        this.sl_no = sl_no;
    }

    public double getDiscounted_rate() {
        return Discounted_rate;
    }

    public void setDiscounted_rate(double discounted_rate) {
        Discounted_rate = discounted_rate;
    }
}
