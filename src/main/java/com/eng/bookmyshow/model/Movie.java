package com.eng.bookmyshow.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String title;
    private String year;
    private String director;
    private String genre;
    private String rating;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Features> movieFeatures;
}
