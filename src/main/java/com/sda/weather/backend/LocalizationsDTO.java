package com.sda.weather.backend;

import lombok.Data;

@Data
public class LocalizationsDTO {
    private String city;
    private String region;
    private String country;
    private float longitude;
    private float latitude;
}
