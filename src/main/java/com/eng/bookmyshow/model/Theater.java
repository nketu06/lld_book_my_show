package com.eng.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter@Entity
public class Theater extends BaseModel{
    private String theaterName;
    private String address;
    @OneToMany
    private List<Screen> screens;
}
