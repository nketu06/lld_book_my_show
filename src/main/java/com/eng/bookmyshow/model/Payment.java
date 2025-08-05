package com.eng.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends  BaseModel{
    private Date paymentDate;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    private double totalAmount;
    private String refNumber;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    @ManyToOne
    private Booking booking;
}
