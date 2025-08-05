package com.eng.bookmyshow.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "region")
public class Region extends BaseModel {
    private String name;
}
