package com.sda.weather.backend;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class LocalizationService {

    private final LocalizationRepository localizationRepository;

    public Localizations createNewLocalization(String city, String latitude, String longitude, String country, String region) {
        if (city == null || city.isBlank() || country == null || country.isBlank()) {
            throw new RuntimeException("Miasto lub Kraj nie może być puste");
        }
        float latitudeFloat = Float.parseFloat(latitude);

        if (latitudeFloat > 90 || latitudeFloat < -90) {
            throw new RuntimeException("szerokość musi być w przedziale -90 do 90 ");
        }
        float longitudeFloat = Float.parseFloat(longitude);
        if (longitudeFloat > 180 || longitudeFloat < -180) {
            throw new RuntimeException("Długość Geograficzna musi być w przedziale od -180 do 180 ");
        }

        Localizations localizations = new Localizations(city, latitude, longitude, country, region);

        return localizationRepository.saveLocalization(localizations);
    }

    public List<Localizations> readAllLocalizations() {
        return localizationRepository.readAllLocalizations();
    }
}
