package com.sda.weather.backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Localizations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String city;
    private String latitude;
    private String longitude;
    private String country;
    private String region;

    public Localizations() {
    }

    public Localizations(long id, String city, String latitude, String longitude, String country, String region) {
        this.id = id;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
        this.region = region;
    }

    @Override
    public String toString() {
        return "Localizations{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
