package com.eng.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter@Entity(name = "users")
public class User extends BaseModel{
    private String username;
    private String email;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Booking> booking;
}
