package com.sda.weather.backend;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Localizations {
    public Localizations(String city, String latitude, String longitude, String country, String region) {
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
        this.region = region;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String city;
    private String latitude;
    private String longitude;
    private String country;
    private String region;

}
