package com.eng.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter@Setter@Entity
public class Booking extends BaseModel{
    private Date bookingDate;
    @ManyToOne
    private Show show;
    @ManyToOne
    private User user;
    @ManyToMany
    private List<ShowSeat> seats;
    @OneToMany
    private List<Payment> payments;
}
